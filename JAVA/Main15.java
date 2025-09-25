package JAVA;

import java.util.Scanner;

public class Main15{
    public static void main(String[] args){

        // Weight Conversion calculator

        Scanner scanner = new Scanner(System.in);

        double weight, newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert to kgs");
        System.out.println("2: Convert to lbs");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        if (choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.45392;
            System.out.printf("The new weight in kgs: %.2f", newWeight);
        }
        else if (choice == 2){
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs: %.2f", newWeight);
        }
        else{
            System.out.println("INVALID INPUT");
        }

        scanner.close();
    }
}