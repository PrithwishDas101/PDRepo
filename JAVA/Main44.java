package JAVA;

import java.util.Scanner;

public class Main44{
    public static void main(String[] args){

        // Inheritance = One class inherits the attributes and methods
        //               from another class.
        //               Child <- Parent <- Grandparent

        Scanner scanner = new Scanner(System.in);

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        dog.eat();
        cat.eat();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();

        dog.isGodsFavourite();
        cat.isGodsFavourite();

        plant.photosynthesize();
        plant.isGodsFavourite();

        scanner.close();
    }
}