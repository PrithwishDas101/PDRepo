package JAVA;

public class Main16{
    public static void main(String[] args){

        // ternary operator ? = Return 1 of 2 if a condition is true

        // variable = (condition) ? ifTrue : elseFalse

        int score = 53;

        String passOrFail = (score>=60) ? "pass" : "fail";
        System.out.println(passOrFail);

        int number = 5;

        String evenOrOdd = (number%2 == 0) ? "even" : "odd";
        System.out.println(evenOrOdd);
    }
}