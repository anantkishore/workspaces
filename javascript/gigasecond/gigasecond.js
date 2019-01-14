module.exports.gigasecond = function(gs){
    gs.setSeconds(gs.getSeconds() + 1000000000);
    return gs;
}