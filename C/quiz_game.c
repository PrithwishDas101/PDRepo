#include <stdio.h>
int main ()
{
    //QUIZ GAME

    char questions[][100] = {"WHAT IS THE LARGEST PLANET IN OUR SOLAR SYSTEM ?",
                              "WHAT IS THE HOTTEST PLANET IN OUR SOLAR SYSTEM ?",
                              "WHAT PLANET HAS THE MOST MOONS ?", 
                              "Is the Earth flat ?"} ;

    char options[][100] = {"A. Jupiter\nB. Uranus\nC. Saturn\nD. Neptune", 
                           "A. Mercury\nB. Venus\nC. Earth\nD. Mars", 
                           "A. Earth\nB. Mars\nC. Saturn\nD. Jupiter", 
                           "A. Yes\nB. No\nC. Maybe\nD. Sometimes"} ;

    char answerKey [] = {'A', 'B', 'C', 'D'} ;

    int questionCount = sizeof(questions) / sizeof(questions[0]) ;

    char guess = '\0' ;
    int score = 0 ;

    printf (" *** QUIZ GAME *** \n") ;

    for (int i = 0; i < questionCount; i++)
    {
       printf ("\n%s\n", questions[i]) ;
       printf ("\n%c\n", options[i]) ;
       printf ("Enter your choice: ") ;
       scanf (" %c", &guess) ;

       if (guess == answerKey[i] )
       {
          printf ("CORRECT!\n") ;
          score ++ ;
       }
       else
       {
          printf ("INCORRECT!\n") ;
       }
    }
    
    printf ("\nYour score is %d out of %d points\n", score, questionCount) ;

    return 0 ;
}