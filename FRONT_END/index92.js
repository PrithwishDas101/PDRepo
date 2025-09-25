// event listener = Listen for specific events to create interactive web pages
//                   events: click, mouseover, mouseout
//                   .addEventListener(event, callback/anonymous function/arrow function);

const myBox = document.getElementById("myBox");
const myBtn = document.getElementById("myBtn");

//function changeColor(event){
//   event.target.style.backgroundColor = "tomato";
//   event.target.textContent = "OUCH! 😒😒";
//   console.log(event);
//}

//myBox.addEventListener("click", changeColor);


//myBox.addEventListener("mouseover", function(event){
//    event.target.style.backgroundColor = "pink";
//    event.target.textContent = "STAWP! 😜😜";
//})

//myBox.addEventListener("mouseout",event =>{
//    event.target.style.backgroundColor = "purple"
//    event.target.textContent = "DON'T LEAVE! 😢😢"
//});



myBtn.addEventListener("click", event => {
    myBox.style.backgroundColor = "tomato";
    myBox.textContent = "OUCH!🙄🙄";
})

myBtn.addEventListener("mouseover", event => {
    myBox.style.backgroundColor = "pink";
    myBox.textContent = "ei dushtu click me!😏";
})

myBtn.addEventListener("mouseout", event => {
    myBox.style.backgroundColor = "lightgreen";
    myBox.textContent = "Click Me❤❤";
})
