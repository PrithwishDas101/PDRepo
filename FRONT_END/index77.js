// sort() = method used to sort elements of an array in place.
//          Sorts elements as string in lexicographic order, not alphabetical
//          lexicographic = (alphabet + numbers + symbols) as strings

const fruits = ["apple", "coconut", "banana"];
const number = [1, 10, 26, 842, 263];
const symbols = []

fruits.sort();
number.sort((a, b) => b - a);

console.log(fruits);
console.log(number);

const people = [{name: "spongebob", age: 25, gpa: 3.1},
                {name: "gablu", age: 30, gpa: 2.3},
                {name: "tublu", age: 12, gpa: 6.2},
                {name: "keltu", age: 23, gpa: 1.8},
                {name: "bhattu", age: 65, gpa: 4.4},
                {name: "hawa", age: 32, gpa: 9.6},
                {name: "niggachad", age: 26, gpa: 3.9},
                {name: "shalu", age: 83, gpa: 7.0},];

//people.sort((a, b) => a.age - b.age);
//people.sort((a, b) => a.gpa - b.gpa);
people.sort((a, b) => a.name.localeCompare(b.name));

console.log(people);