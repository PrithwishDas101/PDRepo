#include <stdio.h>  // lets us use printf and scanf (input/output functions)
#include <string.h> // lets us use string functions (like strlen later if needed)

#define MAX 256 // #define is a preprocessor directive -> it tells the compiler to replace every MAX in the code with 
//                 256 before compiling. ASCII table goes from 0 to 255 -> that’s 256 total characters (includes 
//                 letters, digits, symbols, control chars)

char firstNonRepeatingChar (char str[]){
    int freq[MAX] = {0}; // declares an array called freq of size MAX (256) -> freq[0], freq[1], freq[2], ... freq[255]
//                          The {0} means: "set the first element to 0" -> automatically all the other elements are also
//                          set to 0 -> freq[0] = 0 , freq[1] = 0 , freq[2] = 0 ... freq[255] = 0. This is important.
//                          Otherwise garbage value would be stored in freq (eg. -> freq[0] = -1, freq[1] = -87654, 
//                          freq[2] = -2387 ... freq[255] = 867576)
    int i; // counter variable for loops

    for (i = 0; str[i] != '\0'; i++){ // str[i] != '\0' -> keep going until we hit the end of the string
//                                       In C, strings are just arrays of characters ending with a special invisible 
//                                       symbol: '\0' (null character).
//                                       eg. -> "swiss" -> str[0] = 's' , str[1] = 'w' , str[2] = 'i' , str[3] = 's' , 
//                                       str[4] = 's' , str[5] = '\0' <--- marks end of string
        freq[(unsigned char)str[i]]++; // in C, char can sometimes be signed (can hold negative values). If you use 
//                                        char directly as an array index, and it turns out negative,  you get array 
//                                        out-of-bounds. By casting to unsigned char, we guarantee it’s 0–255 only
//                                        for "swiss":
//                                        str[0] = 's' -> freq[115]++ -> freq[115] = 1
//                                        str[1] = 'w' -> freq[119]++ -> freq[119] = 1
//                                        str[2] = 'i' -> freq[105]++ -> freq[105] = 1
//                                        str[3] = 's' -> freq[115]++ -> freq[115] = 2
//                                        str[4] = 's' -> freq[115]++ -> freq[115] = 3
    }

    for (i = 0; str[i] != '\0'; i++){ // from 0 to 5

        if (freq[(unsigned char)str[i]] == 1){ // for str[1] -> freq[119] == 1
            return str[i]; // returns freq[119] -> returns w
        }
    }

    return -1; // in case no non repeating characters are found we return -1 (default process)
}

int main(){
    char str[1000];

    printf("Enter a string: ");
    scanf("%s", str);

    char result = firstNonRepeatingChar(str);

    if (result == -1){
        printf("No non repeating character in your string\n");
    }
    else{
        printf("First non repeating character: %c\n", result);
    }

    return 0;
}