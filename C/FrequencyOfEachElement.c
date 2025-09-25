#include <stdio.h>

int main(){

    int num, i, j, count;

    printf("Enter the number of elements: ");
    scanf("%d", &num);

    int arr[num];
    int freq[num];

    printf("Enter array elements: ");

    for (i = 0; i < num; i++){
        scanf("%d", &arr[i]);
        freq[i] = -1; // cuz not yet counted
    }

    for(i = 0; i < num; i++){
        count = 1; // since the element itself exists once 

        if (freq[i] != 0){ // if not a duplicate

            for (j = i+1; j < num; j++){ // to compare the next elements side by side

                if (arr[i] == arr[j]){ // if another element arr[j] matches the current element arr[i]

                    count++; // increase the frequency count
                    freq[j] = 0; // Marking this duplicate position as visited
                }
            }

            freq[i] = count; // storing the total frequency for the current element at freq[i]
        }
    }

    printf("\nElement frequencies:\n");
    for (i = 0; i < num; i++){
        if (freq[i] != 0){
            printf("%d ---> %d\n", arr[i], freq[i]);
        }
    }

    return 0;
}