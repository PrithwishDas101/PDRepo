// .map() = accepts a callback and applies that function 
//          to each element of an array, then return a new Array

const numbers = [1, 2, 3, 4, 5];
const square = numbers.map(squares);
const cube = numbers.map(cubes)

function squares(element){
    return Math.pow(element, 2);
}

function cubes(element){
    return Math.pow(element, 3);
}

console.log(square);
console.log(cube);

const students = ["gablu", "monti", "tublu", "keltu", "pompom"];
const upperCases = students.map(upperCase);
const lowerCases = students.map(lowerCase);

function upperCase(students){
    return students.toUpperCase();
}
function lowerCase(students){
    return students.toLowerCase();
}

console.log(lowerCases);
console.log(upperCases);


const dates = ["2024-1-10", "2023-2-12", "2021-1-07"];
const formattedDates = dates.map(formatDates);

console.log(formattedDates);

function formatDates(dates){
    const parts = dates.split("-");
    return `${parts[1]}/${parts[2]}/${parts[0]}`;
}