//variable = A container that stores a value
//           behaves as if it were the value it counted

// 1. declaration    let x;
// 2. assignment     x = 100;

let x;
x = 123;
let y = 100;
let age = 25;
let price = 150;
let gpa = 2.4;

let firstName = "bro";
let favouriteFood = "pizza";
let email = "brocode@gmail.com";

let online = false;
let forSale = true;
let isStudent = true;

console.log(x);
console.log(y);

console.log(typeof age);
console.log(`You are ${age} years old`);
console.log(`the price is $${price}`);
console.log(`your gpa is: ${gpa}`);

console.log(typeof firstName);
console.log(`your first name is ${firstName}`);
console.log(typeof favouriteFood);
console.log(`your favourite food is ${favouriteFood}`);
console.log(typeof email);
console.log(`your email is: ${email}`);

console.log(typeof online);
console.log(`you are online: ${online}`);
console.log(typeof forSale);
console.log(`the car is for sale: ${forSale}`);
console.log(typeof isStudent);
console.log(`pd is a student: ${isStudent}`);

document.getElementById("p1").textContent = firstName;
document.getElementById("p2").textContent = age;
document.getElementById("p3").textContent = forSale;