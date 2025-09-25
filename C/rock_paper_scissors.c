#include <stdio.h>
#include <stdlib.h> 
#include <time.h> 

int getComputerChoice () ;
int getUserChoice () ;
void checkWinnner (int userChoice, int computerChoice) ;
      
int main ()

{
    // rock paper scissors

srand (time (NULL)) ;

printf (" *** ROCK PAPER SCISSORS *** \n") ;

int userChoice = getUserChoice () ;
int computerChoice = getComputerChoice () ;

switch (userChoice)
{
case 1:
   printf ("you chose rock!\n") ;
    break ;
case 2:
   printf ("you chose paper!\n") ;
    break ;
case 3:
   printf ("you chose scissors!\n") ;
    break ;
default:
    break;
}

switch (computerChoice)
{
case 1:
   printf ("computer chose rock!\n") ;
    break ;
case 2:
   printf ("computer chose paper!\n") ;
    break ;
case 3:
   printf ("computer chose scissors!\n") ;
    break ;
default:
    break;
}

void checkWinnner (int userChoice, int computerChoice) ;
         
return 0 ;

}

int getComputerChoice () 
{
     return (rand () % 3) + 1 ;
}

int getUserChoice () 
{ 
int choice = 0 ;

do
{
    printf ("choose an option:\n ") ;
    printf ("1. ROCK \n") ;
    printf ("2. PAPER \n") ;
    printf ("3. SCISSORS \n") ;
    printf ("Enter your choice: ") ;
    scanf ("%d", &choice) ;
    
} 
        while (choice < 1 || choice > 3) ;
        

    }

void checkWinnner (int userChoice, int computerChoice) 
    {
        if (userChoice == computerChoice)
              printf ("it's a TIE!") ;
        else if (userChoice == 1 && computerChoice == 3) 
              printf ("you WIN!") ;
        else if (userChoice == 2 && computerChoice == 1) 
              printf ("you WIN!") ;
        else if (userChoice == 3 && computerChoice == 2) 
              printf ("you WIN!") ;
        else 
              printf ("you LOSE!") ;
    }
      