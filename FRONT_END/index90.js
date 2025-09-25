// DOM Navigation = The process of navigating through the structure
//                  of an HTML document using javascript

// .firstElementChild
// .lastElementChild
// .nextElementSibling
// .previousElementSibling
// .parentElement
// .children

//---------------.firstElementChild---------------

const ulElements = document.querySelectorAll("ul");

ulElements.forEach(ulElements => {
    const firstChild = ulElements.firstElementChild;
    firstChild.style.backgroundColor = "yellow";
})


//---------------.lastElementChild---------------

const ulElements1 = document.querySelectorAll("ul");

ulElements1.forEach(ulElements1 => {
    const lastChild = ulElements1.lastElementChild;
    lastChild.style.backgroundColor = "yellow";
})

//---------------.nextElementSibling---------------

const element =  document.getElementById("apple");
const nextSibling = element.nextElementSibling;
nextSibling.style.backgroundColor = "green";

//---------------.nextElementSibling---------------

const element1 =  document.getElementById("mango");
const previousSibling = element1.previousElementSibling;
previousSibling.style.backgroundColor = "purple";

//---------------.parentElement---------------

const element3  =document.getElementById("ice cream");
const parent = element3.parentElement;
parent.style.backgroundColor = "red";

//---------------.children---------------

const element4  =document.getElementById("vegetables");
const children = element4.children;

Array.from(children).forEach(child => {
    child.style.backgroundColor = "grey";
})

children[1].style.color = "white";

console.log(children);