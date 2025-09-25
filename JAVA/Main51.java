package JAVA;

import java.util.Scanner;

public class Main51{
    public static void main(String[] args){

        // Runtime Polymorphism = When the method that gets executed is decided
        //                        at runtime based on the actual type of the object.

        Scanner scanner = new Scanner(System.in);

        Animal2 animal;

        System.out.print("Would you like a dog or a cat? (1 = Dog and 2 = Cat): ");
        int choice = scanner.nextInt();

        if (choice == 1){
            animal = new Dog2();
            animal.speak();
        }
        else if (choice == 2){
            animal = new Cat2();
            animal.speak();
        }

        scanner.close();
    }
}