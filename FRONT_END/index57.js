// rest parameters = (...rest) allow a function to work with a variable
//                    number of arguements by bundling them into an array
//                    ...      = seperate elements from an array
//                    ... rest = bundles seperate element into an array

function openFridge(...foods){
    console.log(foods)
}

function getFood(...foods){
    return foods;
}

const food1 = "pizza";
const food2 = "chizza";
const food3 = "lizza";
const food4 = "grizza";

openFridge(food1, food2, food3, food4);

const foods = getFood(food1, food2, food3, food4);

console.log(foods);

function sum(...numbers){
    
    let result = 0;
    for(let number of numbers){
        result += number;
    }
    return result;
}

function getAverage(...numbers){
    
    let result = 0;
    for(let number of numbers){
        result += number;
    }
    return result / numbers.length;
}

const total = getAverage(75, 85, 95, 205);

console.log(total);

function combineString(...strings){
    return strings.join(" ")
}

const fullName = combineString("Mr.", "SpongeBob", "III");

console.log(fullName);