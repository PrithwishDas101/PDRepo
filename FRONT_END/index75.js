// destructuring = extract values from arrays and objects,
//                 then assign them to variables in a convenient way
//                 [] = to perform array destructuring
//                 {} = to perform object destructuring
//                 5 examples

// ----------------EXAMPLE 1----------------
// SWAP THE VALUE OF TWO VARIABLES

let a = 1;
let b = 2;

[a, b] = [b, a];  

console.log(a);
console.log(b);

// ----------------EXAMPLE 2----------------
// SWAP 2 ELEMENTS IN AN ARRAY

const colors = ["red", "orange", "blue", "black", "white"];

[colors[0], colors[4]] = [colors[4], colors[0]];  

console.log(colors);

// ----------------EXAMPLE 3----------------
// ASSIGN ARRAY ELEMENTS TO VARIABLES

const color = ["red", "orange", "blue", "black", "white"];

const [firstColor, secondColor, thirdColor, ...extraColor] = color;

console.log(firstColor);
console.log(secondColor);
console.log(thirdColor);
console.log(extraColor);

// ----------------EXAMPLE 3----------------
// EXTRACT VALUES FROM OBJECT 

const person1 = {
    firstName: "bob",
    lastName: "johnson",
    age: 25,
    job: "plumber",
}
const person2 = {
    firstName: "roy",
    lastName: "hudgsen",
    age: 15,
}

const {firstName, lastName, age, job= "unemployed"} = person2;

console.log(firstName);
console.log(lastName);
console.log(age);
console.log(job);

// ----------------EXAMPLE 5----------------
// DESTRUCTURING IN FUNCTION PARAMETERS

function displayPerson(firstNamee, lastNamee, agee, jobb="unemployed") {
    console.log(`name ${firstNamee} ${lastNamee}`);
    console.log(`age: ${agee}`);
    console.log(`job: ${jobb}`)
}

const person11 = {
    firstNamee: "bobby",
    lastNamee: "johnstone",
    agee: 35,
    jobb: "gayboy hunter",
}
const person22 = {
    firstNamee: "bucky",
    lastNamee: "printstone",
    agee: 95,
}

displayPerson(person22)

