// inheritance = allows a new class to inherit properties and methods
//               from an existing class (parent --> child)
//               helps with code reusability

class animal{
    alive = true;

    eat(){
    console.log(`This ${this.name} is eating`);
    }
    sleep(){
    console.log(`This ${this.name} is sleeping`)
    }
}


class Rabbit extends animal{
    name = "rabbit";

    run(){
        console.log(`this ${this.name} is running`);
    }
}
class Fish extends animal{
    name = "fish";

    swim(){
        console.log(`this ${this.name} is swimming`);
    }
}
class Hawk extends animal{
    name = "hawk";
    fly(){
        console.log(`this ${this.name} is flying`);
    }
}

const rabbit = new Rabbit();
const fish = new Fish();
const hawk = new Hawk();

console.log(rabbit.alive);
rabbit.eat();
rabbit.sleep();
rabbit.run();

console.log(fish.alive);
fish.eat();
fish.sleep();
fish.swim();

console.log(hawk.alive);
hawk.eat();
hawk.sleep()
hawk.fly();