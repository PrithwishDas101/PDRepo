// while loop = repeat some codes WHILE some condition is true

//let username = "";

//while(username === "" || username === null){
//    username= window.prompt("enter your name niggeshor");
//}

//console.log(`hello ${username}`);

let loggedin = false;
let username;
let password;

while(!loggedin){
    username = window.prompt(`enter your name`);
    password = window.prompt(`enter your password`);

    if (username === `myusername` && password === `mypassword`){
        loggedin = true;
        console.log("you are logged in");
    }
    else{
        console.log("invalid credentials!!! please try again");
    }
}