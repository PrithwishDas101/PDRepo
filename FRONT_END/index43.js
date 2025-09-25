// switch = can be an efficient replacement for nested if statements

let day = "pizza";

switch(day)
{
    case 1:
        console.log("IT IS MONDAY");
    case 2:
        console.log("IT IS TUESDAY");
    case 3:
        console.log("IT IS WEDNESDAY");
    case 4:
        console.log("IT IS THURSDAY");
    case 5:
        console.log("IT IS FRIDAY");
    case 6:
        console.log("IT IS SATURDAY");
    case 7:
        console.log("IT IS SUNDAY");
    default:
        console.log("PLEASE ENTER 1-7")
}

let testScore = 92;
let letterGrade;

switch(true){
    case testScore >= 90:
    letterGrade = "A";
    break;
    case testScore >= 80 && testScore < 90:
    letterGrade = "B";
    break;
    case testScore >= 60 && testScore < 80:
    letterGrade = "C";
    break;
    case testScore >= 40 && testScore < 60:
    letterGrade = "D";
    break;
    case testScore < 40:
    letterGrade = "F";
    break;
    default:
    console.log("stfu nigga chan");
}