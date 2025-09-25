// function =  a section of reusable codes
//             Declare code once, use it whenever you want.
//             Call the function to execute that code

function happyPotiDay(username, age){
    console.log("happy  poti day to you!");
    console.log("happy  poti day to you!");
    console.log(`happy  poti day dear ${username}!`); 
    console.log("happy  poti day to you!");
    console.log(`It is the ${age}th potiday!`); 
}

happyPotiDay("bro code", 690000);

function add(x, y){
    let result = x + y;
    return result;
}

let answer = add(5,7);

console.log(answer);

function isEven(x) {
    if (x % 2 == 0){
        return true;
    }
    else{
        return false;
    }
}

console.log(isEven(12));