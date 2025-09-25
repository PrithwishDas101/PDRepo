// ternary operator = a shortcut to if() and else() statement
//                    helps to assign a variable based on a condition 
//                    condition ? codeifTrue : codeifFalse

//let age = 21;
//let message = age >= 18 ? "you are an adult" : "you are a minor";

//console.log(message);

//let time = 16;
//let greeting = time < 12 ? "good morning" : "good afternoon";

//console.log(greeting);

//let isStudent;
//let message = isStudent ? "you are a student" : "you are not a student";

let purchaseAmount = 103;
let discount = purchaseAmount >= 100 ? 10 : 0;
console.log(`your total purchase amount = $${purchaseAmount - purchaseAmount * (discount/100)}`);