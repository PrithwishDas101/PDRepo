package JAVA;

import java.util.Scanner;
import java.util.Arrays;

public class Main31{
    public static void main(String[] args){

        // array = a collection of values of the same data type
        //         * think of it as a variable that can store more than 1 value *

        Scanner scanner = new Scanner(System.in);

        String fruits[] = {"Apple", "Banana", "Orange", "Coconut"};

        // fruits[0] = "Pineapple";
        // int numOfFruits = fruits.length;
        Arrays.sort(fruits);
        Arrays.fill(fruits, "Pineapple");

        // System.out.println(fruits[0]);
        // System.out.println(numOfFruits);

        // for (int i = 0; i < numOfFruits; i++){
        //     System.out.print(fruits[i] + " || ");
        // }

        for (String fruit : fruits){
            System.out.print(fruit + " ");
        }

        scanner.close();
    }
}