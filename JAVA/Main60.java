package JAVA;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main60{
    public static void main(String[] args){

        // How to PLAY AN AUDIO with JAVA (.wav, .au, .aiff)

        String filePath = "JAVA\\song.wav";
        File file = new File(filePath);
        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){
            
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while (!response.equals("Q")) {
                
                System.out.println("P = PLAY");
                System.out.println("S = STOP");
                System.out.println("R = RESET");
                System.out.println("Q = QUIT");
                System.out.print("Enter your choice: ");

                response = scanner.nextLine().toUpperCase();

                switch(response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("INVALID CHOICE!");
                }
            }
        } 
        catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch(LineUnavailableException e){
            System.out.println("Unable to accept audio resource");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio not supported");
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("Thank you for using our Audio PLayer");
        }
    }
}