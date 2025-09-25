// nested objects = objects inside of other objects
//                  Allows you to represent more complex data structures
//                  Child OBject is enclosed by Parent objects
//                  
//                  Person(Address{}, ContactInfo{})
//                  ShoppingCart{Keyboard{}, Mouse{}, Monitor{}}

const fruits = [{name: "apple", color: "red", calories: 95},
                {name: "orange", color: "orange", calories: 45},
                {name: "coconut", color: "white", calories: 159},
                {name: "pineapple", color: "yellow", calories: 37}]

// ---------reduce()------------

const maxFruit = fruits.reduce( (max, fruit) =>
                                 fruit.calories > max.calories ? fruit : max);

const minFruit = fruits.reduce( (min, fruit) =>
                                 fruit.calories < min.calories ? fruit : min)

console.log(maxFruit);
console.log(minFruit);