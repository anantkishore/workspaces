var http = require('http');
var fs = require('fs');
var formidable = require('formidable');

http.createServer(function(req, res)
{
    if(req.url == '/upload')
    {
        var form = new formidable.IncomingForm();
        form.parse(req, function(err, fields, files ) {
            //console.log(files.filetoupload.File.path);
            var oldpath = files.filetoupload.path;
            var newpath = '/Anant/workspace/Node.JS/filestoupload/xyz';
            fs.rename(oldpath, newpath, function(err){
                if(err) throw err;
                res.write('File uploaded and moved!');
                res.end();
            });
        });
    }
    else{
    res.writeHead(200, {'Content-Type': 'text/html'});
    var htmltxt = "hello";
    console.log(htmltxt);
    fs.readFile('demo_file_upload.html', function(err, data) {
        //res.writeHead(200, {'Content-Type': 'text/html'});
        res.write(data);
        res.end();
    });
}
   
}).listen('8080');
