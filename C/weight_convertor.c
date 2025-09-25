#include <stdio.h>
#include <math.h>
 int main ()
   {
    
     // WEIGHT CONVERTER

     int choice = 0;
     float pounds = 0.0;
     float kilogram = 0.0;

     printf ("WEIGHT CONVERSION CALCLATOR:\n ");
     printf ("1. KILOGRAMS TO POUNDS:\n");
     printf ("2. POUNDS TO KILOGRAMS:\n");
     printf ("ENTER YOUR CHOICE: ");
     scanf ("%d", &choice);

     if (choice == 1)        //kilograms to pounds
     {
        printf ("Enter the weight in kilograms ");
        scanf ("%f", &kilogram);
        pounds = kilogram * 2.20462;
        printf ("%.2f kilograms is equal to = %.2f pounds\n", kilogram, pounds); 
     }
     else if (choice == 2)        //pounds to kilograms
     {
        printf ("Enter the weight in pounds ");
        scanf ("%f", &pounds);
        kilogram = pounds / 2.20462;
        printf ("%.2f pounds is equal to = %.2f kilograms\n", pounds, kilogram); 
     }
     else
     {
        printf ("INVALID CHOICE!! SELECT THE RIGHT OPTIONS\n");
     }

     return 0 ;

   }