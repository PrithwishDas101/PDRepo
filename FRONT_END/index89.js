// element selectors = Methods used to target and manipulate HTML elements
//                     They allow you to select one or multiple HTML elements
//                     from the DOM (Document OBject Model)

// 1. document.getElementById()          // ELEMENT OR NULL
// 2. document.getElementsClassName()    // HTML COLLECTION 
// 3. document.getElementsByTagName()    // HTML COLLECTION
// 4. document.querySelector()           // ELEMENT OR NULL
// 5. document.querySelectorAll()        // NODELIST

const myHeading = document.getElementById("my-heading");
myHeading.style.backgroundColor = "yellow";
myHeading.style.textAlign = "center";

console.log(myHeading);

const fruits = document.getElementsByClassName("fruits");

for (let fruit of fruits) {
    fruit.style.backgroundColor = "yellow";
}

Array.from(fruits).forEach(fruit => {
    fruit.style.backgroundColor = "green";
});

console.log(fruits)



const h4Elements = document.getElementsByTagName("h4");
const liElements = document.getElementsByTagName("li");

Array.from(h4Elements).forEach(h4Elements => {
    h4Elements.style.backgroundColor = "yellow";
})

Array.from(liElements).forEach(liElements => {
    liElements.style.backgroundColor = "red";
})

console.log(h4Elements);



const element = document.querySelector(".fruits");
const element1 = document.querySelector("h4");
const element2 = document.querySelector("ul");
const element3 = document.querySelector("li");

element.style.textAlign = "center";
element1.style.textAlign = "center";
element2.style.textAlign = "center";
element3.style.backgroundColor = "white"



const fruits1 = document.querySelectorAll(".fruits");
const food = document.querySelectorAll("li");

fruits1.forEach(fruits => {
    fruits.style.color = "blue";
})

food.forEach(food => {
    food.style.color = "blue";
})
