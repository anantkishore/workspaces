var createError = require('http-errors');
var express = require('express');
var path = require('path');
var cookieParser = require('cookie-parser');
var logger = require('morgan');
var mongoose = require('mongoose');

var TeamMember = require("./models/TeamMemberSchema.js");
var Cab = require("./models/CabSchema.js");

var indexRouter = require('./routes/index');
var usersRouter = require('./routes/users');

var app = express();

app.use(express.json());

//set port
app.listen(3001);

mongoose.Promise = global.Promise;
mongoose.connect("mongodb://localhost:27017/caballocationservicedb", 
{ useNewUrlParser: true });

console.log("\nloaded\n");

// view engine setup
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'ejs');

app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));

app.use('/', indexRouter);
app.use('/users', usersRouter);

// 1)	POST /register 
app.post('/register', function(req, res) {
  console.log(req.body);     // your JSON
  var myData = new TeamMember(req.body);
  myData.save()
  .then(item => {
    res.send("item saved to database");
  })
  .catch(err => {
    res.status(400).send("unable to save to database");
  });
});

// 2)	POST /cabs 
app.post('/cabs', function(req, res) {
  console.log(req.body);
  var cabArray = req.body;
  cabArray.forEach(element => {
    console.log("fghjkgghfsdhjk");
    var cab = new Cab(element);
    cab.save()
    .then(item =>{
      res.send("items saved to Database");
    })
    .catch(err => {
      res.status(400).send("unable to save to database");
    });
  });
});

// 3)	POST /drop_points 
app.post('/drop_points', function(req, res) {
  console.log(req.body);
  res.send(req.body); 
});

// 4)	GET /route_plan 
app.get('/route_plan', function(req, res) {
  res.send('Route plan');
});

// catch 404 and forward to error handler
app.use(function(req, res, next) {
  next(createError(404));
});

// error handler
app.use(function(err, req, res, next) {
  // set locals, only providing error in development
  res.locals.message = err.message;
  res.locals.error = req.app.get('env') === 'development' ? err : {};

  // render the error page
  res.status(err.status || 500);
  res.render('error');
});


console.log('app started on port 3001');

module.exports = app;
