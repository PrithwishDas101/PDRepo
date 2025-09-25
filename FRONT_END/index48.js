// =   assignment operator
// ==  comparision operator (compare to see if two values are equal or not)
// === strict equality operator (compare to see if two values have the same datatype and are equal or not )
// !=  ineqyality operator
// !== strict inequality operator

const PI = 3.14;

if(PI == "3.14"){
    console.log("that is Pi");
}
else{
    console.log("that is not Pi bro")
}
if(PI === "3.14"){
    console.log("that is Pi and the data type is same as well");
}
else{
    console.log("that is not Pi bro and the data type does not match maybe");
}
if(PI != "3.14"){
    console.log("that is NOT Pi");
}
else{
    console.log("that is Pi bro")
}
if(PI !== "3.14"){
    console.log("that is NOT Pi bro maybe the data type doesn't check out");
}
else{
    console.log("that is Pi bro and the data type checks out too");
}