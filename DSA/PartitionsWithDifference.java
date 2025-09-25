class PartitionWithDiff 
{
    int countPartitions(int[] arr, int d) 
    {
        int totalSum = 0;
        for (int num : arr) 
        {
            totalSum += num;                                             // totalSum = addition of all array elements
        }

        if ((d + totalSum) % 2 != 0)                                     // sum1 + sum2 = totalSum
        {                                                                // sum1 - sum2 = d
            return 0;                                                    // sum1 => (d + totalSum) / 2
                                                                         // d + totalSum => odd => impossible to split => return 0
        }
        int target = (d + totalSum) / 2;                                 // counting subsets with sum = target
        int n = arr.length;

        int[][] dp = new int[n + 1][target + 1];                         // number of ways to get sum j using first i items

        for (int i = 0; i <= n; i++) 
        {
            dp[i][0] = 1;                                                // always 1 way to get sum = 0 => pick nothing
        }

        for (int i = 1; i <= n; i++) 
        {
            for (int j = 0; j <= target; j++)                           
            { 
               if (arr[i - 1] <= j)                                      // current item arr[i-1] can fit in j
                {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - arr[i - 1]]; // either don’t pick it => dp[i-1][j]
                                                                         // or pick it => dp[i-1][j - arr[i-1]]
                                                                         // so total ways => both options added
                } 
                else 
                {
                    dp[i][j] = dp[i - 1][j];                             // item is too big => can’t pick it => only dp[i-1][j]
                }
            }
        }

        return dp[n][target];                                            // returns total number of valid partitions
                                                                         // arr = [5, 2, 6, 4], d = 3
                                                                         // totalSum = 17
                                                                         // target = (3 + 17) / 2 = 10
                                                                         // [6, 4] = 10 → 1 way
                                                                         // only 1 subset => possible
                                                                         // returns 1
    }
    public static void main(String[] args) 
    {
        PartitionWithDiff obj = new PartitionWithDiff();

        int[] arr1 = {5, 2, 6, 4};
        System.out.println(obj.countPartitions(arr1, 3));

        int[] arr2 = {1, 1, 1, 1};
        System.out.println(obj.countPartitions(arr2, 0));

        int[] arr3 = {1, 2, 1, 0, 1, 3, 3};
        System.out.println(obj.countPartitions(arr3, 11));
    }
}
