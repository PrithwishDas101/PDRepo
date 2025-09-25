package JAVA;

import java.util.Scanner;

public class Main40{
    public static void main(String[] args){

        // Constructor = A special method to initialize objects
        //               You can pass arguments to a Constructor
        //               and set yp initial values

        Scanner scanner = new Scanner(System.in);

        Students student1 = new Students("Spongebob", 30, 3.2);
        Students student2 = new Students("Bob", 20, 4.2);

        System.out.println("Name: " + student1.name + " Age: " + student1.age + " Gpa: " + student1.gpa);
        student1.study();
        System.out.println("Name: " + student2.name + "       Age: " + student2.age + " Gpa: " + student2.gpa);
        student2.study();

        scanner.close();
    }
}