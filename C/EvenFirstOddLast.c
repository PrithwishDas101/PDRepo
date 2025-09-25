#include <stdio.h>

#define MAX 1000

int main(){
    
    int n;
    printf("Enter the size of the array: ");
    scanf("%d", &n);

    int arr[MAX];

    printf("Enter the array elements one by one: \n");
    for (int i = 0; i < n; i++){
        scanf("%d", &arr[i]);
    }

    printf("Array: ");
    for (int i = 0;i < n; i++){
        printf("%d", arr[i]);
        if (i < n - 1){
            printf(", ");
        }
    }

    int left = 0, right = n - 1;

    while (left < right){
        while (arr[left]  % 2 == 0 && left < right){
            left++;
        }

        while (arr[right] % 2 != 0 && left < right){
            right--;
        }

        if (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    printf("\nArray after segregating even and odd: ");
    for (int i = 0; i < n; i++) {
        printf("%d", arr[i]);
        if (i < n - 1){ 
            printf(", ");
        }
    }
    printf("\n");

    return 0;
}