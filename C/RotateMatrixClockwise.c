#include <stdio.h>

void rotate90DegreeMatrix(int n, int matrix[n][n]){
    // Transposing the matrix
    for (int i = 0; i < n; i++){
        for (int j = i+1; j < n-1; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }

    // Reversing the matrix next
    for (int i = 0; i < n; i++){
        for (int j = 0; j < n/2; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][n - j - 1];
            matrix[i][n - j - 1] = temp;
        }
    }
} 

int main(){
    int n;

    printf("Enter the size of the square matrix: ");
    scanf("%d", &n);

    int matrix[n][n];

    printf("Enter the matrix elements: \n");
    for (int i = 0; i < n; i++){
        for (int j = 0; j < n; j++){
            scanf("%d", &matrix[i][j]);
        }
    }

    printf("Matrix: \n");
    for (int i = 0; i < n; i++){
        for (int j = 0; j < n; j++){
            printf("%d", matrix[i][j]);
        }
        printf("\n");
    }
    printf("\n");

    rotate90DegreeMatrix(n, matrix);

    printf("Matrix after 90 degree clockwise rotattion: \n");
    for (int i = 0; i < n; i++){
        for (int j = 0; j < n; j++){
            printf("%d", matrix[i][j]);
        }
        printf("\n");
    }
    printf("\n");
}