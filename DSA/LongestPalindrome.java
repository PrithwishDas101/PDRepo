class LongestPalindrome 
{
    public static String longestPalindrome(String s)
    {
        if (s==null || s.length() < 1)
        {
            return "";                               // returns an empty string
        }

        int n = s.length();
        boolean dp[][] = new boolean[n][n];          // dp[i][j] will be true if s[i...j] is charAt palindrome

        int start = 0;                               // start index of the longest palindrome found so far
        int maxLen = 1;                              // length of that palindrome
        
        for (int i = 0; i < (n - 1); i++)            // i stops at (n - 1) to prevent out of bounds
        {
            if (s.charAt(i) == s.charAt(i + 1))      // checks for two consequent palindrome
            {
                dp[i][i + 1] = true;                 // palindrome
                start  = i;                          
                maxLen = 2;
            }
        }

        for (int len = 3; len <= n; len++)           // for substring lengths from 3 to n
        {
            for (int i = 0; i <= n - len; i++)       // i stops at n - len to prevent out of bounds
            {
                int j = i + len - 1;                  

                if (s.charAt(i) == s.charAt(j) && dp[i+1][j-1]) // "babad" => len = 3 (bab) => b == b & dp[1][1] == true
                                                                // dp[0][2] => marked true => start = 0 => maxLen = 2
                                                                // "babad" => len = 4 (baba) => b != a => skip (abad) => a != a => skip
                                                                // "babad" => len = 5 (babad) => b != d => skip
                {
                    dp[i][j] = true;
                    if (len > maxLen)
                    {
                        start = i;
                        maxLen = len;
                    }
                }
            }
        }


        return s.substring(start, start + maxLen);               // returns bab (dp[0][2])
    }
    public static void main (String args[])
    {
        String s1 = "forgeeksskeegfor";
        String s2 = "Geeks";
        String s3 = "abc";
        String s4 = "qwertyuiolkjhbgfqqqqqqswedrfgtyhujikolkmjnhbgvfcdserftgyhui";

        System.out.println("Longest palindrome in \"" + s1 + "\": " + longestPalindrome(s1));
        System.out.println("Longest palindrome in \"" + s2 + "\": " + longestPalindrome(s2));
        System.out.println("Longest palindrome in \"" + s3 + "\": " + longestPalindrome(s3));
        System.out.println("Longest palindrome in \"" + s4 + "\": " + longestPalindrome(s4));
    }
}
