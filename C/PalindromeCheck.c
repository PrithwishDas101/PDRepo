#include <stdio.h>
#include <string.h>

int main(){

    char str[1000]; // String does not exist in C -> Make array of chars

    int left, right, isPalindrome = 1;

    printf("Enter a string: ");
    scanf("%s", &str);

    left = 0;
    right = strlen(str) - 1;

    while (left < right){
        if (str[left] != str[right]){
            isPalindrome = 0;
            break;
        }

        left++;
        right--;
    }

    if (isPalindrome){
        printf("%s is palindrome. \n", str);
    }
    else{
        printf("%s is NOT palindrome. \n", str);
    }

    return -1;
}