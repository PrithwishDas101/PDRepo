package JAVA;

public class Animal extends Organism{
    

    boolean isAlive;

    Animal(){
        isAlive = true;
    }

    void eat(){
        System.out.println("The animal is eating");
    }
}
