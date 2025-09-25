// guessing game 

const min = 1;
const max = 100;
const answer = Math.floor(Math.random() * (max - min) + 1) + min;

let attempts = 0;
let guess;
let running = true;

while(running){
    guess = window.prompt(`Guess a number between ${min} and ${max} `);
    guess = Number(guess);

    if(isNaN(guess)){
        window.alert("please enter a valid number");
    }
    else if(guess < min || guess > max){
        window.alert("please enter a valid number");
    }
    else{
        attempts++
        if (guess < answer){
            window.alert("Too LOW, Try Again!");
        }
        else if(guess > answer){
            window.alert("Too HIGH, Try Again!");
        }
        else{
            window.alert(`CORRECT!!! The answer was ${answer}. It took you ${attempts} attempts to get that`);
            running = false
        }
    }
}