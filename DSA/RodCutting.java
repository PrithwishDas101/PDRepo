public class RodCutting 
{
    public static int cutRod(int[] price)                              // price[] = [1, 5, 8, 9, 10, 17, 17, 20]
    {
        int n = price.length;                                          // n = 8
        int[] dp = new int[n + 1];                                     // size (n+1) so index 0 to n is valid
        dp[0] = 0;                                                     // if rod length = 0 => max price is 0 => No cuts

        for (int i = 1; i <= n; i++)                                   // up from length 1 to n
        {
            int maxVal = Integer.MIN_VALUE;                            // starting with smallest value => compare properly

            for (int j = 1; j <= i; j++)                               // Trying every first cut length j (from 1 to i)
            {
                maxVal = Math.max(maxVal, price[j - 1] + dp[i - j]);   // price[j - 1] => profit for piece length j => dp[i - j] => max profit for remaining length
                                                                       // (i=1) => (j=1) => price[0] + dp[0] => 1  + 0  = 1  (maxVal = 1)  => dp[1] = 1
                                                                       // (i=2) => (j=1) => price[0] + dp[1] => 1  + 1  = 2
                                                                       // (i=2) => (j=2) => price[1] + dp[0] => 5  + 0  = 5  (maxVal = 5)  => dp[2] = 5
                                                                       // (i=3) => (j=1) => price[0] + dp[2] => 1  + 5  = 6
                                                                       // (i=3) => (j=2) => price[1] + dp[1] => 5  + 1  = 6
                                                                       // (i=3) => (j=3) => price[2] + dp[0] => 8  + 0  = 8  (maxVal = 8)  => dp[3] = 8
                                                                       // (i=4) => (j=1) => price[0] + dp[3] => 1  + 8  = 9
                                                                       // (i=4) => (j=2) => price[1] + dp[2] => 5  + 5  = 10 (maxVal = 10) => dp[4] = 10
                                                                       // (i=4) => (j=3) => price[2] + dp[1] => 8  + 1  = 9
                                                                       // (i=4) => (j=4) => price[3] + dp[0] => 9  + 0  = 9
                                                                       // (i=5) => (j=1) => price[0] + dp[4] => 1  + 10 = 11
                                                                       // (i=5) => (j=2) => price[1] + dp[3] => 5  + 8  = 13
                                                                       // (i=5) => (j=3) => price[2] + dp[2] => 8  + 5  = 13 (maxVal = 13) => dp[5] = 13
                                                                       // (i=5) => (j=4) => price[3] + dp[1] => 9  + 1  = 10
                                                                       // (i=5) => (j=5) => price[4] + dp[0] => 10 + 0  = 10
                                                                       // (i=6) => (j=1) => price[0] + dp[5] => 1  + 13 = 14
                                                                       // (i=6) => (j=2) => price[1] + dp[4] => 5  + 10 = 15
                                                                       // (i=6) => (j=3) => price[2] + dp[3] => 8  + 8  = 16
                                                                       // (i=6) => (j=4) => price[3] + dp[2] => 9  + 5  = 14
                                                                       // (i=6) => (j=5) => price[4] + dp[1] => 10 + 1  = 11
                                                                       // (i=6) => (j=6) => price[5] + dp[0] => 17 + 0  = 17 (maxVal = 17) => dp[6] = 17
                                                                       // (i=7) => (j=1) => price[0] + dp[6] => 1  + 17 = 18 (maxVal = 18) => dp[7] = 18
                                                                       // (i=7) => (j=2) => price[1] + dp[5] => 5  + 13 = 18 (maxVal = 18) => dp[7] = 18
                                                                       // (i=7) => (j=3) => price[2] + dp[4] => 8  + 10 = 18 (maxVal = 18) => dp[7] = 18
                                                                       // (i=7) => (j=4) => price[3] + dp[3] => 9  + 8  = 17
                                                                       // (i=7) => (j=5) => price[4] + dp[2] => 10 + 5  = 15
                                                                       // (i=7) => (j=6) => price[5] + dp[1] => 17 + 1  = 18 (maxVal = 18) => dp[7] = 18
                                                                       // (i=7) => (j=7) => price[6] + dp[0] => 17 + 0  = 17
                                                                       // (i=8) => (j=1) => price[0] + dp[7] => 1  + 18 = 19
                                                                       // (i=8) => (j=2) => price[1] + dp[6] => 5  + 17 = 22 (maxVal = 22) => dp[8] = 22
                                                                       // (i=8) => (j=3) => price[2] + dp[5] => 8  + 13 = 21
                                                                       // (i=8) => (j=4) => price[3] + dp[4] => 9  + 10 = 19
                                                                       // (i=8) => (j=5) => price[3] + dp[4] => 10 + 8  = 18
                                                                       // (i=8) => (j=6) => price[4] + dp[3] => 17 + 5  = 22 (maxVal = 22) => dp[8] = 22
                                                                       // (i=8) => (j=7) => price[5] + dp[2] => 17 + 1  = 18
                                                                       // (i=8) => (j=8) => price[6] + dp[1] => 20 + 0  = 20
            }                                                 

            dp[i] = maxVal;                                            // storing the best value found for length i => dp[8] = 22
        }

        return dp[n];                                                  // returns dp[8] = 22
    }

    public static void main(String[] args) 
    {
        int[] price1 = {1, 5, 8, 9, 10, 17, 17, 20};
        System.out.println(cutRod(price1));

        int[] price2 = {3, 5, 8, 9, 10, 17, 17, 20};
        System.out.println(cutRod(price2));

        int[] price3 = {3};
        System.out.println(cutRod(price3));
    }
}
