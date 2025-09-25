package JAVA;

import java.util.Scanner;

public class Main68{
    public static void main(String[] args){

        // Enums = (Enumeration) A special kind of class that
        //         represents a fixed set of comstraints.
        //         They improve code reusability and are easy to maintain.
        //         More efficient with switches when comparing Strings. 

        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER A DAY OF THE WEEK: ");
        String response = scanner.nextLine().toUpperCase();

        try {
            DAY day = DAY.valueOf(response);

            System.out.println(day);
            System.out.println(day.getDAYNUMBER());

            switch(day){
                case    MONDAY, 
                        TUESDAY, 
                        WEDNESDAY, 
                        THURSDAY, 
                        FRIDAY   -> System.out.println("IT'S A WEEKDAY");
                case    SUNDAY, 
                        SATURDAY -> System.out.println("IT'S THE WEEKEND");
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("PLEASE ENTER A VALID DAY");
        }    

        scanner.close();
    }
}