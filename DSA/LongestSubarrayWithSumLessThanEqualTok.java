import java.util.HashMap;

class LongestSubarrayWithSumLessThanEqualTok 
{
    public int longestSubarray(int[] arr, int k)                               // k = 2
    {
        int n = arr.length;                                                    // arr = [1, 2, 3, 4, 1] => n = 5.
        int[] mapped = new int[n];                                             // array to store +1 or -1
        
        for (int i = 0; i < n; i++) 
        {
            mapped[i] = arr[i] > k ? 1 : -1;                                   //  mapped = [-1, -1, 1, 1, -1]
        }

        HashMap<Integer, Integer> firstSeen = new HashMap<>();
        int prefix = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) 
        {
            prefix += mapped[i];                                               // (i=0) => prefix = -1
                                                                               // (i=1) => prefix = -2
                                                                               // (i=2) => prefix = -1
                                                                               // (i=3) => prefix =  0
                                                                               // (i=4) => prefix = -1

            if (prefix > 0)                                                    // prefix is positive => subarray from 0 to i is valid => update maxLen
            {
                maxLen = i + 1;
            } 
            else 
            {
                if (firstSeen.containsKey(prefix - 1))                        // need for more +1’s than -1’s => sum must be > 0
                {
                    maxLen = Math.max(maxLen, i - firstSeen.get(prefix - 1)); // (i=2) => prefix = -1 => check -2 => found at i = 1 => length = 1
                                                                              // (i=3) => prefix =  0 => check -1 => found at i = 0 => length = 3
                                                                              //  maxLen = 3
                }
            }

            firstSeen.putIfAbsent(prefix, i);
        }

        return maxLen;                                                        // returns 3
    }

    public static void main(String[] args) 
    {
        LongestSubarrayWithSumLessThanEqualTok s = new LongestSubarrayWithSumLessThanEqualTok();
    
        System.out.println(s.longestSubarray(new int[]{1, 2, 3, 4, 1}, 2));
        System.out.println(s.longestSubarray(new int[]{6, 5, 3, 4}, 2));
        System.out.println(s.longestSubarray(new int[]{12, 34, 56, 78, 90}, 50));
        System.out.println(s.longestSubarray(new int[]{1, 2, 4, 5, 6}, 2));
        System.out.println(s.longestSubarray(new int[]{9, 7, 4, 2}, 5)); 
    }
}
