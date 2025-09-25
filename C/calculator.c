#include <stdio.h>

int main ()
  {
    // calculator

    char operator = '\0' ;
    double num1 = 0.0 ;
    double num2 = 0.0 ;
    double result = 0.0 ;

    printf ("enter the first number: ") ;
    scanf ("%lf", &num1) ;
    printf ("enter the operator (+, -, /, *) : ") ;
    scanf (" %c", &operator) ;
    printf ("enter the second number: ") ;
    scanf ("%lf", &num2) ;

    switch (operator)
    {
    case '+':
          result = num1 + num2 ;
        break;
    case '-':
          result = num1 - num2 ;
          break;
    case '/':
          if (num2 == 0)
          printf ("you can't divide by 0\n") ;
          else
          result = num1 / num2 ;
          break;
    case '*':
          result = num1 * num2 ;
          break;
    default:
          printf ("invalid operator!\n") ;
        break;
    }    

          printf ( " %.2lf %c %.2lf = %.2lf", num1, operator, num2, result ) ;

    return 0 ;

  }