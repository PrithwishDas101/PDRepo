class Celebrity 
{
    public int celebrity(int mat[][]) 
    {
        int candidate = 0;
        int n = mat.length;

        for (int i = 1; i < n; i++) 
        {
            if (mat[candidate][i] == 1) // candidate knows i so it cannot be a celebrity
            {
                candidate = i;
            }
        }

        for (int i = 0; i < n; i++) 
        {
            if (i != candidate) 
            {
                if (mat[candidate][i] == 1 || mat[i][candidate] == 0) // candidate should not know i and i should know candidate
                {
                    return -1;                                        // not a celebrity then
                }
            }
        }

        return candidate;
    }
    public static void main(String[] args) 
    {
        Celebrity obj = new Celebrity();

        int[][] mat = {{0, 1, 1},
                       {0, 0, 1},
                       {0, 0, 0}}; // 0 => does not know and 1=> knows

        int result = obj.celebrity(mat);
        if (result == -1) 
        {
            System.out.println("No celebrity found");
        } 
        else 
        {
            System.out.println("Celebrity is: " + result);
        }
    }
}