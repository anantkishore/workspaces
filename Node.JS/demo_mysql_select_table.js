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
        
        //var sql = "SELECT NAME FROM CUSTOMER WHERE ADDRESS LIKE 'H%'";
        /*var add = "Lowstreet 4";
        var sql = "SELECT NAME FROM CUSTOMER WHERE ADDRESS = " + mysql.escape(add);
        con.query(sql, function(err, result, fields) {
            if(err) 
                throw err;
            console.log(result);
        });*/
        /*var add = 'Lowstreet 4';
        var sql = "SELECT NAME FROM CUSTOMER WHERE ADDRESS = ?";
        con.query(sql, [add], function(err, result, fields) {
            if(err) 
                throw err;
            console.log(result);
        });*/
        /*var name = "Peter";
        var add = 'Lowstreet 4';
        var sql = "SELECT * FROM CUSTOMER WHERE ADDRESS = ? AND NAME = ?";
        con.query(sql, [add, name], function(err, result, fields) {
            if(err) 
                throw err;
            console.log(result);
        });*/
        var sql = "SELECT * FROM CUSTOMER ORDER BY NAME";
        con.query(sql, function(err, result, fields) {
            if(err)
                throw err;
            console.log(result);
        });
});

