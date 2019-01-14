var mongoose = require('mongoose');
var Schema = mongoose.Schema;
/* 
[
  { 
    “cab_id”:”1”,
    “cost”: 2
    “capacity”: 2
  }
]
*/
var CabSchema = new mongoose.Schema({
    cab_id: String,
    cost: String,
    capacity: String
  });

//Export model
module.exports = mongoose.model('Cab', CabSchema);
  