#include <stdio.h>
  #include <stdlib.h>
    #include <time.h>
      
    int main () 
      {

        //NUMBER GUESSING GAME

        srand (time (NULL)) ;

        int guess = 0 ;
        int tries = 0 ;
        int min = 1 ;
        int max = 50 ;

        int answer = rand () % (max - min + 1) + min ;

        printf (" ***number guessing game***\n ") ;

        do
        {
            printf ("guess a number between %d - %d: ", min, max) ;
            scanf ("%d", &guess) ;
            tries ++ ;

            if (guess < answer)
            {
                 printf ("guess too low!\n") ;
            }
            else if (guess > answer)
            {
                 printf ("guess too high!\n") ;
            }
            else
            {
                  printf ("correct!!!\n") ;
            }
            

        } while (guess != answer) ;

        printf ("the answer is %d\n", answer) ;
        printf ("It took you %d tries", tries) ;


        return 0 ;

      }