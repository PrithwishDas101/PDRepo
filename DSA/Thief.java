class Thief 
{
    public int maxLoot(int[] arr) 
    {                                                          // arr = [6, 5, 5, 7, 4]
        int n = arr.length;                                    // n = 5
        if (n == 0) return 0;                                  // if no house     => thief can't steal
        if (n == 1) return arr[0];                             // if house only 1 => thief can steal only house available

        int[] dp = new int[n];                                 // dp[i] => stores the max money lootable from house 0 to i.

        dp[0] = arr[0];                                        // if thief loots only the first house, thief gets its money.
                                                               // dp[0] = 6
        dp[1] = Math.max(arr[0], arr[1]);                      // For the second house: Either loot 1st or 2nd (can’t loot both)
                                                               // dp[1] = max(6, 5) = 6

        for (int i = 2; i < n; i++)                            // Loop from the 3rd house to the last.
        {
            dp[i] = Math.max(arr[i] + dp[i - 2], dp[i - 1]);   // loot either max anyway
                                                               // (i=2) => 3rd house => 5
                                                               // Loot: 5 + dp[0] = 5 + 6 = 11 
                                                               // or Skip: dp[1] = 6 => picks max => dp[2] = 11
                                                               // (i=3) => 4th house => 7
                                                               // Loot: 7 + dp[1] = 6 + 5 = 12
                                                               // or skip: dp[2] = 11 => picks max => dp[3] = 15
                                                               // (i=4) => 5h house => 4
                                                               // loot: 5 + dp[3] = 5 + 5 = 10
                                                               // or skip: dp[3] = 15 => picks max => dp[4] = 15
        }

        return dp[n - 1];                                      // returns dp[4] = 15
    }

    public static void main(String[] args) 
    {
        Thief thief = new Thief();
        int[] arr1 = {6, 5, 5, 7, 4};
        int[] arr2 = {1, 5, 3};
        int[] arr3 = {4, 4, 4, 4};

        System.out.println(thief.maxLoot(arr1));  
        System.out.println(thief.maxLoot(arr2));  
        System.out.println(thief.maxLoot(arr3));  
    }
}
