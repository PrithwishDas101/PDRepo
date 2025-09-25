#include <stdio.h>

long long factorialRecursive(int n){

    if (n < 0) {
        printf("Factorial is not defined for negative numbers!\n");
        return -1;
    }
    if (n == 0 || n == 1){
        return 1;
    }

    return n * factorialRecursive(n - 1);
}

int main(){
    int n, i;

    long long f = 1;

    printf("Enter a number: ");
    scanf("%d", &n);

    for (i = 1; i <= n; i++){
        f *= i;
    }

    printf("Factorial iterative: %lld\n", f);

    printf("Factorial Recursive: %lld\n", factorialRecursive(n));

    return 0;
}