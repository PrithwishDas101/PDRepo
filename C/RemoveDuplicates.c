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

    for (int i = 0; i < num; i ++){
        for (int j = i + 1; j < num ; j ++){
            
            if (arr[i] == arr[j]){ // duplicate found

                for (int k = j; k < num - 1; k ++){
                    arr[k] = arr[k+1]; // shift the duplicates to the left
                }
                num--; // eliminating duplicates reduces array size right?
                j--; // after shifting -> a new value comes into arr[j] -> must check arr[j] again before moving on
//                      otherwise we might skip a duplicate
            }
        }
    }

    printf("\nArray without duplicates: ");
    
    for(i = 0; i < num; i++){
        printf("%d ", arr[i]);
    }

    return 0;
}