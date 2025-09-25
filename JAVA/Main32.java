package JAVA;

import java.util.Scanner;

public class Main32{
    public static void main(String[] args){ 

        Scanner scanner = new Scanner(System.in);

        String[] foods;

        System.out.print("How many food do you want to enter? ");
        int size = scanner.nextInt();

        foods = new String[size];

        for (int i = 0; i < foods.length; i ++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.next();
        }

        for (String food : foods){
            System.out.print(food + " ");
        }

        scanner.close();
    }
}