package JAVA;

import java.util.Scanner;

public class Main18{
    public static void main(String[] args){

        //enchanced switch = A replacement to many else if statements (Java14 feature)

        Scanner scanner = new Scanner(System.in);
        String day;

        System.out.print("Enter the day: ");
        day = scanner.next();
        
        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday😢");
            case "Saturday", "Sunday" -> System.out.println("It is a weekend😎");
            default -> System.out.println(day+" is not a day");
        }

        scanner.close();
    }
}
