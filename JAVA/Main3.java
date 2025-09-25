package JAVA;

import java.util.Scanner;

public class Main3{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello "+name);
        System.out.println("Hello your age is "+age+" and your gpa is "+gpa);
        System.out.println("You are a student: "+isStudent);

        scanner.close();
    }
}