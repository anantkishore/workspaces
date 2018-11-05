var mysql = require('mysql');

var con = mysql.createConnection({
    user: 'root',
    password: 'root1234',
    host: 'localhost'
});

con.connect(function(err)
{
    if(err)
        console.log(err);
    else
        console.log('Connection successful');
});

