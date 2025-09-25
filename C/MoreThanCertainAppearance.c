#include <stdio.h>

int main(){

    int n;

    printf("Enter the size of array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter the array elements: \n");
    for (int i = 0; i < n; i++){
        scanf("%d", &arr[i]);
    }

    printf("Array: ");
    for (int i = 0; i < n; i++){
        printf("%d ", arr[i]);
    }

    int candidate1 = -1; int candidate2 = -1;
    int count1 = 0; int count2 = 0;

    for (int i = 0; i < n; i++){
        if (arr[i] == candidate1){
            count1++;
        }

        else if (arr[i] == candidate2){
            count2++;
        }

        else if (count1 == 0){
            candidate1 = arr[i];
            count1 = 1;
        }

        else if (count2 == 0){
            candidate2 = arr[i];
            count2 = 1;
        }

        else{
            count1--;
            count2--;
        }
    }

    count1 = 0; count2 = 0;

    for (int i = 0; i < n; i++){
        if (arr[i] == candidate1){
            count1++;
        }

        else if (arr[i] == candidate2){
            count2++;
        }
    }

    int threshold = n/3;
    int found = 0;

    printf("\nElements that appeared n/3 times or more: ");

    if (count1 > n/3){
        found = 1;
        printf("%d", candidate1);
    }

    if (count2 > n/3){
        found = 1;
        printf("%d", candidate2);
    }

    if (!found){
        printf("None");
    }

    return 0;
}