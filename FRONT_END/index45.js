// string slicing = creating a substring
//                  from a portion of another string
//                  string.slice(start, end);

//const fullName = "Bro Code";

//let firstName  = fullName.slice(0, 3);
//let lastName = fullName.slice(4,8);
//let lastName1 = fullName.slice(4);

//let firstChar = fullName.slice(0,1);
//let lastChar = fullName.slice(-1);

//console.log(firstName);
//console.log(lastName);
//console.log(lastName1)

//console.log(firstChar);
//console.log(lastChar);

//let firstName = fullName.slice(0, fullName.indexOf(" "));
//let lastName = fullName.slice(fullName.indexOf(" ") + 1);

//console.log(firstName);
//console.log(lastName);

const email = "brocode@gmail.com";

let username = email.slice(0, email.indexOf("@"));
let extension = email.slice(email.indexOf("@") + 1);

console.log(username);
console.log(extension);