var http = require('http');
var dt = require('./myfirstmodule')

http.createServer(function (req, res) {
    res.writeHead(200, {'Content-Type':'text/html'});
    res.end('Today\'s date time: ' + dt.myDateTime() );
}).listen(8080);