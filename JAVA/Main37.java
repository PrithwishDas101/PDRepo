package JAVA;

import java.util.Scanner;
import java.util.Random;

public class Main37{
    public static void main(String[] args){

        // ROCK PAPER SCISSORS game

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"ROCK", "PAPER", "SCISSORS"};
        String playerChoice, computerChoice;
        int playerScore = 0; int computerScore = 0;
        String playAgain = "Y";

        System.out.print("Enter your move (ROCK, PAPER, SCISSORS): ");
        playerChoice = scanner.nextLine().toUpperCase();

        do {if (!playerChoice.equals("ROCK")  && 
                !playerChoice.equals("PAPER") && 
                !playerChoice.equals("SCISSORS")){

                    System.out.println("INVALID CHOICE");
                    continue;
            }

        computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer Choices: "+ computerChoice);

        if (computerChoice.equals(playerChoice)){
            
                System.out.println("It's a TIE!");
                computerScore++;
                playerScore++;
                System.out.println("Computer Score: " + computerScore);
                System.out.println("Player Score: " + playerScore);
        }
        else if((playerChoice.equals("ROCK")      && (computerChoice.equals("SCISSORS"))) || 
                ((playerChoice.equals("PAPER")    && (computerChoice.equals("ROCK"))))    || 
                ((playerChoice.equals("SCISSORS") && (computerChoice.equals("PAPER"))))){
           
                    System.out.println("You WIN!");
                    playerScore++;
                    System.out.println("Computer Score: " + computerScore);
                    System.out.println("Player Score: " + playerScore);
        }
        else{
            
            System.out.println("You LOSE!");
            computerScore++;
            System.out.println("Computer Score: " + computerScore);
            System.out.println("Player Score: " + playerScore);
        }

        System.out.print("Play Again (Y/N): ");
        playAgain = scanner.nextLine().toUpperCase();
        }while(playAgain.equals("Y"));

        System.out.println("Thanks for playing");

        scanner.close();
    }
}