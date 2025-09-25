#include <stdio.h>

#define MAX 1000

void reverseArray(int arr[], int start, int end){ // standard reversing array elements
    while (start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}

int main(){
    int n, k;

    printf("Enter the size of array: ");
    scanf("%d", &n);

    if (n > MAX){
        printf("Size exceeds maximum limit of %d\n", MAX);
        return 1;
    }

    int arr[MAX];

    printf("Enter the elements into the array: \n");
    for (int i = 0; i < n; i++){
        scanf("%d", &arr[i]);
    }

    printf("Your array: ");
    for (int i = 0; i < n; i++){
        printf("%d", arr[i]);
        if (i != n - 1) {
            printf(", ");
        }
    }
    printf("\n");

    printf("Enter the number of positions to rotate: ", k);
    scanf("%d", &k);

    // for when k > n
    k = k % n;

    reverseArray(arr, 0, n - 1); // reverse the whole array

    reverseArray(arr, 0, k - 1); // reverse the first few kth elements from the wholly reversed array

    reverseArray(arr, k, n - 1); // reverse element from the kth position to the end of the array so array is reversed only k times irl

    printf("Array after rotating %d positions to the right: ", k);
    for (int i = 0; i < n; i++) {
        printf("%d", arr[i]);
        if (i != n - 1) printf(", ");
    }
    printf("\n");

    return 0;
}