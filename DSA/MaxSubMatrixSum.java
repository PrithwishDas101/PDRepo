class MaxSubMatrixSum 
{
    public int maxRectSum(int[][] mat)                              // mat = [[ 1,  2, -1, -4, -20], [-8, -3,  4,  2,   1], [ 3,  8, 10,  1,   3], [-4, -1,  1,  7,  -6]]
    {
        int R = mat.length;                                         // number of rows      = 4
        int C = mat[0].length;                                      // number of columns   = 5
        int maxSum = Integer.MIN_VALUE;                             // to hold maximum sum

        for (int left = 0; left < C; left++) 
        {
            int[] temp = new int[R];                                // from left columns => store row sums

            for (int right = left; right < C; right++)              // expanding right column => right runs from left to last column
            {

                for (int i = 0; i < R; i++) 
                {
                    temp[i] += mat[i][right];                       // add the value mat[i][right] to temp[i] 
                                                                    // temp = sum of rows between columns left and right
                                                                    // temp[0] +=  1 =>  1
                                                                    // temp[1] += -8 => -8
                                                                    // temp[2] +=  3 =>  3
                                                                    // temp[3] += -4 => -4
                }

                int sum = kadane(temp);
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;                                               // returns 29
    }

    private int kadane(int[] arr) 
    {
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) 
        {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]); 
            maxSoFar = Math.max(maxSoFar, maxEndingHere);              // (i=0) => maxSoFar = 1
                                                                       // (i=1) => maxEndingHere = max(-8,1-8)  = -7 => maxSoFar = 1
                                                                       // (i=2) => maxEndingHere = max(3, -7+3) =  3 => maxSoFar = 3
                                                                       // (i=3) => maxEndingHere = max(-4, 3-4) = -1 => maxSoFar = 3
        }

        return maxSoFar;
    }
    public static void main(String[] args) 
    {
        MaxSubMatrixSum ob = new MaxSubMatrixSum();

        int[][] mat1 = {{1, 2, -1, -4, -20},
                        {-8, -3, 4, 2, 1},
                        {3, 8, 10, 1, 3},
                        {-4, -1, 1, 7, -6}};

        int[][] mat2 = {{-1, -2},
                        {-3, -4}};

        System.out.println(ob.maxRectSum(mat1));
        System.out.println(ob.maxRectSum(mat2));
    }
}
