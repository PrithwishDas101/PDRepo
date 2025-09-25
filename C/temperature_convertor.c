#include <stdio.h>

int main ()
    {
        //TEMPERTURE CONVERTOR

        char choice = '\0' ;
        float fahrenheit = 0.0f ;
        float celcius = 0.0f ;

        printf ("TEMPERATURE CALCULATOR:\n ") ;
        printf ("C. CELCIUS TO FAHRENHEIT:\n") ;
        printf ("F. FAHRENHEIT TO CELCIUS:\n") ;
        printf ("IS THE TEMPERATURE IN CELCIUS (C) OR FAHRENHEIT (F) ? ") ;
        scanf ("%c", &choice) ;

        if (choice == 'C')
        {
            // CELCIUS TO FAHRENHEIT
            printf ("ENTER THE TEMPERATURE IN CELCIUS: ") ;
            scanf ("%f", &celcius) ;
            fahrenheit = (celcius * 9 / 5) + 32 ;
            printf ("%.2f celcius is equal to %.2f fahrenheit\n ",celcius, fahrenheit) ;

        }
        else if (choice == 'F')
        {
            //FAHRENHEIT TO CELCIUS
            printf ("ENTER THE TEMPERATURE IN FAHRENHEIT: ") ;
            scanf ("%f", &fahrenheit) ;
            celcius = (fahrenheit - 32) * 5 / 9 ;
            printf ("%.2f fahrenheit is equal to %.2f celcius\n ",fahrenheit, celcius) ;
        }
        else
        {
            printf ("WRONG INPUT!! INPUT CORRECT CHOICE\n") ;
        }
        
        return 0 ;

    }