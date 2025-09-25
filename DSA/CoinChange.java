class CoinChange 
{
    public int count(int coins[], int sum) 
    {
        int[] dp = new int[sum + 1];        // to cover index 0 to sum.

        dp[0] = 1;

        for (int coin : coins) 
        {
            for (int i = coin; i <= sum; i++) 
            {
                dp[i] += dp[i - coin];      // for coin = 2
                                            // (i=2) => dp[2] += dp[0] => make 0, adding 2 makes 2
                                            // (i=3) => dp[3] += dp[1] => make 1, adding 2 makes 3
                                            // (i=4) => dp[4] += dp[2] => make 2, adding 2 makes 4
            }
        }
        return dp[sum];                     // for sum 4 from coins [1, 2, 3] returns 3
    }
    public static void main(String[] args) {
        CoinChange coin = new CoinChange();

        int[] coins = {1, 2, 3}; 
        int sum = 4;             

        int ways = coin.count(coins, sum);

        System.out.println("Number of ways to make sum " + sum + ": " + ways);
    }
}