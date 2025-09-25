// Error       = An object that is created to represent a problem that occurs
//               Occur often with user input or establishing a connection

// try { }     = Encloses blocks that might potentially cause an error
// catch { }   = Catch and handle any thrown errors from try { }
// finally { } = (optional) Always executes. Used mostly for clean up
//                ex. close files, close connections, release resources


try{
    console.log(x);
    // NETWORK ERRORS
    // PROMISE REJECTION
    // SECURITY ERRORS
}
catch(error){
    console.error(error);
}
finally{
    // CLOSE FILES 
    // CLOSE CONNECTIONS 
    // RELEASE RESOURCES 
    console.log("this always executes");
}

console.log("you reached the end!")


try{
    const dividend = Number(window.prompt("enter dividend: "));
    const divisor = Number(window.prompt("enter divisor: "));

    if(divisor == 0){
        throw new Error("you can't divide by 0");
    }
    if(isNaN(dividend)||isNaN(divisor)){
        throw new Error("values must be a number");
    }

    const result = dividend/divisor;
    console.log(result);

}
catch(error){
    console.error(error);
}

console.log("you reached the end of the program");
