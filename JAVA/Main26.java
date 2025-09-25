package JAVA;

import java.util.Scanner;

public class Main26{
    public static void main(String[] args){

        // method = a block of reusable code that is executed when called ()

        Scanner scanner = new Scanner(System.in);

        happyBirthday(19, "PD");
        happyBirthday(48, "SD");
        happyBirthday(55, "PD Sr.");


        scanner.close();
    }
    static void happyBirthday(int x, String name){
        System.out.println("Happy Happy birthday " + name +"~");
        System.out.println("Happpy birthday dear youu");
        System.out.println("You are now " + x + " years old");
        System.out.println("Happpy birthday to youuuu~~\n");
    }
}