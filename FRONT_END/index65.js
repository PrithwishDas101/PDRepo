// function declaration = define a reusable block of code
//                        that performs a specific task

//                       function hello(){
//                            console.log(hello);
//                       }

// function expression = a way to express a function
//                       as a variable or values

//                       1. callbacks in asynchronous operations
//                       2. higher-order functions
//                       3. closures
//                       4. event listners

const hello = function hello(){
    console.log("hello");
}

setTimeout(hello, 3000) //hello function is executed after 3000 ms

setTimeout(function hello(){
    console.log("hello kelo")  //hello function is executed after 4000 ms
}, 4000)


const numbers = [1, 2, 3, 4, 5];

const squares = numbers.map(function (numbers){
    return Math.pow(numbers, 2);
});

const cubes = numbers.map(function (numbers){
    return Math.pow(numbers, 3);
});

const evenNum = numbers.filter(function (element){
    return element % 2 === 0;
})

const oddNum = numbers.filter(function (element){
    return element % 2 !== 0;
})

const total = numbers.reduce(function (accummulator, element){
    return accummulator + element
});

console.log(squares);
console.log(cubes);
console.log(evenNum);
console.log(oddNum);
console.log(total)

