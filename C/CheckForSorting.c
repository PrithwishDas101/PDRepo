#include <stdio.h>

int main(){

    int num, i, isSorted = 1; // assuming array is sorted at first

    printf("Enter the number of elements in the array: ");
    scanf("%d", &num);

    int arr[num];

    printf("Enter array elements: ");
    
    for(i = 0; i < num; i++){
        scanf("%d", &arr[i]);
    }

    for (int i = 0; i < num - 1; i++){

        if (arr[i] > arr[i+1]){
            isSorted = 0;
            break;
        }
    }

    if (isSorted){
        printf("Array is sorted in ascending order");
    }

    else{
        printf("Array is NOT sorted in ascending order");
    }
    return 0;
}