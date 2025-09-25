// object = A collection of related properties and/or methods
//          Can represent real world objects (people, products, places)
//          object = {key:value,
//                    function()}

const person = {          //person = object. key = firstName, value = "bro" objects can't be of the same name
    firstName: "bro",
    lastName: "code",
    age: 30,
    isEmplyed: false,
    sayHello: function(){console.log("hello I am Bro Code")},   
    eat: function(){console.log("i'm eating chicken")},
}

const person1 = {
    firstName: "only",
    lastName: "fans",
    age: 17,
    isEmplyed: true,
    sayBye: function(){console.log("Bye!")},
    eat: function(){console.log("I'm eating gourmet food")},
}

console.log(person.firstName);
console.log(person.lastName);
console.log(person.age);
console.log(person.isEmplyed);
person.sayHello();                //invoking the sayHello method
person.eat();

console.log(person1.firstName);
console.log(person1.lastName);
console.log(person1.age);
console.log(person1.isEmplyed);
person1.sayBye();                 //invoking the sayBye method
person1.eat();
