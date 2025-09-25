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

    printf("Current Array: ");

    for(int i = 0; i < num; i++){
        printf("%d ", arr[i]);
    }

    int left = 0; 
    int right = num - 1;

    while (left < right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        left++;
        right--;
    }

    printf("\nThe new reversed array: ");

    for(int i = 0; i < num; i++){
        printf("%d ", arr[i]);
    }
}