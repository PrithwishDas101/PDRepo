#include <stdio.h>

int main() {
    int num, i;

    printf("Enter the number of elements: ");
    scanf("%d", &num);

    int arr[num];

    printf("Enter %d elements: ", num);

    for (i = 0; i < num; i++) {
        scanf("%d", &arr[i]);
    }

    int max = arr[0];
    int min = arr[0];

    for (i = 1; i < num; i++){

        if (arr[i] > max){
            max = arr[i];
        }

        if (arr[i] < min){
            min = arr[i];
        }
    }

    printf("The largest  element: %d\n", max);
    printf("The smallest element: %d\n", min);

    return 0;
}
