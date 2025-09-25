#include <stdio.h>

int majorityElement(int arr[], int n){

    int count = 0; // keeps track of 'votes' for the current candidate
    int candidate = -1; // stores the current possible majority element

    for (int i = 0; i < n; i++){

        if (count == 0){ // if we have no current candidate (count==0) 
            candidate = arr[i]; // pick the current element as the new candidate
            count = 1; // start counting 1 vote
        }

        else if (candidate == arr[i]){ // if current element matches the candidate 
            count++; // increment vote count
        }

        else{ // if current element is different 
            count--; // decrement vote count (vote canceled by a different element)
        }
    }

    // at the end of this loop surviving candidate must be the majority element

    count = 0; // resetting the count to verify the candidate

    for (int i = 0; i < n; i++){
        if (arr[i] == candidate){ // counting how many times the candidate actually appears in the array
            count++;
        }
    }

    if (count > n/2){ // if it appears more than half the array 
        return candidate; // it is the majority element
    }

    return -1;
}

int main(){

    int n;

    printf("Enter the size of array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter array elements: ");
    for (int i = 0; i < n; i++){
        scanf("%d", &arr[i]);
    }

    printf("Array: ");
    for (int i = 0; i < n; i++){
        printf("%d ", arr[i]);
    }

    int result = majorityElement(arr, n);

    if (result != -1){
        printf("\nMajority element: %d", result);
    }

    else{
        printf("\nThere is no majority element in your array");
    }

    return 0;
}