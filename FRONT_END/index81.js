// setTimeout() = function in Js which allows you to schedule
//                the execution of a function after an amount of time (milliseconds)
//                Times are approximate (varies based on the workload of the Js runtime enviornment)

//                setTimeout(callback, delay)
//                clearTimeout(timeoutId) = can cancel a timeout before it triggers

function sayHello(){
    window.alert("Hello");
}

setTimeout(sayHello, 3000);
setTimeout(function(){window.alert("gablu")}, 4000);


const timeoutId = setTimeout(() => {sayHello()}, 5000);
clearTimeout(timeoutId);



let timeoutId1;

function startTimer(){
    timeoutId1 = setTimeout(() => window.alert("hello twinky boi", 3000));
    console.log("started")
}

function clearTimer(){
    clearTimeout(timeoutId);
    console.log("cleared")
}