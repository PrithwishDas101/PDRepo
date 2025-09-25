package JAVA;

import java.util.Scanner;

public class Main17{
    public static void main(String[] args){

        // Temperature Conversion Program

        Scanner scanner = new Scanner(System.in);

        double Temperature, newTemperature;
        String unit;

        System.out.print("Enter the temperature: ");
        Temperature = scanner.nextDouble();

        System.out.print("Convert to celcius or to Farhenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemperature = (unit.equals("C")) ? ((Temperature - 32) * 5/9) : ((Temperature * 5/9) + 32);

        System.out.printf("%.1f°%s", newTemperature, unit);

        scanner.close();

    }
}