#include <stdio.h>
#include <math.h>
#include <string.h>

int main(){
    char binary[1000];
    int i, len;

    int decimal = 0;

    printf("Enter a binary number (0's and 1's): ");
    scanf("%s", &binary);

    len = strlen(binary);

    for (i = 0; i < len; i++){
        if (binary[len - i - 1] == '1'){
            decimal += pow(2, i);
        }
    }

    printf("Decimal value of %s: %d", binary, decimal);

    return 0;
}