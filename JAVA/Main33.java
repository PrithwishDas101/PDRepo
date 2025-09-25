package JAVA;

import java.util.Scanner;

public class Main33{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {2,1,3,4,6,3,7,4};

        int target = 2;

        for (int i = 0; i < numbers.length; i ++){
            if (target == numbers[i]){
                System.out.println("Element found at: "+numbers[i]);
                break;
            }
            else{
                System.out.println("Element was not found");
                break;
            }
        }

        scanner.close();
    }
}