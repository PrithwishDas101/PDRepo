package JAVA;

import java.util.Scanner;

public class Main34{
    public static void main(String[] args){
        
        // varargs = allow a method to access a varying # of arguments
        //           makes methods more flexible, no need for overloaded methods
        //           java will pack the arguments into an array

        //           ...(ellipsis)

        Scanner scanner = new Scanner(System.in);

        System.out.println(add(1, 2, 3, 4));
        System.out.println(average(1, 2, 3, 4));

        scanner.close();
    }
    static int add(int... numbers){
        
        int sum = 0;

        for (int number : numbers){
            sum += number;
        }

        return sum;
    }
    static double average(int... numbers){
        
        double sum = 0.0;

        for (int number : numbers){
            sum += number;
        }

        return sum / numbers.length;
    }
}