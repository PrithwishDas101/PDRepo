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
            printf("%d ", matrix[i][j]);
        }
        printf("\n");
    }

    int found = 0;

    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
           int isMax = 1;
           
           // di = change in row
           // dj = change in column
           for (int di = -1; di <= 1; di++){  // (-1,-1) (-1,0) (-1,1)
            for (int dj = -1; dj <= 1; dj++){ // (0, -1) (0, 0) (0, 1)
                                              // (1, -1) (1, 0) (1, 1)
                if (di == 0 && dj == 0){ // if (0, 0) --> the element itself whose neighbours we are checking
                    continue; // skip this because we are checking this position for the saddle point itself
                }

                int ni = i + di; // ni, nj --> actual row & column of neighbor
                int nj = j + dj; // current (i,j) --> (1,1), di = -1, dj = 0 -> neighbor is (0,1)

                if (ni >= 0 && ni < m && nj >= 0 && nj < n){ // so we don't go out of bounds (edges and corners)
                    if (matrix[i][j] <= matrix[ni][nj]){ // if any neighbor is greater or equal to current element
                        isMax = 0; // current element is not local maxima
                        break;
                    }
                }
            }
           }
            if (isMax){
                    printf ("%d at (%d, %d) is a local maxima", matrix[i][j], i+1, j+1); // i+1 & j+1 (for 0 based indexing)
                    found = 1;
                }
        } 
    }

    if (!found){
        printf("There is no local maxima in your matrix");
    }

    return 0;
}