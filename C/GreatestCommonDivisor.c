#include <stdio.h>

int main(){

    int m, n;

    printf("Enter 2 numbers: ");
    scanf("%d %d", &m, &n);

    int x = m, y = n;

    while (n != 0){
        int temp = n;
        n = m % n;
        m = temp;
    }

    printf("GCD of %d and %d is %d", x, y, m);

    return 0;
}