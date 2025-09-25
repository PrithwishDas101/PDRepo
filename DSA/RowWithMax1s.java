class RowWithMax1s
{
    public int rowWithMax1s(int arr[][]) 
    {
        int n = arr.length;
        int m = arr[0].length;                // Stores the number of columns in the first row.        
        int maxRowIndex = -1;                 // by default no rows are found with 1s           => (m=4)
        int j = m - 1;                        // rows are sorted so 0s first 1s later => Start scanning from the 
                                              // top-right corner for 1s => (j=3)
        
        for (int i = 0; i < n; i++)           // for arr[0][3]
        {
            while (j >= 0 && arr[i][j] == 1)  // traversing left to scan for 1s 
            {
                j--;                          // decreasing columns
                maxRowIndex = i;              // updating row index with more 1s
            }
        }
    return maxRowIndex;
    }
    public static void main(String[] args) 
    {
        RowWithMax1s obj = new RowWithMax1s();

        int[][] arr = {{0, 0, 0, 1},
                       {0, 1, 1, 1},
                       {1, 1, 1, 1},
                       {0, 0, 0, 0}};

        int result = obj.rowWithMax1s(arr);

        System.out.println("Row with maximum 1s: " + result);
    }
}