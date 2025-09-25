#include <stdio.h>

int main(){
    int m, n;

    printf("Enter the number of rows and columns for your matrix: ");
    scanf("%d %d", &m, &n);

    int matrix[m][n];

    printf("Enter the elements of your matrix now:\n");
    for (int i = 0; i < m; i++){
        for (int j = 0; j < n; j++){
            scanf("%d", &matrix[i][j]);
        }
    }

    printf("Your Matrix: \n");
    for (int i = 0; i < m; i++){
        for (int j = 0; j < n; j++){
            printf("%d ", matrix[i][j]);
        }
        printf("\n");
    }
    printf("\n");

    int top = 0; // first row index of the current layer
    int bottom = m - 1; // last row index of the current layer
    int left = 0; // first column index
    int right = n - 1; // last column index

    printf("Spiral Matrix: ");

    while (top <= bottom && left <= right){ // keep going as long as rows and columns exist

        // Top row
        for (int i = left; i <= right; i++) // traverse the current top row from the current left to right
            printf("%d ", matrix[top][i]);
        top++; // after printing, move top down by 1 because this row is done

        // Right column
        for (int i = top; i <= bottom; i++) // traverse the current rightmost column from top to bottom
            printf("%d ", matrix[i][right]);
        right--; // after printing, move right left by 1 because this column is done


        // Bottom row
        if (top <= bottom){ // only do this if there’s still a bottom row left (top <= bottom)
            for (int i = right; i >= left; i--) // traverse the current bottom row in reverse right to left
                printf("%d ", matrix[bottom][i]);
            bottom--; // after printing, move bottom up by 1 because this row is done
        }

        // Left column
        if (left <= right){ // only do this if there’s still a bottom row left (top <= bottom)
            for (int i = bottom; i >= top; i--) // traverse the current leftmost column in reverse bottom to top
                printf("%d ", matrix[i][left]);
            left++; // after printing, move left right by 1 because this column is done
        }
    }

    printf("\n");
    return 0;
}
