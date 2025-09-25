package JAVA;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main56{
    public static void main(String[] args){

        // ArrayList = A resizeable array that stores objects (autoboxing).
        //             Arrays are fixed in size, but ArrayLists can change. 

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(3);
        list1.add(1);
        list1.add(4);

        System.out.println(list1);

        ArrayList<Double> list2 = new ArrayList<>();

        list2.add(3.2);
        list2.add(1.2);
        list2.add(4.1);

        System.out.println(list2);

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("pineapple");

        // fruits.remove(1);
        // fruits.set(0, "coconut")

        System.out.println(fruits);

        // System.out.println(fruits.get(0));
        // System.out.println(fruits.size());
        
        Collections.sort(fruits);

        for (String fruit : fruits){
            System.out.println(fruit);
        }

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the # of fruits you wanna enter: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1 ; i <= numOfFood; i ++){
            System.out.print("Enter food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();
    }
}