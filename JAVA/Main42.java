package JAVA;

import java.util.Scanner;

public class Main42{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Car1[] cars = {new Car1("Mustang", "Red"), 
                       new Car1("Corvette", "Blue"),
                       new Car1("Charger", "Yellow")};
        
        for (Car1 car : cars){
            car.drive();
        }

        scanner.close();
    }
}