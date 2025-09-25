import java.util.Arrays;

class SetMatrixZero 
{
    public void setMatrixZeroes(int[][] mat) 
    {
        int n = mat.length;                              // total rows
        int m = mat[0].length;                           // total columns

        boolean firstRow = false, firstCol = false;      //  initially first row and column don't need to be zero'd

        // Check if first row has any zero
        for (int j = 0; j < m; j++)                      // looping over first row
        {
            if (mat[0][j] == 0)                          // if any 0 is found
            {
                firstRow = true;                         // whole first row must becomes 0
                break;
            }
        }

        for (int i = 0; i < n; i++)                      // looping over the first column 
        {
            if (mat[i][0] == 0)                          // if any 0 is found
            {
                firstCol = true;                         // whole first column becomes 0
                break;
            }
        }

        for (int i = 1; i < n; i++)                      // looping over rest of the matrox
        {
            for (int j = 1; j < m; j++) 
            {
                if (mat[i][j] == 0)                      // if diagonal elements are 0
                {
                    mat[i][0] = 0;                       // mat[i][0] and mat[0][j] becomes 0
                    mat[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < n; i++)                    //  loop again through the rest:
        {
            for (int j = 1; j < m; j++) 
            {
                if (mat[i][0] == 0 || mat[0][j] == 0)  // If the marker for this row or column is 0
                {
                    mat[i][j] = 0;                     // set mat[i][j] = 0
                }
            }
        }

        if (firstRow)                                  // If the first row is 0
        {
            for (int j = 0; j < m; j++) 
            {
                mat[0][j] = 0;                         // every elements in first row is 0
            }
        }

        if (firstCol)                                  // If the first column is 0
        {
            for (int i = 0; i < n; i++) 
            {
                mat[i][0] = 0;                         // every elements in first column is 0   
            } 
        }
    }

    public static void printMatrix(int[][] mat) 
    {
        for (int[] row : mat) 
        {
            System.out.println(Arrays.toString(row));  // converts the row to a String like [1, 2, 3]
        }
    }

    public static void main(String[] args) 
    {
        SetMatrixZero obj = new SetMatrixZero();

        int[][] mat1 = {{1, 2, 3},
                        {4, 0, 6},
                        {7, 8, 9}};

        System.out.println("Original Matrix:");
        printMatrix(mat1);

        obj.setMatrixZeroes(mat1);

        System.out.println("Final Matrix:");
        printMatrix(mat1);
    }
}
