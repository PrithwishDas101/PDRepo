#include <stdio.h>

int main(){
    int i, j, k, m, n, p, q;

    printf("Enter the number of rows and columns for Matrix A (m, n): ");
    scanf("%d %d", &m, &n);

    printf("\nEnter the number of rows and columns for Matrix B (p, q): ");
    scanf("%d %d", &p, &q);

    if (n!=p){
        printf("\nMatrix multiplication is NOT possible as columns of Matrix A must be equal to the rows of Matrix B");
        return 0;
    }

    int A[m][n], B[p][q], C[m][q];

    printf("Enter the elements of Matrix A: \n");

    for (i = 0; i < m; i++){
        for (j = 0; j < n; j++){
            scanf("%d", &A[i][j]);
        }
    }

    printf("Enter the elements of Matrix B: \n");

    for (i = 0; i < p; i++){
        for (j = 0; j < q; j++){
            scanf("%d", &B[i][j]);
        }
    }

    printf("\nMatrix A: \n");

    for (i = 0; i < m; i ++){
        for (j = 0; j < n; j++){
            printf("%d ", A[i][j]);
        }
    printf("\n");
    }

    printf("\nMatrix B: \n");

    for (i = 0; i < p; i ++){
        for (j = 0; j < q; j++){
            printf("%d ", B[i][j]);
        }
    printf("\n");
    }

    for (i = 0; i < m; i++){
        for (j = 0; j < q; j++){
            C[i][j] = 0;
        }
    }

    for (i = 0; i < m; i++){
        for (j = 0; j < q; j++){
            for (k = 0; k < n; k++){
                C[i][j] += A[i][k] * B[k][j];
            }
        }
    }

    printf("\nResultant Matrix C: \n");

    for (i = 0; i < m; i ++){
        for (j = 0; j < q; j++){
            printf("%d ", C[i][j]);
        }
    printf("\n");
    }

    return 0;
}