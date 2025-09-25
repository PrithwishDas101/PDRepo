package JAVA;

import java.util.Scanner;

public class Main28{

    static int x = 3; // CLASS

    public static void main(String[] args){

        // variable scope = where a variable can be accessed

        Scanner scanner = new Scanner(System.in);

        int a = 1; // LOCAL

        System.out.println(a);
        doSomethingReff();
        System.out.println(x);

        scanner.close();
    }
    static void doSomethingReff(){
        int a = 2; // LOCAL
        System.out.println(a);
        System.out.println(x);
    }
}