package JAVA;

import java.util.Scanner;

public class Main47{
    public static void main(String[] args){

        // .toString() = Method inherited from the object class.
        //               Used to return a string representation of an object.
        //               By default, it returns a hash code as a unique identifier.
        //               It canbe overriden to provide meaningful details.

        Scanner scanner = new Scanner(System.in);

        Car2 car1 = new Car2("Ford", "Mustang", 2025, "Red");
        Car2 car2 = new Car2("Chevrolet", "Corvette", 2026, "Blue");

        System.out.println(car1);
        System.out.println("\n" + car2);

        scanner.close();
    }
}