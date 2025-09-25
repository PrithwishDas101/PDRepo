package JAVA;

import java.util.Scanner;

public class Main27{
    public static void main(String[] args){

        // overloaded methods = methods that share the same name,
        //                      but different parameters
        //                      signature = name + parameters
        
        Scanner scanner = new Scanner(System.in);

        System.out.println(add(1.34, 3.34));
        System.out.println(add(1.34, 3.34, 2.34));

        scanner.close();
    }
    static double add (double a, double b){
        return (a + b);
    }
    static double add (double a, double b, double c){
        return (a + b + c);
    }
}