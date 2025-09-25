package JAVA;

import java.util.Scanner;

public class Main24{
    public static void main(String[] args){

        // break = break out of a loo (stop)
        // continue = skip current iteration of a loop (skip)

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 10; i++){
            
            if (i==5){
                continue;
            }

            if (i==8){
                break;
            }

            System.out.print(i + " ");
        }

        scanner.close();
    }
}