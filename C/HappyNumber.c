#include <stdio.h>

int sumOfSquares(int n){

    int sum = 0;

    while (n > 0){
        int digit = n%10;
        sum += digit*digit;
        n /= 10;
    }

    return sum;
}

int isHappy(int n){ // 19 --> Happy number

    int slow = n;
    int fast = n;

    // Using FLoyd Cycle method

    do{
        slow = sumOfSquares(slow);               // slow = 1*1 + 9*9 = 82                   
        fast = sumOfSquares(sumOfSquares(fast)); // fast = 1*1 + 9*9 = 82 --> 8*8 + 2*2 = 68
    } while (slow != fast);                      // 82 != 68 --> loop continues
                                                 // slow = 8*8 + 2*2 = 68
                                                 // fast = 6*6 + 8*8 = 100 --> 1*1 + 0*0 + 0*0 = 1
                                                 // 68 != 1 --> loop contninues
                                                 // slow = 6*6 + 8*8 = 100
                                                 // fast = 1*1 = 1 --> 1*1 = 1
                                                 // 100 != 1 --> loop continues
                                                 // slow = 1*1 + 0*0 + 0*0 = 1
                                                 // fast = 1*1 = 1 --> 1*1 = 1
                                                 // 1 == 1 -> loop stops

    return (slow == 1);                          // slow == 1 --> 19 --> happy number
}

int main(){

    int num;
    printf("Enter a number: "); // 
    scanf("%d", &num);

    if (isHappy(num)){
        printf("%d is a happy number\n", num);
    }

    else{
        printf("%d is NOT a happy number\n", num);
    }

    return 0;
}