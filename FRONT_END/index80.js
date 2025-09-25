// closure = A function defined inside of another function
//           the inner function has access to the variables
//           and scope of the outer function
//           Allow for private variables and state maintenance
//           Used frequently in JS framework: React ,Vue, Angular

function outer(){

    let message = "hello";
    function inner(){
        console.log(message);
    }

    inner();
}

outer();

function createCounter(){

    let count = 0;

    function increment(){

        count++;
        console.log(`count increased to ${count}`);
    }

    function getcount(){
        return count;
    }

    return {increment, getcount};
}

const counter = createCounter();

counter.increment();
counter.increment();
counter.increment();
counter.increment();
counter.increment();
counter.increment();
counter.increment();
counter.increment();
counter.increment();

console.log(`the current count is ${counter.getcount()}`);



let score = 0;

function createGame(){

    function increaseScore(points){
        score += points;
        console.log(`+${points}pts`);
    }

    function decreaseScore(points){
        score -= points;
        console.log(`-${points}pts`);
    }

    function getScore(){
        return score;
    } 

    return {increaseScore, decreaseScore, getScore};
}

const game = createGame();

game.increaseScore(5);
game.increaseScore(6);
game.decreaseScore(2);

console.log(`the final score is ${game.getScore()}pts`)