// RANDOM PASSWORD GENERATOR

function generatePassword(passwordLength, includeLowercase, includeUppercase, includeNumbers,includeSymbols){

    const lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
    const uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    const numbersChars   = "0123456789";
    const symbolsChars   = "!@#$%^&*~()_+-=/\|?<>;:,.";

    let allowedChars = "";
    let password = "";

    allowedChars += includeLowercase ? lowercaseChars : "";
    allowedChars += includeUppercase ? uppercaseChars : "";
    allowedChars += includeNumbers   ? numbersChars   : "";
    allowedChars += includeSymbols   ? symbolsChars   : "";

    if (passwordLength <= 0){
        return `(password length must be greater than 0)`;
    }
    if(allowedChars.length === 0){
        return `(At least one set of characters need to be selected)`;
    }

    for (let i = 0; i < passwordLength; i++) {
        const randomIndex = Math.floor(Math.random() * allowedChars.length);
        password += allowedChars[randomIndex];
    }
    return password;
}

const passwordLength   = 12;
const includeLowercase = true;
const includeUppercase = true;
const includeNumbers   = true;
const includeSymbols   = true;

const password = generatePassword (passwordLength   ,
                                   includeLowercase ,
                                   includeUppercase ,
                                   includeNumbers   ,
                                   includeSymbols)  ;

console.log(`Generated Password = ${password}`);