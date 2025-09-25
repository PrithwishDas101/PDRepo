#include <stdio.h>
#include <ctype.h> // for tolower()

int main(){

    char str[1000];
    int i, vowel = 0, consonant = 0;

    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);

    for(i = 0; str[i] != '\0' ; i++){
        char ch = tolower((unsigned char)str[i]);

        if (ch >= 'a' && ch <= 'z'){

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowel++;
            }

            else{
                consonant++;
            }
        }
    }

    printf("Vowels: %d \n", vowel);
    printf("Consonants: %d \n", consonant);

    return 0;
}