// DOM = DOCUMENT OBJECT MODEL 
//       Object{} = that represents the page you see in the web browser
//       and provides you with API to interact with interact it 
//       Web browser constructs the DOM when it loads an HTML document,
//       javascript can access the DOM to dynamically
//       change the content, structure, and style of a web page.

document.title = "My website";
document.body.style.backgroundColor = "yellow";
console.dir(document);


const username = " bro code";
const welcomeMsg = document.getElementById("welcomeMsg");

welcomeMsg.textContent += username === "" ? `Guest` : username;

