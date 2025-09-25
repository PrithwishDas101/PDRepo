// Promise = An object that manage asynchronous operations.
//           Wrap a promise Object around {asynchronous code}
//           "I promise to return a value"
//           PENDING -> RESOLVED or REJECTED
//           new Promise((resolve, reject) => asynchronous code)

// DO THESE IN ORDER

// 1. WALK THE DOG
// 2. CLEAN THE KITCHEN
// 3. TAKE OUT THE TRASH

function walkTheDog(){
    return new Promise((resolve, reject) => {
        setTimeout(() => {

            const dogWalk = true;
                if(dogWalk){
                    resolve("you take out the dog🐩");
                }
                else{
                    reject("you DIDN'T walk the dog");
                }
        }, 1500);
            
    })
}
function cleanTheKitchen(){
    return new Promise((resolve, reject) => {
        setTimeout(() => {

            const cleanKitchen = true;
                if(cleanKitchen){
                    resolve("you clean the kitchen🔪");
                }
                else{
                    reject("you DIDN'T clean the kitchen");
                }
        }, 3500);
    })
}
function takeOutTheTrash(){
    return new Promise((resolve, reject) => {
        setTimeout(() => {

            const takeTrash = false;
                if(takeTrash){
                    resolve("you take out the trash🥫");
                }
                else{
                    reject("you DIDN'T take out the trash");
                }
        }, 500);
    })
}

walkTheDog().then(value => {console.log(value); return cleanTheKitchen()})
            .then(value => {console.log(value); return takeOutTheTrash()})
            .then(value => {console.log(value); console.log("You finished all the chores!")})
            .catch(error => console.error(error));