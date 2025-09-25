#include <stdio.h>

int main(){
    int i = 0, decimal;

    int binary[32];

    printf("Enter a decimal number: ");
    scanf("%d", &decimal);

    if (decimal == 0){
        printf("Binary: '\0'");
        return 0;
    }

    int temp = decimal;

    while (temp > 0){
        binary[i] = temp % 2;
        temp /= 2;
        i++;
    }

    printf("Binary of %d: ", decimal);

    for (int j = i - 1; j >= 0; j--){
        printf("%d", binary[j]);
    }
    printf("\n");

    return 0;
}