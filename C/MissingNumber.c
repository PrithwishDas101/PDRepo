#include <stdio.h>

int findMissingNumber(int arr[], int n)
{ // arr = {1, 3, 4, 5}, n = 5

    // XOR Partition Trick / XOR Bucketing Method

    int xor1 = 0; // XOR of numbers from 1 to n
    int xor2 = 0; // XOR of array elements

    // XOR all numbers from 1 to n
    for (int i = 1; i <= n; i++)
    {
        xor1 ^= i; // xor1 = (1^2) ^ (3^4) ^ 5 = (3^7) ^ 5 = 4^7 = 1
    }

    // XOR all elements in the array
    for (int i = 0; i < n - 1; i++)
    {
        xor2 ^= arr[i]; // xor2 = (1^3) ^ (4^5) = 2^1 = 3
    }

    // missing number will be xor1^xor2
    return xor1 ^ xor2; // 1^3 = 2
}

int main()
{

    int n;

    printf("Enter the size of array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter elements into the array: \n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("Array: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d", arr[i]);

        if (i < n - 1)
        {
            printf(", ");
        }
    }

    printf("\nMissing number in your array: %d", findMissingNumber(arr, n));

    return 0;
}