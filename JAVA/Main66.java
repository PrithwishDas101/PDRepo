package JAVA;

import java.util.Scanner;

public class Main66{
    public static void main(String[] args){

        // Generics = A concept where you can write a class, interface or method
        //            that is compatible with different data types.
        //            <T> type paramater (placeholder that gets replaced with a real type).
        //            <String> type argument (specifies the type).

        Scanner scanner = new Scanner(System.in);

        Box<String> box1 = new Box<>();

        box1.setItem("Gear");
        System.out.println(box1.getItem());

        Box<Integer> box2 = new Box<>();

        box2.setItem(5);
        System.out.println(box2.getItem());

        Box<Character> box3 = new Box<>();

        box3.setItem('L');
        System.out.println(box3.getItem());

        Box<Double> box4 = new Box<>();

        box4.setItem(9000.00);
        System.out.println(box4.getItem());

        Box<Boolean> box5 = new Box<>();

        box5.setItem(true);
        System.out.println(box5.getItem());




        Product<String, Double> product1 = new Product<>("pizza", 9.99);

        System.out.println(product1.getItem() + "  = " + "$" + product1.getPrice());

        Product<String, Integer> product2 = new Product<>("ticket", 15);

        System.out.println(product2.getItem() + " = " + "$" + product2.getPrice());

        scanner.close();
    }
}