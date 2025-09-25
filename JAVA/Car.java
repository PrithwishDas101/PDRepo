package JAVA;

public class Car {
    
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = false;

    void start(){
        System.out.println("You start the engine");
        isRunning = true;
    }

    void stop(){
        System.out.println("You stop the car engine");
        isRunning = false;
    }
}
