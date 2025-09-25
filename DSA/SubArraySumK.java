import java.util.HashMap;

public class SubArraySumK 
{
    public static int findSubarraySum(int[] arr, int k)                       // arr = [10, 2, -2, -20, 10] => k = -10
    {
        HashMap<Integer, Integer> map = new HashMap<>();                      // Key   => prefix sum seen so far
                                                                              // Value => count of the prefux sum
        int count = 0;                                                        
        int currSum = 0;

        for (int i = 0; i < arr.length; i++)                                  // looping i = 0 to 4                            
        {                                                                     // for (i=0)                                     for (i=1)                                      for (i=2)                                      for (i=3)                                       for (i=4)
            currSum += arr[i];                                                // currSum = 0 + 10 = 10                         currSum = 10 + 2 = 12                          currSum = 12 + (-2) = 10                       currSum = 10 + (-20) = -10                      currSum = -10 + 10 = 0

            if (currSum == k)                                                 // currSum = 10 != -10                           currSum = 12 != -10                            currSum = 10 != -10                            currSum = -10 == -10                            currSum = 0 != -10
            {
                count++;                                                      // count = 0                                     count = 0                                      count = 0                                      count = 1                                       count = 1 => count = 1 + 2 = 3

            }

            if (map.containsKey(currSum - k))                                 // currSum - k = 10 - (-10) = 20 => Not in map   currSum - k = 12 - (-10) = 22 => Not in map    currSum - k = 10 - (-10) = 20 => Not in map    currSum - k = -10 - (-10) = 0 => Not in map     currSum - k = 0 - (-10) = 10 => 10 has freq = 2 => count += 2       
            {
                count += map.get(currSum - k);
            }

            map.put(currSum, map.getOrDefault(currSum, 0) + 1);  // map => {10:1}                                 map => {10=1, 12=1}                            map => {10=2, 12=1}                            map = {10=2, 12=1, -10=1}                       map => {10=2, 12=1, -10=1, 0=1}


        }

        return count;                                                         // returns = 3
    }

    public static void main(String[] args) 
    {
        int[] arr1 = {10, 2, -2, -20, 10};
        System.out.println(findSubarraySum(arr1, -10)); 

        int[] arr2 = {9, 4, 20, 3, 10, 5};
        System.out.println(findSubarraySum(arr2, 33)); 
        int[] arr3 = {1, 3, 5};
        System.out.println(findSubarraySum(arr3, 0)); 
    }
}