package JAVA;

import java.util.Scanner;

public class Main48{
    public static void main(String[] args){

        // abstract = Used to define abstract classes and methods.
        //            abstractionis the process of hiding implementation details
        //            and showing only the essential features;
        //            Abstract classes CAN'T be instantiated directly
        //            Can contain 'abstract' methods (which must be implemented)
        //            Can contain 'concrete' methods (which are inherited)

        Scanner scanner = new Scanner(System.in);

        Circle    circle    = new Circle(5.2);
        Triangle  triangle  = new Triangle(5.1, 4.2);
        Rectangle rectangle = new Rectangle(3.4, 1.2);

        circle.display();
        System.out.printf("Area of Circle = %.2fcm^2 \n", circle.area());

        triangle.display();
        System.out.printf("Area of Triangle = %.2fcm^2 \n", triangle.area());

        rectangle.display();
        System.out.printf("Area of Rectangle = %.2fcm^2 \n", rectangle.area());

        scanner.close();
    }
}