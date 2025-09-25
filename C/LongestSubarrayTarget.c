#include <stdio.h>

#define MAX 10000

int main(){ // n = 8 --> arr = {1, 2, 3, 1, 1, 1, 1, 2} --> k = 5

    // sliding window technique
    
    int n; 
    int arr[MAX];

    printf("Enter the size of your array: ");
    scanf("%d", &n);

    printf("Now enter the elements of the array: \n");
    for (int i = 0; i < n; i++){
        scanf("%d", &arr[i]);
    }

    printf("\nArray: ");
    for (int i = 0; i < n; i++){
        printf("%d", arr[i]);
        if (i < n - 1) {
            printf(", ");
        }
    }

    int k;
    
    printf("\nEnter target sum: ");
    scanf("%d", &k);

    int left = 0, right = 0;
    int sum = 0, maxLen = 0;

    while (right < n){ // expand the window by moving right forward and adding arr[right] to sum
        sum += arr[right]; // sum = 1 (arr[0])                                   // sum = 6 (arr[1] + arr[2] + arr[3])             // sum = 5 (arr[2] + arr[3] + arr[4])                   // sum = 
                           // sum = 3 (arr[0] + arr[1])                                                                            // sum = 6 (arr[2] + arr[3] + arr[4] + arr[5])
                           // sum = 6 (arr[0] + arr[1] + arr[2])

        // shrink window until sum <= k
        while (sum > k && left <= right){ // 6 > 5 && 0 <= 2                    // 6 > 5 && 1 < 3                                  // 6 > 5 && 2 < 5
            sum -= arr[left]; // sum = 5 (arr[0] + arr[1] + arr[2] - arr[0])    // sum  = 4 (arr[1] + arr[2] + arr[3] - arr[1])    // sum = 2 (arr[2] + arr[3] + arr[4] + arr[5] - arr[2])
            left++; // left = 1                                                 // left = 2                                        // left = 3
        }

        if (sum == k){ // 5 == 5
            int len = right - left + 1; // len = 2 - 1 + 1 = 2
            if (len > maxLen){ // 2 > 0
                maxLen = len; // maxLen = 2
            }
        }

        right++; // right = 3                                                   // right = 4                                       // right = 5
    }

    printf("Maximum length of subarray with sum %d : %d\n", k, maxLen); // prints 4 as maxLen

    return 0;
}
