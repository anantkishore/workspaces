var createError = require('http-errors');
var express = require('express');
var path = require('path');
var fs = require('fs');
var request = require('request');
var cheerio = require('cheerio');
var cookieParser = require('cookie-parser');
var logger = require('morgan');

var indexRouter = require('./routes/index');
var usersRouter = require('./routes/users');

var app = express();

// view engine setup
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'jade');

app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));

app.use('/', indexRouter);
app.use('/users', usersRouter);

// catch 404 and forward to error handler
/*app.use(function(req, res, next) {
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
});*/

app.get('/scrape', function(req,res) {

  url = 'https://www.glassdoor.co.in/Job/dublin-sponsorship-jobs-SRCH_IL.0,6_IC2739035_KO7,18.htm';
  console.log(req.param('url'));
  request(url, function(error, response, html){

    if(!error)
    {
      var $ = cheerio.load(html);
      
      console.log(typeof(response));

      var myJSON = JSON.stringify(response);

      //console.log(myJSON);

      var lines = myJSON.split("\n");

      try {
        
          lines.forEach(element => {
            if(element.indexOf("sponsorship") != -1 || element.indexOf("Sponsorship") != -1)
            {
              fs.writeFile('output.txt', element, function(err){
                console.log('File Successfully written!- check your project dir for output.txt');
              })
            }
          });

      }
      catch(err)
      {
        console.log(err);
      }
      //console.log($);



      var title, release, rating;
      var json = { title : "", release : "", rating : ""};

      $('.header').filter(function(){

          var data = $(this);

          title = data.children().first().text();

          release = data.children().last().children().text();

          json.title = title;

          json.release = release;
      })

      $('.star-box-giga-star').filter(function(){

          var data = $(this);

          rating = data.text();

          json.rating = rating;
      })
    }
    else{
      console.log('error occured');
    }

    fs.writeFile('output.json', JSON.stringify(json, null, 4), function(err){
      console.log('File Successfully written!- check your project dir for output.json');
    })

    res.send('check console');
  })
});

app.get('/home', function(req, res) {
    res.sendFile('index.html', { root: __dirname + "/views"} );
});

app.get('/notes', function(req, res) {
  res.sendFile('notes.html', { root: __dirname + "/views"} );
});

app.listen('8081');

console.log('Magic happens on port 8081');

exports = module.exports = app;
