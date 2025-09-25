import java.util.*;

class ApplyingDifference
{
    public ArrayList<ArrayList<Integer>> applyDiff2D(int[][] mat, int[][] opr) 
    {
        int n = mat.length;                                            // number of rows 
        int m = mat[0].length;                                         // number of columns

        int[][] diff = new int[n + 2][m + 2];                          // +2 is a safety buffer for adding/subtracting at r2+1 and c2+1

        for (int[] op : opr) 
        {
            int v  = op[0];                                            // adds v to the submatrix from (r1,c1) to (r2,c2)
            int r1 = op[1];
            int c1 = op[2];
            int r2 = op[3];
            int c2 = op[4];

            diff[r1][c1] += v;                                         // adding v to the top-left of the submatrix

            if (r2 + 1 < n) 
            {
                diff[r2 + 1][c1] -= v;                                 // subtracting v below the submatrix to cut off the addition when summed row-wi
            }

            if (c2 + 1 < m) 
            {
                diff[r1][c2 + 1] -= v;                                 // subtract v to the right to cut off addition when summed column-wise
            }
            
            if (r2 + 1 < n && c2 + 1 < m) 
            {
                diff[r2 + 1][c2 + 1] += v;                             // subtract v to the right to cut off addition when summed column-wise
            }
        }

        for (int i = 0; i < n; i++) 
        {
            for (int j = 1; j < m; j++) 
            {
                diff[i][j] += diff[i][j - 1];                          // for each row => convert difference values to real row sums
            }
        }

        for (int j = 0; j < m; j++) 
        {
            for (int i = 1; i < n; i++) 
            {
                diff[i][j] += diff[i - 1][j];                          // for each column => propagate row sums vertically to finalize the 2D prefix
            }
        }

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) 
        {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) 
            {
                row.add(mat[i][j] + diff[i][j]);                      // final value = original value + diff update
            }
            res.add(row);                                             // adding row to result
        }

        return res;
    }

    public static void main(String[] args) 
    {
        ApplyingDifference obj = new ApplyingDifference();
        
        int[][] mat = 
        {
            {1, 2, 3},
            {1, 1, 0},
            {4, -2, 2}
        };

        int[][] opr = 
        {
            {2, 0, 0, 1, 1},
            {-1, 1, 0, 2, 2}
        };

        ArrayList<ArrayList<Integer>> result = obj.applyDiff2D(mat, opr);

        for (ArrayList<Integer> row : result) 
        {
            System.out.println(row);
        }
    }
}
