package JAVA;

import java.util.Scanner;

public class Main25{
    public static void main(String[] args){

        // nested loop = A loop inside another loop
        //               used often with matrices or DSA 

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= 9; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}