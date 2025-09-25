package JAVA;

import java.util.Scanner;

public class Main36{
    public static void main(String[] args){

        // QUIZ GAME

        Scanner scanner = new Scanner(System.in);

        String questions[]  = {" 1. What is the main function of a router? ", 
                               " 2. Which part of the computer is considered its brain? ", 
                               " 3. What year was facebook launched? ", 
                               " 4. Who is the father of computers? " ,
                               " 5. What is the first programming language? "};

        String options[][] = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"}, 
                              {"1. CPU",           "2. Hard drive",      "3. RAM",                        "4. GPU"}, 
                              {"1. 2000",          "2. 2004",            "3. 2006",                       "4. 2008"}, 
                              {"1. Steve Jobs",    "2. Bill Gates",      "3. Alan Turing",                "4. Charles Babbage"}, 
                              {"1. COBOL",         "2. C",               "3. Fortran",                    "4. Assembly"}};

        int answers[] = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        System.out.println("*************************");
        System.out.println("Welcome to the Quiz game!");
        System.out.println("*************************");

        for (int i = 0; i < questions.length; i ++){
            System.out.println(questions[i]);

            for (String option : options[i]){
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == answers[i]){
                System.out.println("**********");
                System.out.println( "CORRECT!");
                System.out.println("**********");
                score ++ ;
            }
            else{
                System.out.println("*********");
                System.out.println(  "WRONG!");
                System.out.println("*********");
            }
        }

        System.out.println("You final score is " + score + " out of " + questions.length + " ");

        scanner.close();
    }
}