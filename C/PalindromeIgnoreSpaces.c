#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main(){

    char str[100];
    char cleaned[100];
    int i, j = 0, len;

    printf("Enter the string: ");
    fgets(str, sizeof(str), stdin); // fgets -> file get string (used for reading input safely).
                                    // str -> where the input will be stored (character array).
                                    // sizeof(str) -> the maximum number of characters to read. 
                                    // stdin -> standard input -> from my keyboard

    for (i = 0; str[i] != '\0'; i++){
        if (cleaned[i] != ' ' && str[i] != '\n'){
            cleaned[j++] = tolower(str[i]);
        }
    }

    cleaned[j] = '\0'; // in C, strings are just arrays of characters. 
                       // But unlike Java String objects, C needs a special marker to know where the string ends 
                       // That marker is the null terminator -> '\0'

    len = strlen(cleaned);

    int isPalindrome = 1;

    for (i = 0; i < len/2; i++){
        if (cleaned[i] != cleaned[len - i - 1]){
            isPalindrome = 0;
            break;
        }
    }

    if (isPalindrome){
        printf("\n%s is palindrome\n", str);
    }

    else{
        printf("\n%s is NOT palindrome\n", str);
    }

    return 0;
}