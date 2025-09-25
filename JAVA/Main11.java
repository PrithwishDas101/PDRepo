package JAVA;

import java.util.Scanner;

public class Main11{
    public static void main(String[] args){
       
        // Compound Interest Calculator
        
        Scanner scanner = new Scanner(System.in);

        double principal, rate;
        int timesCompounded, years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();
        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;
        System.out.print("Enter the # times Compounded per year: ");
        timesCompounded = scanner.nextInt();
        System.out.print("Enter the time (in years): ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate/timesCompounded, timesCompounded * years);

        System.out.printf("\nThe amount after %d years is $%.2f\n", years, amount);
        
        scanner.close();
    }
}