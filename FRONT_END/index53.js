// variable scope = where a variable is recognised
//                  and accessible (local vs global)

let x = 3; //global variable

function2();

function function1(){
    let x = 1; //local variable (takes precedence over global variables)
    console.log(x);
}
function function2(){
    let x = 2; //local variable (takes precedence over global variables)
    console.log(x);
}