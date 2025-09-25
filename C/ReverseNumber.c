#include <stdio.h>

int main(){
    int num, sign = 1, revNum = 0;

    printf("Enter a  Number: ");
    scanf("%d", &num);

    if (num < 0){
        sign = -1;
        num = -num;
    }

    while (num > 0)
    {
        int temp = num % 10;
        revNum = revNum*10 + temp;
        num /= 10;
    }

    revNum *= sign;

    printf("Reversed Number: %d", revNum);

    return 0;
}