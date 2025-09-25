// this = reference to the object where THIS is used
//        (the object depends on the immediate context)
//        THIS keyword does not work with arrows => 
//        person.name  = this.name

const person = {
    name: "bro",
    favfood: "burger",
    sayHello: function(){console.log(`hello my name is ${this.name}`)},
    eat: function(){console.log(`i am eating a ${this.favfood}`)},
}

const person1 = {
    name: "breh",
    favfood: "borger",
    sayHello: function(){console.log(`hello my name is ${this.name}`)},
    eat: function(){console.log(`i am eating a ${this.favfood}`)},
}

person.sayHello();
person.eat();

person1.sayHello();
person1.eat();


console.log(this)