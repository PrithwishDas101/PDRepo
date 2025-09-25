package JAVA;

import java.util.Scanner;
import java.util.Random;

public class Main22{
    public static void main(String[] args){

        // NUMBER GUESSING GAME

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess, attempts = 0;
        int randomNumber = random.nextInt(1, 101);

        System.out.println("------NUMBER GUESSING GAME------");
        System.out.println("Guess a number between 1 and 100: ");

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("TOO LOW! Try again");
            }
            else if(guess > randomNumber){
                System.out.println("TOO HIGH! Try again");
            }
            else{
                System.out.println("CORRECT! The number was: "+randomNumber);
                System.out.println("It only took you "+attempts+" attempts");
            }
        }while(guess != randomNumber);

        scanner.close();
    }
}