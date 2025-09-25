package JAVA;

import java.util.Scanner;

public class Main19{
    public static void main(String[] args){

        // Calculator Program

        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        char operator;
        double result = 0.0;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /, %, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();
        boolean validOperation = true;

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0){
                    System.out.println("Cannot divide by 0");
                    validOperation = false;
                }
                else{
                    result = num1 / num2;
                }
            } 
            case '%' -> result = num1 % num2;
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Bruh really? ");
                validOperation = false;
            }
        }

        if (validOperation){
        System.out.println(result);
        }

        scanner.close();
    }
}