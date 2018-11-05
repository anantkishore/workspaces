var http = require('http');
var fs = require('fs');

http.createServer(function (req, res) {
    fs.readFile('demofile1.html', function(err, data) {
        res.writeHead(200, {'Content-Type': 'text/html'});
        res.write(data);
        res.end();
    });
    fs.appendFile('mynewtext.txt', 'appending content... ', function(err)
    {
        if(err) throw err;
        console.log('Saved.');
    });
    fs.open('mynewtextfile.txt', 'w', function(err){
        if(err) throw err;
        console.log('Saved.');
    });
    fs.writeFile('mynewtextfile.txt' , 'Hello world', function(err){
        if(err) throw err;
        console.log('Saved.');
    });
    fs.unlink('mynewtextfile.txt', function(err) {
        if(err) throw err;
        console.log('Deleted.');
    });
}).listen(8080);