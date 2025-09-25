// event listener = Listen for specific events to create interactive web pages
//                  events: keydown, keyup, keypress(uncompatitable with most websites)
//                  document.addEventListener(event, callback/anonymous function/arrow function)


const myBox = document.getElementById("myBox");

document.addEventListener("keydown", event => {
    myBox.textContent = "😑"
    myBox.style.backgroundColor = "green";
    console.log(`key down = ${event.key}`);
})

document.addEventListener("keyup", event => {
    myBox.textContent = "😉"
    myBox.style.backgroundColor = "red";
    console.log(`key up = ${event.key}`);
})

const moveAmount = 100;
let x = 0;
let y = 0;


document.addEventListener("keydown", event => {

    if(event.key.startsWith("Arrow")){

        event.preventDefault();

        switch(event.key){
            case "ArrowUp":
                y -= moveAmount;
                break;
            case "ArrowDown":
                y += moveAmount;
                break;
            case "ArrowLeft":
                x -= moveAmount;
                break;
            case "ArrowRight":
                x += moveAmount;
                break;
        }

        myBox.style.top = `${y}px`;
        myBox.style.left = `${x}px`;
    }
})