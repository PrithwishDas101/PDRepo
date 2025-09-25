#include <stdio.h>
#include <string.h> // for strlen
#include <ctype.h> // for tolower

int main(){
    char str[1000];
    int i, j, len;

    printf("Enter a string you wish to reverse: ");
    fgets(str, sizeof(str), stdin);

    len = strlen(str);
    
    if (str[len - 1] == '\n'){
        str[len - 1] = '\0';
        len--;
    }

    i = 0;
    j = len - 1;


    while (i < j){
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;

        i++;
        j--;
    }

    printf("Reversed String = %s", str);

    return 0;
}