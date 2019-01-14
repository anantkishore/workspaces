module.exports.solve = function(x, y){

    if(isNaN(x) || isNaN(y))
    {
        return null;
    }
    
    if(x <= 1 && y <= 1)
    {
        return 10;
    }
    else if(x <= 5 && y <= 5)
    {
        return 5;
    }
    else if(x <= 10 && y <= 10)
    {
            return 1;
    }
    else{
        return 0;
    }
};