// if statement = if a condition is true, execute some code
//                if not, do something else

const myText = document.getElementById("myText");
const mySubmit = document.getElementById("mySubmit");
const resultElement = document.getElementById("resultElement");
let age;

mySubmit.onclick = function(){
    age = myText.value;
    age = Number(age);

    if(age >= 100){
        resultElement.textContent = `you are TOO old to enter this site`;
    }
else if(age == 0){
    resultElement.textContent = `you an't enter you were just born lil bro`;
    }
else if(age < 0){

    resultElement.textContent = `your age is not possibly less than 0 bro`;
    }
else if(age >= 18){
    resultElement.textContent = `you are old enough to enter this site`;
    }
else{
    resultElement.textContent = `you must be 18+ to enter this site`;
    }
}