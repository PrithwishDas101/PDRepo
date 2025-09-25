class NumberOfWays 
{
    static final int MOD = 1000000007;

    public int numberOfWays(int n, int x) 
    {
        int maxBase = 1;
        
        while (Math.pow(maxBase, x) <= n) 
        {
            maxBase++;
        }
        maxBase--;

        int[][] dp = new int[maxBase + 1][n + 1];
        
        for (int i = 0; i <= maxBase; i++) 
        {
            for (int j = 0; j <= n; j++) 
            {
                dp[i][j] = -1;
            }
        }

        return countWays(maxBase, n, x, dp);
    }

    private int countWays(int current, int remaining, int x, int[][] dp) 
    {
        if (remaining == 0) 
        {
            return 1;
        }
        
        if (remaining < 0 || current == 0) 
        {
            return 0;
        }

        if (dp[current][remaining] != -1) 
        {
            return dp[current][remaining];
        }

        int power = (int) Math.pow(current, x);

        // Include current number^x if possible
        int include = 0;

        if (power <= remaining) 
        {
            include = countWays(current - 1, remaining - power, x, dp);
        }

        // Exclude current number
        int exclude = countWays(current - 1, remaining, x, dp);

        dp[current][remaining] = (include + exclude) % MOD;
        return dp[current][remaining];
    }
    public static void main(String[] args) 
    {
        NumberOfWays solver = new NumberOfWays();

        int n1 = 10, x1 = 2;
        System.out.println("Ways to express " + n1 + " as sum of " + x1 + "th powers: " + solver.numberOfWays(n1, x1));

        int n2 = 4,  x2 = 1;
        System.out.println("Ways to express " + n2 + " as sum of " + x2 + "th powers: " + solver.numberOfWays(n2, x2));

        int n3 = 160, x3 = 3; 
        System.out.println("Ways to express " + n3 + " as sum of " + x3 + "th powers: " + solver.numberOfWays(n3, x3));
    }
}
