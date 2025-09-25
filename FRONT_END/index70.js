// class = (ES6 feature) provides a more structured and cleaner way to 
//          work with objects compared to tradtional constructor functions
//          ex. static keywordm, inheritance, encapsulation

class Products{
    constructor(name, price){
        this.name = name;
        this.price = price;
    }

    displayProduct(){
        console.log(`Product: ${this.name}`);
        console.log(`Price: ${this.price.toFixed(2)}`);
    }

    calculateTotal(salesTax){
        return this.price + (salesTax * this.price);
    }
}

const salesTax = 0.24;

const product1 = new Products("gun", 67.90);
const product2 = new Products("grenade", 87.98);
const product3 = new Products("tank", 18657.30);

product1.displayProduct();
product2.displayProduct();
product3.displayProduct();

const total1  = product1.calculateTotal(salesTax);
const total2  = product2.calculateTotal(salesTax);
const total3  = product3.calculateTotal(salesTax);

console.log(`Total price of products inclusive of tax = $${total1.toFixed(2)}`);
console.log(`Total price of products inclusive of tax = $${total2.toFixed(2)}`);
console.log(`Total price of products inclusive of tax = $${total3.toFixed(2)}`);