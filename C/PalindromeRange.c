#include <stdio.h>

int isPalindrome(int n){
    int original = n;
    int reverse  = 0;

    while (n != 0){
        int digit = n % 10;
        reverse = reverse*10 + digit;
        n /= 10;
    }

    return original == reverse;
}

int main(){
    int i, m, n;

    printf("Enter the range (m - n): ");
    scanf("%d %d", &m, &n);

    printf("\n The Palindrome numbers in the rangge of %d to %d are: ", m, n);

    for (i = m; i <= n; i++){
        if (isPalindrome(i)){
            printf("%d ", i);
        }
    }
    printf("\n");

    return 0;
}