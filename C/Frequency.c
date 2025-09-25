#include <stdio.h>

int main(){

    int num, digit;
    int freq[10] = {0}; // Array to store the frequency of digits 0-9

    printf("Enter a number: ");
    scanf("%d", &num);

    if (num == 0){
        freq[0] = 1; // special case if number is 0
    }

    while (num > 0){
        digit = num % 10;
        freq[digit]++; // increment that number's count;
        num /= 10;
    }

    printf("Digit Frequencies: \n");

    for (int i = 0; i < 10; i++){
        printf("%d --> %d times\n", i, freq[i]);
    }

    return 0;
}