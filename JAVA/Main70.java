package JAVA;

import java.util.Scanner;

public class Main70{
    public static void main(String[] args){

        // Multithreading = Enables a program to run multiple threads concurrently
        //                  (Thread = A set of instrcutions that run independently).
        //                  Useful for background tasks or time-consuming opreations.

        Scanner scanner = new Scanner(System.in);

        Thread thread1 = new Thread(new MyRunnable1("PING"));
        Thread thread2 = new Thread(new MyRunnable1("PONG"));

        System.out.println("GAME STARTS!");

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        System.out.println("GAME OVER!");

        scanner.close();
    }
}