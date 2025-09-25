package JAVA;

import java.util.Scanner;

public class Main49{
    public static void main(String[] args){

        // Interface = A blueprint for a class that specifies a set of abstract methods
        //             that implementating classes MUST define.
        //             Supports multiple inheritance-like behaviour

        Scanner scanner = new Scanner(System.in);

        Rabbit rabbit = new Rabbit();
        Fish fish  = new Fish();
        Hawk hawk = new Hawk();

        rabbit.flee();
        fish.flee();
        fish.hunt();
        hawk.hunt();

        scanner.close();
    }
}