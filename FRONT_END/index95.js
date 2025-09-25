// NodeList = Static collection of HTML elements by (id, class, element)
//            Can be created by using querySelectAll()
//            Similar to an array, but no (map, filter, reduce)
//            NodeList won't update to automatically reflect changes

let buttons = document.querySelectorAll(".myBtns")

console.log(buttons);

// ADD CSS/HTML PROPERTY

buttons.forEach(button => {
    button.style.backgroundColor = "green";
    button.textContent += "😉";
})

// CLICK EVENTLISTENER

buttons.forEach(button => {
    button.addEventListener("click", event => {
        event.target.style.backgroundColor = "tomato";
    })
})

// MOUSEOVER + MOUSEOUT EVENTLISTENER

buttons.forEach(button => {
    button.addEventListener("mouseover", event => {
        event.target.style.backgroundColor = "rgb(27, 108, 122)";
    })
})

buttons.forEach(button => {
    button.addEventListener("mouseout", event => {
        event.target.style.backgroundColor = "rgb(12, 110, 56)";
    })
})


// ADD ELEMENT 

const newButton = document.createElement("button") // STEP 1
newButton.textContent = " Button 5 😉"; // STEP 2
newButton.classList = "myBtns";
document.body.appendChild(newButton); // STEP 3

buttons = document.querySelectorAll(".myBtns");

console.log(buttons);

// REMOVE AN ELEMENT

buttons.forEach(button => {
    button.addEventListener("click", event => {
        event.target.remove();
        buttons = document.querySelectorAll(".myBtns");
        console.log(buttons);
    })
})