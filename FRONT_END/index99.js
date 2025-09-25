// callback hell = Situation in Js when multiple callbacks are
//                 nested within other callbacks to the degree
//                 where reading the code becomes difficult
//                 Old pattern to handle asynchronous functions
//                 Use Promises + async/await to avoid callback hell

function task1(callback){
    setTimeout(() => {
        console.log("Task 1 complete");
        callback();
    }, 3000);
}
function task2(callback){
    setTimeout(() => {
        console.log("Task 2 complete");
        callback();
    }, 1500);
}
function task3(callback){
    setTimeout(() => {
        console.log("Task 3 complete");
        callback();
    }, 6000);
}
function task4(callback){
    setTimeout(() => {
        console.log("Task 4 complete");
        callback();
    }, 4000);
}

task1(() => {
    task2(() => {
        task3(() => {
            task4(() => console.log("All tasks complete"))
        })
    })
})