#include <stdio.h>
#include <math.h>

int main(){
    int m, n, i, j, isPrime;

    printf("Enter a range(m, n): ");
    scanf("%d %d", &m, &n);

    for (i = m; i <= n; i++){

        isPrime = 1;

        if (i <= 1){
            continue;
        }

        else{
            for (j = 2; j <= sqrt(i); j++){
                if (i % j == 0){
                    isPrime = 0;
                    break;
                }
            }
        }

        if (isPrime){
            printf("%d ", i);
        }
    }

    printf("\n");

    return 0;
}