package JAVA;

import java.util.Scanner;

public class Main29{

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        // Banking Program 

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning){
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            System.out.print("ENTER YOUR CHOICE KIND SIR (1-4): ");
            choice = scanner.nextInt();

            switch (choice){
                case 1  -> showBalance(balance);
                case 2  -> balance += depositMoney();
                case 3  -> balance -= withdrawMoney(balance);
                case 4  -> isRunning = false;
                default -> System.out.println("Umm sir that is an invalid input!!!");
            }
        }
        System.out.println("******************************************************");
        System.out.println("Thank you good sir for using the bank! Have a nice day");
        System.out.println("******************************************************");
       scanner.close();
    }
    static void showBalance(double balance){
        System.out.printf("Your balance is $%.2f\n", balance);
    }
    static double depositMoney(){

        double amount;

        System.out.print("Enter an amount to deposit: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }

    }
    static double withdrawMoney(double balance){

        double amount;

        System.out.print("Enter an amount to Withdraw: ");
        amount = scanner.nextDouble();

        if (amount > balance){
            System.out.println("Insufficient funds");
            return 0;
        }
        else if (amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }   
}