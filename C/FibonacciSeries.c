#include <stdio.h>

int fiboseries(int n){
    if (n == 0) return 0;
    if (n == 1) return 1;
    
    return fiboseries(n-1) + fiboseries(n-2);
}

int main(){
    int i, n;

    printf("Eter a number: ");
    scanf("%d", &n);

    printf("Fibonacci series up to %d terms is: ", n);

    for (i = 0; i < n; i++){
        printf("%d ", fiboseries(i));
    }

    printf("\n");

    return 0;
}