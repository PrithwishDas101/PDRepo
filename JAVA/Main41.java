package JAVA;

import java.util.Scanner;

public class Main41{
    public static void main(String[] args){

        // overloaded constructors = Allow a class to have multiple constructors
        //                           with different parameter lists.
        //                           Enable objects to be initialized in various ways

        Scanner scanner = new Scanner(System.in);

        User user1 = new User("Patrick");
        System.out.println("username: " + user1.username + "    || email: " + user1.email + "       || age: " + user1.age);
        User user2 = new User("Spongebob", "Spongy123gmail.com");
        System.out.println("username: " + user2.username + "  || email: " + user2.email + " || age: " + user2.age);
        User user3 = new User("Squidward", "Squid123yahoo.com", 40);
        System.out.println("username: " + user3.username + " || email: " + user3.email + " || age: " + user3.age);

        scanner.close();
    }
}