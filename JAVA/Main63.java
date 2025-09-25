package JAVA;

import java.util.Scanner;

public class Main63{
    public static void main(String[] args){

        // Anonymous class = A class that doesn't have a name. Cannot be reused.
        //                   Add custom behsviour without having to create a new class.
        //                   Often used for one time uses (TimerTask, Runnable, callbacks)   

        Scanner scanner = new Scanner(System.in);

        Dog3 dog1 = new Dog3();
        Dog3 dog2 = new Dog3(){
            @Override
            void speak(){
                System.out.println("Scooby doo goes *Ruh Roh*");
            }
        };


        dog1.speak();
        dog2.speak();

        scanner.close();
    }
}