// arrow function = a concise way to write function expressions
//                  good for simple functions that you use only once 

//                  (parameters) => some code

const hello = (name, age) => {console.log(`Hello ${name}`);
                         console.log(`You are ${age} years young`)};

hello("Bro Code", 25);


setTimeout( () => console.log("Hello"), 3000);


const numbers = [1, 3, 5, 78, 3, 54, 6, 93, 53, 45, 25, 88, 13, 7];

const squares = numbers.map((element) => Math.pow(element, 2));
const cubes   = numbers.map((element) => Math.pow(element, 3));
const evenNum = numbers.filter((element) => element % 2 === 0);
const oddNum  = numbers.filter((element) => element % 2 !== 0);
const total  = numbers.reduce((accumulator, element) => accumulator + element);

console.log(squares);
console.log(cubes);
console.log(evenNum);
console.log(oddNum);
console.log(total);