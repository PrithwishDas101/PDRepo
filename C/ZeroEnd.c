#include <stdio.h>

#define MAX 1000

int main(){

    int n;
    printf("Enter the size of the array: ");
    scanf("%d", &n);

    int arr[MAX];

    printf("Enter the array elements one by one: \n");
    for (int i = 0; i < n; i++){
        scanf("%d", &arr[i]);
    }

    printf("Array: ");
    for (int i = 0;i < n; i++){
        printf("%d", arr[i]);
        if (i < n - 1){
            printf(", ");
        }
    }

    int j = 0; // position for next non zero element

    // moving the non-zero elements to the front
    for (int i = 0; i < n; i++){
        if (arr[i] != 0){
            arr[j++] = arr[i];
        }
    }

    // fill the rest of the array with 0
    while (j < n){
        arr[j++] = 0;
    }

    printf("\nArray: ");
    for (int i = 0;i < n; i++){
        printf("%d", arr[i]);
        if (i < n - 1){
            printf(", ");
        }
    }

    return 0;
}