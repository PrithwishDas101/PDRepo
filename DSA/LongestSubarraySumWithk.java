import java.util.HashMap;

class LongestSubarraySum 
{
    public int longestSubarray(int[] arr, int k)
    {
       HashMap<Long, Integer> prefixSumMap = new HashMap<>();

        long sum = 0;
        int maxLength = 0;

        prefixSumMap.put(0L, -1);                  // initializes the prefixSumMap with sum 0 at index -1

        for (int i = 0; i < arr.length; i++) 
        {
            sum += arr[i];
            if (prefixSumMap.containsKey(sum - k))    // prefixSum[i] - prefixSum[j] = k => prefixSum[j] = prefixSum[i] - k
            {
                maxLength = Math.max(maxLength, i - prefixSumMap.get(sum - k));
            }
            prefixSumMap.putIfAbsent(sum, i);         // Store first occurrence of sum
        }
        return maxLength;
    }
    public static void main(String[] args)
    {
        LongestSubarraySum sum = new LongestSubarraySum();
        int[] arr = {1, 2, 3, -2, 5, -3, 1, 2}; 
        int k = 5;                              

        int result = sum.longestSubarray(arr, k);

        System.out.println("Length of longest subarray with sum " + k + " is: " + result);
    }
}