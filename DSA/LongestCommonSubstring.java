class LongestCommonSubstring 
{
    public static int longestCommonSubstring(String s1, String s2) 
    {
        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n + 1][m + 1];

        int maxLen = 0;

        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= m; j++) 
            {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))                     // s1 = "ABCDGH" s2 = "ACDGHR"
                {
                    dp[i][j] = dp[i - 1][j - 1] + 1;                          // (i=1) (j=1) => A  = A => maxLen = 1
                                                                              // (i=1) (j=2) => A != C => maxLen = 0
                                                                              // (i=2) (j=1) => B != A => maxLen = 0
                                                                              // (i=2) (j=2) => B != C => maxLen = 0
                                                                              // (i=3) (j=2) => C != C => maxLen = 1
                                                                              // (i=4) (j=3) => D != D => maxLen = 2
                                                                              // (i=5) (j=4) => G != G => maxLen = 3
                                                                              // (i=6) (j=5) => H != H => maxLen = 4

                    maxLen = Math.max(maxLen, dp[i][j]);                 
                } 
                else 
                {
                    dp[i][j] = 0;
                }
            }
        }
        return maxLen;                                                        // returns (4)
    }
    public static void main(String[] args) {
        System.out.println(longestCommonSubstring("ABCDGH", "ACDGHR")); 
        System.out.println(longestCommonSubstring("abc", "acb"));       
        System.out.println(longestCommonSubstring("YZ", "yz"));    
        System.out.println(longestCommonSubstring("qwertyuiop", "qwertyuiop"));     
        System.out.println(longestCommonSubstring("qwsdcv", "vcxsq"));
    }
}
