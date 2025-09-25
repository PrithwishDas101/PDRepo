package JAVA;

import java.util.Scanner;

public class Main21{
    public static void main(String[] args){

        // While loop = repeat some code forever
        //              while some conditions are true

        Scanner scanner = new Scanner(System.in);

        String name = "";

        while (name.isEmpty(
        )){
            System.out.print("Enter your name please: ");
            name = scanner.nextLine();
        }

        System.out.println("Your name: "+name);

        int age = 0;

        do{
            System.out.println("nah age can't be negative lad");
            System.out.println("Enter your age: ");
            age = scanner.nextInt();
        }while(age < 0);

        scanner.close();
    }
}