#include <stdio.h>

int main(){

    int num, i;

    printf("Enter the number of elements of array: ");
    scanf("%d", &num);

    int arr[num];

    printf("Enter the array elements: ");
    
    for(int i = 0; i < num; i++){
        scanf("%d", &arr[i]);
    }

    int first = -1e9; // smallest initial values
    int second = -1e9; // smallest initial values

    for (i = 0; i < num; i++){

        if (arr[i] > first){ // checking if the cuurent element is bigger than the largest element 
            second = first;  // the previous largest element becomes the second largest element
            first = arr[i];  // and the current element becomes the current largest element
        }

        else if (arr[i] > second && arr[i] != first){ // checking if current element is bigger than the current 
//                                                       second largest element and if it is not equal to the curent 
//                                                       largest element in the array [needed case because in an array [10, 30, 25] -> arr[0]: first = 10, second = -1e9 -> arr[1] -> See 30: -> second = 10, first = 30 -> arr[2] -> See 25: not bigger than first, but bigger than second (10) -> update second = 25]
            second = arr[i]; // then current element becomes the second largest element 
        }
    }

    if (second == -1e9){
        printf("No such second largest element exist");
    }

    else{
        printf("The second largest element is %d", second);
    }

    return 0;
}