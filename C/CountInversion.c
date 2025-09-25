#include <stdio.h>
#include <stdlib.h>

#define MAX 100000

long long merge_Count (int arr[], int temp[], int left, int mid, int right){
    int i = left; // start of the left subarray
    int j = mid + 1; // start of the right subarray
    int k = left; // start of the temp array

    long long inv_count = 0;

    while (i <= mid && j <= right){
        if (arr[i] <= arr[j]){
            temp[k++] = arr[i++];
        }

        else{
            temp[k++] = arr[j++];
            inv_count += (mid - i + 1); // all remaining elements in the left subarray are inversions
        }
    }

    while (i <= mid){
        temp[k++] = arr[i++];
    }

    while (j <= right){
        temp[k++] = arr[j++];
    }

    for (i = left; i <= right; i++){
        arr[i] = temp[i];
    }

    return inv_count;
}

long long mergeSort_Count (int arr[], int temp[], int left, int right){
    long long inv_count = 0;

    if (left < right){
        int mid = (left + right) / 2;
        
        inv_count += mergeSort_Count (arr, temp, left, mid);
        inv_count += mergeSort_Count (arr, temp, mid + 1, right);
        inv_count += merge_Count (arr, temp, left, mid, right);
    }

    return inv_count;
}

int bruteForceCount (int arr[], int n){

    int inversions = 0;

    for (int i = 0; i < n - 1; i++){
        for (int j = i + 1; j < n; j++){
            if (arr[i] > arr[j]){
                inversions++;
            }
        }
    }

    return inversions;
}

int main(){

    int n;
    int arr[MAX], temp[MAX];

    printf("Enter the size of the array: ");
    scanf("%d", &n);

    printf("Enter the array elements: \n");
    for (int i = 0; i < n; i++){
        scanf("%d", &arr[i]);
    }
    printf("\n");

    printf("Your array: ");
    for (int i = 0; i < n; i++){
        printf("%d", arr[i]);

        if (i < n - 1){
            printf(", ");
        }
    }

    long long inv_count = mergeSort_Count(arr, temp, 0, n - 1);

    printf("\nNumber of inversions %lld\n", inv_count);

    return 0;
}