package JAVA;

import java.util.Scanner;

public class Main20{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // && = AND
        // || = OR 
        // !  = NOT 

        double temperature = 20;
        boolean isSunny = true;

        if (temperature <= 30 && temperature >= 0 && isSunny){
            System.out.println("Good damn weather");
            System.out.println("Sunny it is man");
        }
        else if (temperature <= 0 && !isSunny){
            System.out.println("hell na!");
            System.out.println("Not sunny");
        }
        else{
            System.out.println("Breh too damn hot");
        }

        scanner.close();

    }
}