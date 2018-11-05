var mysql = require('mysql');

var con = mysql.createConnection({
    user: 'root',
    password: 'root1234',
    host: 'localhost',
    database: 'NODE_MYSQL'
});

con.connect(function(err)
{
    if(err)
        throw err;
    else
        console.log('Connection successful.');
        var sql = "CREATE TABLE CUSTOMER (ID INT AUTO_INCREMENT PRIMARY KEY, NAME VARCHAR(255), ADDRESS VARCHAR(255))";
        con.query(sql, function(err, result) {
            if(err) 
                throw err;
            console.log("Table created.");
        });
});

