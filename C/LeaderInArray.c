#include <stdio.h>

#define MAX 1000

int main(){
    int n;
    int arr[MAX];

    printf("Enter the size of the array: ");
    scanf("%d", &n);

    printf("Enter the array elements one by one: \n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Original array: ");
    for (int i = 0; i < n; i++) {
        printf("%d", arr[i]);
        if (i < n - 1){ 
            printf(", ");
        }
    }
    printf("\n");

    printf("Leaders of the array: ");

    int maxFromRight = arr[n - 1];
    printf("%d", maxFromRight); // rightmost element is always a leader

    for (int i = n - 2; i >= 0; i--){ // traverse from the 2nd rightmost element 
        if (arr[i] > maxFromRight){
            maxFromRight = arr[i];
            printf(", %d", maxFromRight);
        }
    }

    return 0;
}