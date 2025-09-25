class BeautifulMatrix 
{
    public int findMinOperation(int[][] mat)                   // greedy sum equalization approach
    {
        int n = mat.length;                                    // get the matrix size for n×n => n = 3

        int[] rowSum = new int[n];                             // rowSum = [0, 0, 0] 
        int[] colSum = new int[n];                             // colSum = [0, 0, 0]

        int maxSum = 0;                                        // tracks the largest row/column sum
        int totalSum = 0;                                      // will track the sum of all elements

        for (int i = 0; i < n; i++)                            // for mat = [[1, 2, 3], 
        {                                                      //            [4, 2, 3],
            for (int j = 0; j < n; j++)                        //            [3, 2, 1]]
            {
                rowSum[i] += mat[i][j];                        // i  j  mat[i][j]  rowSum     colSum    totalSum
                colSum[j] += mat[i][j];                        // 0	 0	     1	  [1, 0, 0]  [1, 0, 0]	    1
                totalSum  += mat[i][j];                        // 0  1	     2	  [3, 0, 0]	 [1, 2, 0]	    3
                                                               // 0	 2	     3	  [6, 0, 0]	 [1, 2, 3]	    6
                                                               // 1	 0	     4	  [6, 4, 0]	 [5, 2, 3]	   10
                                                               // 1	 1	     2	  [6, 6, 0]	 [5, 4, 3]	   12
                                                               // 1	 2	     3	  [6, 9, 0]	 [5, 4, 6]	   15
                                                               // 2	 0	     3	  [6, 9, 3]	 [8, 4, 6]	   18
                                                               // 2	 1	     2	  [6, 9, 5]	 [8, 6, 6]	   20
                                                               // 2	 2	     1	  [6, 9, 6]	 [8, 6, 7]	   21
                                                               // rowSum = [6, 9, 6] => colSum = [8, 6, 7] => totalSum = 21
            }
        }

        for (int i = 0; i < n; i++)                            
        {
            maxSum = Math.max(maxSum, rowSum[i]);              // (i=0) => maxSum = max(0, 6) = 6
            maxSum = Math.max(maxSum, colSum[i]);              // (i=0) => maxSum = max(6, 8) = 8
        }                                                       // (i=1) => maxSum = max(8, 9) = 9
                                                               // (i=1) => maxSum = max(9, 6) = 9
                                                               // (i=2) => maxSum = max(9, 6) = 9
                                                               // (i=2) => maxSum = max(9, 7) = 9
                                                               // => maxSum = 9

        int target = maxSum * n;                               // target = 9×3 = 27

        return target - totalSum;                              // returns 27-21 = 6 => minimum 6 operations are needed
    }

    public static void main(String[] args) 
    {
        BeautifulMatrix obj = new BeautifulMatrix();

        int[][] mat1 = 
        {
            {1, 2},
            {3, 4}
        };
        System.out.println(obj.findMinOperation(mat1));

        int[][] mat2 = 
        {
            {1, 2, 3},
            {4, 2, 3},
            {3, 2, 1}
        };
        System.out.println(obj.findMinOperation(mat2));
    }
}
