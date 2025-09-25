#include <stdio.h>

#define MAX 1000 // maximum size of array

int main(){

    int n;

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

    int maxLen = 0;

    for (int start = 0; start < n; start++){
        int sum = 0;

        for (int end = start; end < n; end++){
            sum += arr[end];

            if (sum == 0){
                int len = end - start + 1;

                if (len > maxLen){
                    maxLen = len;
                }
            }
        }
    }

    printf("\nLength of the largest subarray of sum 0 = %d\n", maxLen);

    return 0;
}
