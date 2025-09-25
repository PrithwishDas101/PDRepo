#include <stdio.h>

#define MAX 100000

int main(){

    int n, height[MAX];

    printf("Enter the number of bars: ");
    scanf("%d", &n);

    printf("Enter the heights of each bar: \n");
    for (int i = 0; i < n; i++){
        scanf("%d", &height[i]);
    }

    printf("\nArray: ");
    for (int i = 0; i < n; i++){
        printf("%d", height[i]);

        if (i < n - 1){
            printf(", ");
        }
    }

    int maxLeft[MAX], maxRight[MAX];

    maxLeft[0] = height[0];

    for (int i = 1; i < n; i++){
        maxLeft[i] = (height[i] > maxLeft[i - 1]) ? height[i] : maxLeft[i - 1];
    }

    maxRight[n - 1] = height[n - 1];

    for (int i = n - 2; i >= 0; i--){
        maxRight[i] = (height[i] > maxRight[i + 1]) ? height[i] : maxRight[i + 1];
    }

    long long water = 0;

    for (int i = 0; i < n; i++){
        int trapped = (maxLeft[i] < maxRight[i]) ? maxLeft[i] : maxRight[i];
        trapped -= height[i];

        if (trapped > 0){
            water += trapped;
        }
    }

    printf("\nTotal water trapped: %lld", water);

    return 0;
}