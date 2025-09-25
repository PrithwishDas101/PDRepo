class SearchingInRowColumnSortedMatrix 
{
    public static boolean searchMatrix(int[][] mat, int x) 
    {
        int n = mat.length;         // stores number of rows
        int m = mat[0].length;      // stores number of columns

        int i = 0, j = m - 1;       // start at first row last column, i.e, top right

        while (i < n && j >= 0)     // staying within the bounds of the matrix
        {
            if (mat[i][j] == x)     // if we find the required element 
            {
                return true; 
            }

            else if (mat[i][j] > x) // if the current element is too big move left to smaller numbers in the same row
            {
                j--;
            }

            else                    // if the current element is too small move down to bigger numbers in the same column
            {
                i++;
            }
        }

        return false;               // return nothing when element is not found
    }

    public static void main(String[] args) 
    {
        int[][] mat1 = {{3, 30, 38},
                        {20, 52, 54},
                        {35, 60, 69}};
        int x1 = 62;

        int[][] mat2 = {{18, 21, 27},
                        {38, 55, 67}};
        int x2 = 55;

        int[][] mat3 = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
        int x3 = 3;

        System.out.println(searchMatrix(mat1, x1));
        System.out.println(searchMatrix(mat2, x2));
        System.out.println(searchMatrix(mat3, x3));
    }
}
