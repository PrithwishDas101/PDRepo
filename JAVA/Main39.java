package JAVA;

import java.util.Scanner;

public class Main39{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Object = An entity that holds data (attributes)
        //          and can perform actions (methods)
        //          It is a reference data type

        Car car = new Car();
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);

        car.start();
         System.out.println(car.isRunning);
        car.stop();
         System.out.println(car.isRunning);

        scanner.close();
    }
}