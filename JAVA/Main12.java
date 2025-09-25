package JAVA;

public class Main12{
    public static void main(String[] args){
        // Nested if statement

        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if (isStudent){
            if (isSenior){
                System.out.println("\nYou get a senior discount of 20%");
                System.out.println("You get a 10% student discount");
                price *= 0.7;
            }
            else{
                System.out.println("\nYou get a 10% student discount");
                price *= 0.9;
            }
            
        }
        else{
            if(isSenior){
                System.out.println("\nYou get a senior discount of 20%");
                price *= 0.8;
            }
            else{
                price *= 1;
            }
        }
        
        System.out.printf("\nThe price of a ticket is: $%.2f", price);
    }
}