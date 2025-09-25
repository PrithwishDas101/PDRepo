#include <stdio.h>

void checkBalance (float balance) ;
float deposit () ;
float withdraw (float balance) ;


int main ()
 {

    //BANKING 

    int choice = 0 ;
    float balance = 0.0f ;

    printf (" *** WELCOME TO THE BANK *** \n") ;

    do 
    {

        printf ("Select an option:\n") ;
        printf ("\n1. CHECK BALANCE\n") ;
        printf ("2. DEPOSIT MONEY\n") ;
        printf ("3. WITHDRAW MONEY\n") ;
        printf ("4. EXIT!\n") ;
        printf ("ENTER YOUR CHOICE: ") ;
        scanf ("%d", &choice) ;

        switch (choice)
        {
            case 1:
                   checkBalance (balance) ;
                   break ;
            case 2:
                   balance = balance + deposit() ;
                   break;
            case 3:
                   balance = balance - withdraw (balance) ;
                   break ;
            case 4:
                   printf ("\nTHANK YOU FOR USING THE BANK! \n") ;
                   break ;
            default :
                   printf ("\nINVALID CHOICE! PLEASE SELECT 1 - 4\n") ;
        }

    }
    while (choice != 4) ;

    return 0 ;

 }

void checkBalance (float balance) 
{
    printf ("your current balance is : $%.2f\n", balance) ;

}

float deposit () 
{
    float amount = 0.0f ;

    printf ("\nENTER THE AMOUNT TO DEPOSIT: ") ;
    scanf ("%f", &amount) ;

    if (amount < 0 ) 
    {
        printf ("INVALID AMOUNT!! \n") ;
        return 0.0f ;
    }
    else
    {
        printf ("SUCCESFULLY DEPOSITED $%.2f\n", amount) ;
    }

    return amount ;
}

float withdraw (float balance) 
{
   float amount = 0.0f ;

    printf ("\nENTER THE AMOUNT TO WITHDRAW: ") ;
    scanf ("%f", &amount) ;

    if (amount < 0 ) 
    {
        printf ("\nINVALID AMOUNT!! \n") ;
        return 0.0f ;
    }
    else if (amount > balance)
    {
        printf ("\nINSUFFICIENT FUNDS! YOUR BALANCE IS $%.2f\n", balance) ;
        return 0.0f ;
    }
    else
    {
        printf ("\nSUCCESFULLY WITHDREW $%.2f\n", amount) ;
        return amount ;
    }
    
} 