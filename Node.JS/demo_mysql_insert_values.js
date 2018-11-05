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
        var sql = "INSERT INTO CUSTOMER (NAME, ADDRESS) VALUES ?";
        var values = [
            ['John', 'Highway 71'],
            ['Peter', 'Lowstreet 4'],
            ['Amy', 'Apple st 652'],
            ['Hannah', 'Mountain 21'],
            ['Michael', 'Valley 345'],
            ['Sandy', 'Ocean blvd 2'],
            ['Betty', 'Green Grass 1'],
            ['Richard', 'Sky st 331'],
            ['Susan', 'One way 98'],
            ['Vicky', 'Yellow Garden 2'],
            ['Ben', 'Park Lane 38'],
            ['William', 'Central st 954'],
            ['Chuck', 'Main Road 989'],
            ['Viola', 'Sideway 1633']
          ];
        con.query(sql, [values], function(err, result) {
            if(err) 
                throw err;
            console.log("No of rows inserted: " + result);
        });
});

