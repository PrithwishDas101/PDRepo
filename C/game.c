#include <stdio.h>
#include <string.h>

int main ()
{
   // MAD LIBS GAME

    char noun[50] = "";
    char verb[50] = "";
    char adjective1[50] = "";
    char adjective2[50] = "";
    char adjective3[50] = "";

    printf ("enter an adjective: ");
    fgets (adjective1, sizeof(adjective1), stdin);

    printf ("enter a noun: ");
    fgets (noun, sizeof(noun), stdin);

    printf ("enter an adjective: ");
    fgets (adjective2, sizeof(adjective2), stdin);

    printf ("enter a verb in present continous tense: ");
    fgets (verb, sizeof(verb), stdin);

    printf ("enter an adjective: ");
    fgets (adjective3, sizeof(adjective3), stdin);

    printf ("\nToday I went to a %s zoo ", adjective1);
    printf ("\nIn an exhibition, I saw a %s \n", noun);
    printf ("\n%s was %s and %s!", noun, adjective2, verb);
    printf ("\nI was %s!", adjective3);
    

   return 0;

}