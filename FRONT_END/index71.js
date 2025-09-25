// static = keyword that defines properties or methods that belong
//          to a class itself rather than the Objects created
//          from that class (class owns anything static, not the object)

class MathUtil{
    static PI = 3.14159;

    static getDiameter(radius){
        return radius * 2;
    }

    static getCircumference(radius){
        return 2 * this.PI * radius;
    }

    static getArea(radius){
        return this.PI * Math.pow(radius, 2);
    }

}

console.log(MathUtil.PI);
console.log(MathUtil.getDiameter(55));
console.log(MathUtil.getCircumference(85));
console.log(MathUtil.getArea(5));


class User{
    static userCount = 0;

    constructor(username){
        this.username = username;
        User.userCount++;
    }

    static getUserCount(){
        console.log(`there are ${this.userCount} users online`);
    }

    sayHello(){
        console.log(`hello my username is ${this.username}`);
    }
}

const user1 = new User("spongebob");
const user2 = new User("patrick");
const user3 = new User("obama");
const user4 = new User("Saul Goodman");

console.log(user1.username);
console.log(user2.username);
console.log(user3.username);
console.log(user4.username);

User.getUserCount();

user1.sayHello();
user2.sayHello();
user3.sayHello();
user4.sayHello();

console.log(User.userCount);