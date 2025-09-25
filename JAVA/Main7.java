package JAVA;

public class Main7{
    public static void main(String[] args){

        // If statement = performs a block of code if its condition is true

        int age = 80;

        if (age >= 65){
            System.out.println("You are a senior citizen");
        }
        else if (age >= 18){
            System.out.println("You are an adult");
        }
        else if (age < 0){
            System.out.println("You ain't born yet breh");
        }
        else if (age==0) {
            System.out.println("You were just born");
        }
        else{
            System.out.println("You are a minor");
        }
    }
}
