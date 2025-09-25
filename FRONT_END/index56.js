// spread operator = ... allows an iterable such as an array or string
//                       to be expanded into sepearate elements
//                       (unpacks the element)

let numbers = [1, 2, 3, 4, 5];
let maximum = Math.max(...numbers);
let minimum = Math.min(...numbers)

console.log(maximum);
console.log(minimum);

let username = "bro code";
let letters = [...username].join("-");

console.log(letters);

let fruits = ["apple", "orange", "banana"];
let vegetables = ["tomato", "celery", "potatoes"];
let food = [...fruits, ...vegetables, "eggs", "milk"].join("/");

console.log(food);