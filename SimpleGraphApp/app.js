const express = require('express')
const app = express()
var path = require('path')
var fs = require('fs')
var csv = require('fast-csv')

// Determine port to listen on
var port = (process.env.PORT || process.env.VCAP_APP_PORT || 3000);

//set the template engine ejs
app.set('view engine', 'ejs')
app.use('/static', express.static(path.join(__dirname, 'public')))
app.enable('trust proxy');

var server = app.listen(port, function() {
    console.log('Listening on port %d', port);
});

app.get('/index', (req, res) => {
    res.render('index')
})
app.get('/live', (req, res) => {
    res.render('live')
})
app.get('/api/v1/graphData', (req, res) => {
    fetchData(res);
})

//socket.io initialization
const io = require("socket.io")(server)

//listen on every connection and keep updating data
/*io.on('connection', (socket) => {
    console.log('New user connected');
    socket.emit('update');
    setInterval(function(){
        console.log("sending msg");
        socket.emit('update', {'date': new Date()});
    }, 60000);
})*/

var stream = fs.createReadStream("data.csv")
 
csv
 .fromStream(stream)
 .on("data", function(data){
     console.log(data);
 })
 .on("end", function(){
     console.log("done");
 });

function fetchData(res) {
    const csvtojsonV2 = require("csvtojson/v2");
    const csvFilePath = 'data.csv';
    const csv = require('csvtojson')
    var jsonResponse = [];
    csv()
    .fromFile(csvFilePath)
    .then((jsonObj) => {
            for(let i in jsonObj)
            {
                let x = parseInt(jsonObj[i].x, 10);
                let y = parseInt(jsonObj[i].y, 10);  
                let jsonArr = [];
                jsonArr.push(x);
                jsonArr.push(y);  
                jsonResponse.push(jsonArr);
            }
    })
    .then(() => {
        res.status(200).send(jsonResponse);
    })
}