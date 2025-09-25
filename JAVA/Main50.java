package JAVA;

import java.util.Scanner;

public class Main50{
    public static void main(String[] args){

        // Polymorphism = POLY  = "MANY"
        //                MORPH = "SHAPE"
        //                Object can identify as other objects.
        //                Objects can be treated as objects of a common superclass. 

        Scanner scanner = new Scanner(System.in);

        Car3 car  = new Car3();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};
        
        for (Vehicle vehicle : vehicles){
            vehicle.go();
        }

        scanner.close();
    }
}