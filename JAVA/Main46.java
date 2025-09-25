package JAVA;

import java.util.Scanner;

public class Main46{
    public static void main(String[] args){

        // Method Overriding = When a subclass provides its own
        //                     implementation of a method that is already defined.
        //                     Allows for code reusability and give specific implementations.

        Scanner scanner = new Scanner(System.in);

        Dog1  dog  = new Dog1();
        Cat1  cat  = new Cat1();
        Fish1 fish = new Fish1();

        dog.move();
        cat.move();
        fish.move();

        scanner.close();
    }
}