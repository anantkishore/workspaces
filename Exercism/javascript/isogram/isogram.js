module.exports.isIsogram = function(msg){
    if(msg.length < 2)
        return true;
    else{
        msg = msg.toLowerCase();
        console.log(msg);
        var charArr = new Array(256);
        for(var i = 0; i < 256; i++)
        {
            charArr[i] = 0;
        }
        for(var i = 0; i < msg.length; i++)
        {
            var item = msg.charCodeAt(i);
            //console.log(item);
            charArr[item] += 1;
        }
        
        for(var i = 0; i < 256; i++)
        {
            var element = charArr[i];

            if(element >= 2)
            {
                console.log(i+": "+element);
                if(i == 32 || i == 45)
                    continue;
                else
                    return false;
            }
        }
        return true;
    }
};