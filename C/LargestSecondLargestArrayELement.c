#include <stdio.h>
#include <limits.h> // for INT_MIN

int main(){
    int n, i;

    printf("Enter the number of elements in the Array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter %d elements: \n", n);
    for (i = 0; i < n; i++){
        scanf("%d", &arr[i]);
    }

    int largest = INT_MIN;
    int secondLargest = INT_MIN;

    for (i = 0; i < n; i++){
        if (arr[i] > largest){
            secondLargest = largest;
            largest = arr[i];
        } 
        
        else if (arr[i] > secondLargest && arr[i] != largest){
            secondLargest = arr[i];
        }
    }

    {printf("The largest element is: %d\n", largest);

    if (secondLargest == INT_MIN) 
    {
        printf("There is no second largest element (all elements may be equal).\n");
    } 
    
    else 
    {
        printf("The second largest element is: %d\n", secondLargest);
    }

    return 0;
}
}
