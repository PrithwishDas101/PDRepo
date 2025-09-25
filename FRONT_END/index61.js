// forEach() = method used to iterate over the elements
//             of an array and apply a specified function (callback)

//             array.forEach(callback)
//             [elements, index, array are provided]

let numbers = [1, 2, 3, 4, 5];

//numbers.forEach(square);
//numbers.forEach(triple); 
//numbers.forEach(double);
numbers.forEach(display);

function double(elements, index, array){
    array[index] = elements * 2;
}
function triple(elements, index, array){
    array[index] = elements * 3;
}
function square(elements, index, array){
    array[index] = elements * elements;
}

function display(elements){
    console.log(elements);
}

let fruits= ["apple", "orange", "banana", "coconut"];

fruits.forEach(capitalize);
fruits.forEach(display);

function upperCase(element, index, array){
    array[index] = element.toUpperCase(); 
}

function lowerCase(element, index, array){
    array[index] = element.toLowerCase(); 
}

function capitalize(element, index, array){
    array[index] = element.charAt(0).toUpperCase() + element.slice(1); 
}

function display(element){
    console.log(element);
}