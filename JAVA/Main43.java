package JAVA;

import java.util.Scanner;

public class Main43{
    public static void main(String[] args){

        // static = Makes a variable or method belong to the class
        //          rather than to any specific object.
        //          Commonly used for utility methods or shared resources.

        Scanner scanner = new Scanner(System.in);

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");

        Friend.showFriends();
        System.out.println("Your friends are " + friend1.name + ", " + friend2.name + ", " + friend3.name + " and " + friend4.name);

        scanner.close();
    }
}