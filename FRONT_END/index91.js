// ----------EXAMPLE 1 <h1> ------------

// STEP 1 = Create the element
const newH1 = document.createElement("h1");
const newH2 = document.createElement("h2");

const newlistItem = document.createElement("li")

///STEP 2 = Add attributes/properties
newH1.textContent = "i like pizza";
newH1.id = "myH1";
newH1.style.color= "tomato";
newH1.style.textAlign= "center";
newH2.textContent = "i also like pizza";
newH2.id = "myH2";
newH2.style.color= "red"
newH2.style.textAlign= "center";

newlistItem.textContent = "coconut";

// STEP 3 = Append element to DOM
document.body.prepend(newH1);
document.getElementById("box1").prepend(newH1);
const box2 = document.getElementById("box2");
document.body.insertBefore(newH1, box2);
const boxes = document.querySelectorAll(".box");
document.body.insertBefore(newH1, boxes[1]);
document.body.append(newH2);
document.getElementById("box4").append(newH2);
const box4 = document.getElementById("box4");
document.body.insertBefore(newH2, box4);
document.body.insertBefore(newH2, boxes[3]);


// STEP 4 = Remove HTML element
document.body.removeChild(newH1);
document.getElementById("box4").removeChild(newH2);