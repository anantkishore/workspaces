var events = require('events');
var eventEmitter = new events.EventEmitter();

var screamEventHandler = function handleScream()
{
    console.log("I hear a scream");
}

eventEmitter.on('scream', screamEventHandler);
console.log("Ice scream");
eventEmitter.emit('scream');