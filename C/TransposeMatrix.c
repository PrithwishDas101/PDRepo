#include <stdio.h>

int main() {
    int m, n, i, j;

    printf("Enter the number of rows and columns for the matrix: \n");
    scanf("%d %d", &m, &n);

    int mat[m][n];
    int trans[n][m];

    printf("Enter the matrix elements:\n");
    for (i = 0; i < m; i++){
        for (j = 0; j < n; j++){
            scanf("%d", &mat[i][j]);
        }
    }

    printf("\nYour matrix: \n");

    for(i = 0; i < m; i++){
        for (j = 0;j < n; j++)
        {
            printf("%d ", mat[i][j]);
        }
    printf("\n");
    }

    for (i = 0; i < m; i++){
        for (j = 0; j < n; j++){
            trans[j][i] = mat[i][j];
        }
    }

    printf("\nThe transpose of your matrix:\n");
    for (i = 0; i < n; i++){
        for (j = 0; j < m; j++){
            printf("%d ", trans[i][j]);
        }
        printf("\n");
    }

    return 0;
}
