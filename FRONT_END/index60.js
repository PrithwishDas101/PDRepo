// callbacks = a function that is passed as an arguement
//             to another function
//
//             used to handle asynchronous operations:
//             1. Reading a file
//             2. Network Requests
//             3. Interacting with database

//             "Hey, when you are done, call this next."

hello(leave);


function hello(callback){
    console.log("hello!");
    callback();
}
function goodbye(){
    console.log("goodbye!");
}
function leave(){
    console.log("leave!");
}

sum(displayPage, 1, 2);

function sum(callback, x, y){
    let result = x + y;
    callback(result);
}

function displayConsole(result){
    console.log(result);
}

function displayPage(result){
    document.getElementById("myh1").textContent = result;
}