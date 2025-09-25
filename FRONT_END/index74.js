// getter = special method that makes a property readable
// setter = special method that makes a property writable

// validate and modify a value when reading/writing a property

class Rectangle{

    constructor (width, height){
        this.width = width;
        this.height = height;
    }

    set width(newWidth){

        if(newWidth > 0){
            this._width = newWidth;
        }
        else{
            console.error(" width must be a positive number");  
        }
    }

    set height(newHeight){

        if(newHeight > 0){
            this._height = newHeight;
        }
        else{
            console.error("height must be a positive number");  
        }
    }

    get width(){
        return `${this._width.toFixed(1)}cm`;
    }

    get height(){
        return `${this._height.toFixed(1)}cm`;
    }

    get area(){
        return `${(this._height * this._width).toFixed(1)}cm^2`;
    }
}

const rectangle = new Rectangle(30, 40);

rectangle.width = -58;
rectangle.height = "pizza";

console.log(rectangle.width);
console.log(rectangle.height);
console.log(rectangle.area);


class Person{

    constructor(firstName, lastName, age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    set firstName(newfirstName){
        if(typeof newfirstName === "string" && newfirstName.length > 0){
            this._firstName = newfirstName;
        }
        else{
            console.error("first name must be a non-empty string");
        }
    }

    set lastName(newlastName){
        if(typeof newlastName === "string" && newlastName.length > 0){
            this._lastName = newlastName;
        }
        else{
            console.error("last name must be a non-empty string");
        }
    }

    set age(newage){
        if(typeof newage === "number" && newage > 0){
            this._age = newage;
        }
        else{
            console.error("age must be a non-negative number");
        }
    }

    get firstName(){
        return this._firstName;
    }

    get lastName(){
        return this._lastName;
    }

    get fullName(){
        return this._firstName + " " + this._lastName;
    }

    get age(){
        return this._age;
    }

}


const person = new Person("bro", "code", 25);

person.firstName = 683;
person.lastName = 69;
person.age = "shittong";

console.log(person.firstName);
console.log(person.lastName);
console.log(person.fullName);
console.log(person.age);