package JAVA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main57{
    public static void main(String[] args){

        // Exception = An event that interrupts the normal flow of a program
        //             (Dividing by 0, file not found, mismatch input type)
        //             Surround any dangerous code with a try{} block
        //             try{}, catch{}, finally{}

        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(1/number);
        }
        catch(ArithmeticException e){
            System.out.println("You can't divide by 0 idiot!!!");
        }
        catch(InputMismatchException e){
            System.out.println("That wasn't a number!!!");
        }
        catch(Exception e){
            // SAFETY NET
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("This always executes");
        }
    }
}