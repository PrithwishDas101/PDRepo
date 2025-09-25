package JAVA;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main64{
    public static void main(String[] args){

        // Timer     = Class that scgedukes tasks at specific times or periodically
        //             Useful for: sending notifications, scheduled updates, repitative actions

        // TimerTask = Represents the task that will be executed by the Timer
        //             You will extend the TimerTask class to define your task               
        //             create a subclass of TimerTask and @Override run()

        Scanner scanner = new Scanner(System.in);

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = 3;

            @Override
            public void run(){
                System.out.println("Hello");
                count--;
                if (count <= 0){
                    System.out.println("Task complete");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 3000, 1000);

        scanner.close();
    }
}