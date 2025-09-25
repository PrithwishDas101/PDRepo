package JAVA;

import java.util.Scanner;

public class Main5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Arithmetic operators

        int x = 10; int y = 20; int z;

        // z = x*y;
        // z = x+y;
        // z = x-y;
        // z = x/y;
         z = x%y;

        System.out.println("z= "+z);

        // Augmented Arithmetic operators

        int a = 9; int b = 7;

        // a += b;
        // a -= b;
        // a /= b;
        // a *= b;
        // a %= b;

        System.out.println(a+", "+b);

        // Increment and Decrement

        int p = 9;

        // p++;
        p--;

        System.out.println(p);

        // Order of Operators [P-E-M-D-A-S] => Parenthesis => Exponents => Multiplication => Division => Addition => Subtraction

        double result = 3 + 4 *  (7- 5) / 2.0;

        System.out.println(result);

        scanner.close();
    }
}
