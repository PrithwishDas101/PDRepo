package JAVA;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main59{
    public static void main(String[] args){

        // How to read a file using JAVA (3 popular options)
        
        // BufferedReader + FileReader: Best for reading text files line-by-line.
        // FileInputStream: Best for binary files (e.g., images, audio and files).
        // RandomAccessFile: Best for read/write specific portions of a large file.

        Scanner scanner = new Scanner(System.in);

        String filePath = "C:\\Users\\DELL\\Desktop\\test.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("This file exists");

        } 
        catch (FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }

        scanner.close();
    }
}