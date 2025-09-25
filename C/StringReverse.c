#include <stdio.h>
#include <string.h>

void reverseWord (char word[], int start, int end){ // standard reversing characters using 2 pointers
    while (start < end){
        char temp = word[start];
        word[start] = word[end];
        word[end] = temp;
        start++;
        end--;
    }
}

int main(){

    char word[1000];

    printf("Enter a sentence: ");
    scanf(" %[^\n]s", &word); // accepts full line including spaces

    int start = 0;
    int len = strlen(word);

    for (int i = 0; i <= len; i++){ // i <= len --> last character is at str[len-1] and str[len] is '\0'
        if (word[i] == ' ' || word[i] == '\0'){ // checking if we reached the end of a word with ' '
                                                // checking if we reached the end of the sentence with '\0'
            reverseWord(word, start, i - 1); // reversing pulls up --> send the word after word
                                             // start --> index where this word started
                                             // i - 1 --> index of the last character of the word
            start = i + 1; // after reversing the current word --> update start to the beginning of the next word
                           // i + 1 --> points to the first character after the space
                           // this ensures the next word is reversed correctly when the loop continues
        }
    }

    printf("Reverse word = %s\n", word);

    return 0;

}