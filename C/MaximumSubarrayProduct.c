#include <stdio.h>

int maxProductSubarray(int arr[], int n){

    int maxSoFar = arr[0];
    int maxProd  = arr[0];
    int minProd  = arr[0];

    for (int i = 0; i < n; i++){
        if (arr[i] < 0){
            int temp = maxProd;
            maxProd = minProd;
            minProd = temp;
        }

        maxProd = (arr[i] > arr[i] * maxProd) ? arr[i] : arr[i] * maxProd;
        minProd = (arr[i] < arr[i] * minProd) ? arr[i] : arr[i] * minProd;

        if (maxProd > maxSoFar){
            maxSoFar = maxProd;
        }
    }

    return maxSoFar;
}

int main(){

    int n;

    printf("Enter the number of elements in your array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter the array elements: ");
    for (int i = 0; i < n; i++){
        scanf("%d", &arr[i]);
    }

    printf("Array: ");
    for (int i = 0; i < n; i++){
        printf("%d ", arr[i]);
    }
    printf("\n");

    int result = maxProductSubarray(arr, n);
    printf("Maximum subarray product: %d\n", result);

    return 0;
}