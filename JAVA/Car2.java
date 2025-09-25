package JAVA;

public class Car2 {
    
    String make;
    String model;
    int year;
    String color;

    Car2( String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString(){
        return ("Make : " + this.make + "\nModel: " + this.model + "\nYear : " + this.year + "\nColor: " + this.color);
    }
}
