package JAVA;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main58{
    public static void main(String[] args){

        // How to write a file using JAVA (4 popular options)
        
        // FileWriter     = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter    = Best for structured data, like reports or logs
        // FileOutStream  = Best for binary files (e.g., images, audio files) 

        Scanner scanner = new Scanner(System.in);

        String fileName = "C:\\Users\\DELL\\Desktop\\test.txt";
        String textContent = """
                Roses are red 
                Violets are blue 
                booty Booty Booty 
                ROCKIN' EVERYWHERE!
                """;

        try(FileWriter writer = new FileWriter(fileName)){
            writer.write(textContent);
            System.out.println("File has been written");
        } 
        catch (FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch (IOException e){
            System.out.println("Could not write file");
        }



        scanner.close();
    }
}