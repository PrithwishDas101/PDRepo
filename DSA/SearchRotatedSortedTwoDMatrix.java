class SearchRotatedSortedTwoDMatrix
{
    public static boolean searchMatrix(int mat[][], int x) //  [[7, 8, 9, 10], [11, 12, 13, 1], [2, 3, 4, 5]] 
    {
        int n = mat.length;                         // stores number of rows    => n = 3
        int m = mat[0].length;                      // stores number of columns => m = 4

                                                    // flatlined 1D array = [7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5]

        int low = 0;                                // starting point is always the first element
        int high = n*m - 1;                         // 2D array is flatlined into a strictly increasing order 1D array 
                                                    // n*m = 12 but n*m - 1 = 11 => 11 is the actual length as index starts from 0 

        while (low <= high)                         // to prevent out of bounds
        {
            int mid = low + (high - low) / 2;       // mid formula for flatlined 1D array => mid = 0 + (11-0)/2 = 5 

            int row = mid / m;                      // every m elements complete one row => row = 5/4 = 1
            int col = mid % m;                      // remainder after dividing by number of columns tells us the column position inside that row = 5%4 = 1
            int midVal = mat[row][col];             // midVal = 12

            if (midVal == x)                        // standard method  
            {
                return true;
            }

            int firstVal = mat[0][0];               // first element of the matrix (top-left corner) = 7

            if ((midVal >= firstVal) == (x >= firstVal)) // if both midVal (12) and x (3) are >= firstVal, then they’re both in the left (bigger) half of the rotated array
            {
                if (x < midVal)                          // standard process
                {
                    high = mid - 1;
                } 

                else 
                {
                    low = mid + 1;
                }
            } 
            
            else 
            {
                if (midVal >= firstVal)                  // if midVal (12) >= firstVal (7) => mid is in the left half => so target must be on the right half 
                {
                    low = mid + 1;                       // standard process
                } 
                
                else 
                {
                    high = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mat1 = {
            {7, 8, 9, 10},
            {11, 12, 13, 1},
            {2, 3, 4, 5}
        };
        int x1 = 3;

        System.out.println(searchMatrix(mat1, x1)); // true

        int[][] mat2 = {
            {6, 7, 8},
            {9, 1, 2},
            {3, 4, 5}
        };
        int x2 = 10;

        System.out.println(searchMatrix(mat2, x2)); // false
    }
}