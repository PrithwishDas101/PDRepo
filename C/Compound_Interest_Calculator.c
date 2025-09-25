#include <stdio.h>
#include <math.h>

int main ()
  {
    double principal = 0.0 ;
    double rate = 0.0 ;
    int year = 0 ;
    int timesCompounded = 0 ;
    double total = 0.0 ;

    printf ("COMPOUND INTEREST CALCULATOR:\n") ;

    printf ("ENTER THE PRINCIPAL AMOUNT (p): ") ;
    scanf (" %lf ", &principal) ;

    printf ("ENTER THE RATE OF INTEREST (r): ") ;
    scanf (" %lf ", &rate) ;
    rate /= 100 ;

    printf ("ENTER THE YEARS (t): ")  ;
    scanf (" %d ", &year) ;

    printf ("ENTER THE NUMBER OF TIMES COMPOUNDED (n): ") ;
    scanf (" %d ", &timesCompounded) ;

    total = principal * pow (1 + rate/timesCompounded, timesCompounded * year) ;

    printf ("AFTER %d years, the total will be $%.2lf", year, total) ;

    return 0 ;

  }