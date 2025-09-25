#include <stdio.h>

int factorial (int n){
    int f = 1;

    for (int i = 1; i <= n; i++){
        f *= i;
    }

    return f;
}

int main(){
    int num, sum = 0, temp;

    printf("Enter a number to check if it's a strong number: ");
    scanf("%d", &num);

    temp = num;

    while (temp > 0){
        int digit = temp % 10;
        sum += factorial(digit);
        temp /= 10;
    }

    if (sum == num){
        printf("%d is a Strong number", num);
    }

    else{
        printf("%d is NOT a Strong number", num);
    }

    return 0;
}