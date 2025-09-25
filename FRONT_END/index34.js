//How to take user input

// 1. EASY WAY to window prompt
// 2. PROFESSIONAL WAY = HTML textbox


// 1. EASY WAY
let username;
username = window.prompt("what's your name?");

console.log(username);

// 2. PROFESSIONAL WAY

let username1;

document.getElementById("mySubmit").onclick = function(){
    username1 = document.getElementById("myText").value;
    console.log(username1);
    document.getElementById("myH1").textContent = `hello ${username1}`
}