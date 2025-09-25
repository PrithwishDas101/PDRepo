package JAVA;

import java.util.Scanner;

public class Main54{
    public static void main(String[] args){

        // Composition = Represents a "part-of" relationship between objects.
        //               For example, an Engine is a "part of" a Car.
        //               Allows complex objects to be constructed from smaller objects.

        Scanner scanner = new Scanner(System.in);

        Car5 car = new Car5("Corvette", 2025, "V8");

        car.start();

        scanner.close();
    }
}