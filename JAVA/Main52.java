package JAVA;

import java.util.Scanner;

public class Main52{
    public static void main(String[] args){

        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Method that make a field READABLE
        // SETTERS = Method that make a field WRITEABLE

        Scanner scanner = new Scanner(System.in);

        Car4 car = new Car4("Charger", "Yellow", 10000);
        System.out.println("Guys I brought the " + car.getColor() + "-" + car.getModel() + " => $" + car.getPrice());

        car.setColor("black");
        car.setPrice(5000);

        System.out.println("My car is now For SAlE!!!!     " +  car.getColor() + "-" + car.getModel() + " => $" + car.getPrice());

        scanner.close();
    }
}