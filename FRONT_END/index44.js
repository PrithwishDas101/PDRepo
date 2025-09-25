// string methods = allows you to manipulate and work with texts and strings

let username = "    broCode   ";

console.log(username.charAt(0));

console.log(username.indexOf("o"));

console.log(username.lastIndexOf("o"));

console.log(username.length);

username = username.trim();
console.log(username);

username = username.toUpperCase();
console.log(username);

username = username.toLowerCase();
console.log(username);

username = username.repeat(69);
console.log(username);

let result = username.startsWith(" ");
console.log(result);

let result1 = username.endsWith(" ");
console.log(result1);

let result2 = username.includes("o");
console.log(result2);

let phNumber = "123-456-789";
phNumber = phNumber.replaceAll("-", "");
console.log(phNumber);

phNumber = phNumber.padStart(69, "0");
console.log(phNumber);

phNumber = phNumber.padEnd(69, "0");
console.log(phNumber);
