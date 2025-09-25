package JAVA;

import java.util.Scanner;

public class Main69{
    public static void main(String[] args){

        // Threading = Allows a program to run multiple tasks simultaneously
        //             Helps improve performance with time-consuming opreations
        //             (File I/O, network communications, or any background tasks)

        // How to create a Thread 
        // Option 1. Extend the Thread class (simpler).
        // Option 2. Implement the Runnable interface (better).

        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.print("You have 5 seconds to enter your name: ");

        
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close();
    }
}