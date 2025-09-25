// Kadane'a Algorithm

#include <stdio.h>

int main(){
    int i, n;

    printf("Enter the number of elements in your array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Now enter the array elements one by one: ");
    for (i = 0; i < n; i++){
        scanf("%d", &arr[i]);
    }

    printf("Array elements: ");
    for (i = 0; i < n; i++){
        printf("%d ", arr[i]);
    }

    int maxSoFar = arr[0];
    int currMax  = arr[0];

    for (i = 1; i < n; i++){
        currMax = (arr[i] > arr[i] + currMax) ? arr[i] : arr[i] + currMax;

        if (currMax > maxSoFar){
            maxSoFar = currMax;
        }
    }

    printf("\nMaximum Subarray sum: %d\n ", maxSoFar);

    return 0;
}