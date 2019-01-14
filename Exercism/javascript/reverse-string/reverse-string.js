module.exports.reverseString = function (msg) { 
    if(!msg) 
        return msg;
    var reverseStr = '';
    var len = msg.length;
    for(var i = len-1; i > -1; i--)
    {
        reverseStr += msg.charAt(i);
    }
    return reverseStr;
};