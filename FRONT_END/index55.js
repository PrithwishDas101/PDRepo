// arrays = variable like structure that can hold
//          more than 1 value

let value = ["apple", 'orange', `banana`];

// value[1] = coconut;
// value[3] = tomato;

// value.push("gamli");
// value.pop();
// value.unshift("tibia");
// value.shift();

//console.log(value[0]);
//console.log(value[1]);
//console.log(value[2]);
//console.log(value[3]);


let noValue = value.length;
let index = value.indexOf("apple");
let index1 = value.indexOf("fuchka");

console.log(noValue);
console.log(index);
console.log(index1) //returns -1 if elements are not found

for(let i = 0; i < value.length; i ++){
    console.log(value[i]);
}

let ghibli = ["cat", "cow", "culer", "cumulonimbus"];

ghibli.sort().reverse();

for(let ghiblis of ghibli ){
    console.log(ghibli);
}


