module.exports.hey = function(msg){

    var response = '';
    var small = false;
    var capital = false;

    for(var i = 0; i < msg.length; i++)
    {
          var item = msg.charCodeAt(i);
          if(97 <= item && item <= 122)
          {
              small = true;
          }
          if(65 <= item && item <= 90)
          {
            capital = true;
          }
    }

    if(msg.trim().length == 0)
      return 'Fine. Be that way!';
    
    if((small == 0  ) && msg.indexOf('?') != -1 && msg.indexOf('\n') != 0)
        //&& msg.indexOf('?') == msg.length-1)
    {
        response = "Sure.";
    }
    else if(!small  && msg.indexOf('?') != -1 && msg.indexOf('\n') != 0)
    {
      return "Calm down, I know what I'm doing!";
    }
    else if ( msg.indexOf('!') != -1)
    {
      response = 'Whoa, chill out!';
    }

    else
    {
        response = "Whatever.";
    }
    return response;
};