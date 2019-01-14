var mongoose = require('mongoose');
var Schema = mongoose.Schema;
/* 
{ 
  “team_member_id”: ”1”,
  “gender”: ”M”
  “drop_point”: ”pointC”
}
*/
var TeamMemberSchema = new Schema({
    team_member_id: {type: String, required: true},
    gender: {type: String, required: true},
    drop_point: {type: String, required: true}
  });

//Export model
module.exports = mongoose.model('TeamMember', TeamMemberSchema);
  