package JAVA;

import java.util.Scanner;

public class Main55{
    public static void main(String[] args){

        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitive unless you need an object.
        //                   Allows use of Collections Framework and static Utility Methods. 

        Scanner scanner = new Scanner(System.in);

        //   [Double a = new Double(12.3);        }      
        //    Character b = new Character('$');   }       => DEPRECIATED METHOD => USE AUTOBOXING INSTEAD
        //    int c = new int(12);                }
        //    Boolean d = new Boolean(true); ]    }


        // AUTOBOXING       => primitive data type => Wrapper class

        // Double a = 12.3;             
        // Character b = '$';       
        // int c = 12;               
        // Boolean d = true;


        // UNBOXING       => Wrapper class => primitive data type

        // double x = a;
        // char y = b;
        // int z = c;
        // boolean q = d;

        String a = Integer.toString(100);
        String b = Double.toString(100.100);
        String c = Character.toString('O');
        String d = Boolean.toString(true);

        String x = a + b + c + d;

        System.out.println(x);

        
        char letter = 'C';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));

        scanner.close();
    }
}