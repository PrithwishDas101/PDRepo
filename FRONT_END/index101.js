// Async/Await = Async = makes a function return a promise 
//               Await = makes an async function wait for a promise
//               
//               Allows you to write asynchronous code in a synchronous manner
//               Async doesn't have resolve or reject paramters
//               Everything after Await is placed in an event 

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

async function doChores(){
    const walkDOgResult = await walkTheDog();
    console.log(walkDOgResult);

    const cleanKitchenResult = await cleanTheKitchen();
    console.log(cleanKitchenResult);

    const takeOutTrashResult = await takeOutTheTrash();
    console.log(takeOutTrashResult);

    console.log("you finished all thr=e chores");
}