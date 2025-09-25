#include <stdio.h>
#include <ctype.h>
#include <string.h>

int main(){

    char str1[1000], str2[1000];
    int freq1[26] = {0};
    int freq2[26] = {0};

    printf("Check if two strings are Anagram or NOT\n");

    printf("\nEnter the first word: ");
    scanf(" %[^\n]s", str1); 

    printf("Enter the second word: ");
    scanf(" %[^\n]s", str2); 

    for (int i = 0; str1[i] != '\0'; i++) {
        if (isalpha(str1[i])) {
            freq1[tolower(str1[i]) - 'a']++;
        }
    }

    for (int i = 0; str2[i] != '\0'; i++) {
        if (isalpha(str2[i])) {
            freq2[tolower(str2[i]) - 'a']++;
        }
    }

    int isAnagram = 1; 

    for (int i = 0; i < 26; i++) {
        if (freq1[i] != freq2[i]) {
            isAnagram = 0;
            break;
        }
    }

    if (isAnagram) {
        printf("\nYes, the strings are anagrams of one another\n");
    } else {
        printf("\nNo, the strings are NOT anagrams\n");
    }

    return 0;
}
