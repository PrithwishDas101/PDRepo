// .filter() = creates a new array by filtering
//             out elements

let number = [1, 2, 3, 4, 5, 6, 7];
let evenNum = number.filter(isEven);
let oddNum  = number.filter(isOdd);

console.log(evenNum);
console.log(oddNum);

function isEven(number){
    return number % 2 === 0;
}

function isOdd(element){
    return element % 2 !== 0;
}


const ages = [20, 19, 18, 23, 17, 30, 14];
const legal = ages.filter(isLegal);
const illegal = ages.filter(isillegal);

console.log(legal);
console.log(illegal);

function isLegal(number){
    return number >= 18;
}

function isillegal(element){
    return element <= 18;
}

const words= ["apple", "sandwich", "burger", "shewarma", "soup", "tea"];
const lessThan6 = words.filter(islessThan6);
const moreThan6 = words.filter(ismoreThan6);

console.log(lessThan6);
console.log(moreThan6);

function islessThan6(words){
    return words.length <= 6;
}

function ismoreThan6(words){
    return words.length >= 6;
}
