package JAVA;

public class Fish implements Prey, Predator{
    
    @Override
    public void flee(){
        System.out.println("The smaller fish swims away like a beta");
    }
    public void hunt(){
        System.out.println("The bigger fish hunts the smaller fish like an alpha");
    }
}
