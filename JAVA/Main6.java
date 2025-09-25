package JAVA;

import java.util.Scanner;

public class Main6{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("Enter what you wanna buy: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many do you wanna buy?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("Mister your "+item+" is ready");
        System.out.println("Your grand total is: "+currency+total);

        scanner.close();
    }
}
