module.exports.compute = function(dna1, dna2){
    
    var len = dna1.length;
    if(len > dna2.length)
    {
        throw new Error('left and right strands must be of equal length');
    }
    else if(len < dna2.length)
    {
        throw new Error('left and right strands must be of equal length');
    }
    else
    {
        var count = 0;
        for(var i = 0; i < len; i++)
        {
            if(dna1.charAt(i) != dna2.charAt(i))
            {
                count++;
            }
        }
        return count;
    }
};