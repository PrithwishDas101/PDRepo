package JAVA;

import java.util.Scanner;

public class Main53{
    public static void main(String[] args){

        // Aggregation = Represents a "has-a" relationship between objects.
        //               One object contains another object as a part of its structure,
        //               but the container object/s can exist independently

        Scanner scanner = new Scanner(System.in);

        Book book1 = new Book("The Fellowship of the Ring", 423);
        Book book2 = new Book("The Two Towers", 352);
        Book book3 = new Book("The Return of the King", 416);

        Book[] books = {book1, book2, book3};

        Library library = new Library("NYC Public Library", 1897, books);

        library.displayInfo();

        scanner.close();
    }
}