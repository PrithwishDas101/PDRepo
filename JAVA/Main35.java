package JAVA;

import java.util.Scanner;

public class Main35{
    public static void main(String[] args){

        // 2d arrays = An array where each element is an array
        //             Useful for storing a matrix of data

        Scanner scanner = new Scanner(System.in);
        
        String[][] groceries = {{"apple"  , "orange", "banana"}, 
                                {"potato" , "onion" , "carrot"}, 
                                {"chicken", "pork"  , "beef"  }};

        for(String[] foods : groceries){
            for (String food : foods){
                System.out.print(food + ", ");
            }
            System.out.println();
        }

        scanner.close();
    }
}