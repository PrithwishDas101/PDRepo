#include <stdio.h>

#define MAX 1000

int main(){

    int n1, n2, arr1[MAX], arr2[MAX], merged[MAX*2];
    
    printf("Enter the size of the first array: ");
    scanf("%d", &n1);

    printf("Now enter a sorted array: \n");
    for (int i = 0; i < n1; i++){
        scanf("%d", &arr1[i]);
    }
    printf("\n");

    printf("Enter the size of the second array: ");
    scanf("%d", &n2);

    printf("Now enter a sorted array: \n");
    for (int i = 0; i < n2; i++){
        scanf("%d", &arr2[i]);
    }
    printf("\n");

    printf("First  array: ");
    for (int i = 0; i < n1;i ++){
        printf("%d", arr1[i]);

        if (i != n1 - 1){
            printf(", ");
        }
    }
    printf("\n");

    printf("Second array: ");
    for (int i = 0; i < n2;i ++){
        printf("%d", arr2[i]);

        if (i != n2 - 1){
            printf(", ");
        }
    }
    printf("\n");

    int i = 0, j = 0, k = 0;

    while (i < n1 && j < n2){
        if (arr1[i] <= arr2[j]){
            merged[k++] = arr1[i++];
        }
        else{
            merged[k++] = arr2[j++];
        }
    }

    while (i < n1){
        merged[k++] = arr1[i++];
    }

    while (j < n2){
        merged[k++] = arr2[j++];
    }

    printf("\nMerged Array: ");
    for (int m = 0; m < k; m++) {
        printf("%d", merged[m]);
        if (m != k-1){
            printf(", ");
        }
    }
    printf("\n");

    return 0;

}