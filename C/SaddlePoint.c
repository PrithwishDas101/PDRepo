#include <stdio.h>

int main(){

    int m, n;

    printf("Enter number of rows and columns: ");
    scanf("%d %d", &m, &n);

    int matrix[m][n];

    printf("Enter Matrix elements: \n");
    for (int i = 0; i < m; i++){
        for (int j = 0; j < n; j++){
            scanf("%d", &matrix[i][j]);
        }
    }
    printf("\n");

    printf("Matrix: \n");
    for (int i = 0; i < m; i++){
        for (int j = 0; j < n; j++){
            printf(" | %d | ", matrix[i][j]);
        }
        printf("\n");
    }

    int found = 0;

    for (int i = 0; i < m; i++){
        int rowMin = matrix[i][0];
        int colIndex = 0;

        for (int j = 1; j < n; j++){
            if (matrix[i][j] < rowMin){
                rowMin = matrix[i][j];
                colIndex = j;
            }
        }

        int isSaddle  = 1;

        for (int k = 0; k < m; k++){
            if (matrix[k][colIndex] > rowMin){
                isSaddle = 0;
                break;
            }
        }

        if (isSaddle){
        printf("\nSaddle point found: %d (at row %d, col %d)\n", rowMin, i + 1, colIndex + 1);
        found = 1;
        }
    }

    if (!found){
        printf("No saddle point found in the matrix");
    }

    printf("\n");

    return 0;
}