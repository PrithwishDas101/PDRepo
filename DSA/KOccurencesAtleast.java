import java.util.HashMap;
import java.util.Map;

class KOccurencesAtleast 
{
    public int firstElementKTime(int[] arr, int k) 
    {
        // write code
        Map<Integer, Integer> freq = new HashMap<>();                  // key = number => value = times of appearances

        for (int num : arr)                                            // for every int num in array elements 
        { 
            freq.put(num, freq.getOrDefault(num, 0) + 1); // freq.getOrDefault(num, 0) returns the current count for num if present => otherwise 0
                                                                       // add 1 to that value and put the new count back into the map under key num
                                                                       // effect => increment the frequency count of num => creating the entry with value 1 if num wasn't present
                                                                       // suppose freq is empty and num = 4.
                                                                       // freq.getOrDefault(4, 0) => map contains no 4 => so it returns 0.
                                                                       // 0 + 1 => 1.
                                                                       // freq.put(4, 1) => map now {4=1}
            if (freq.get(num) >= k)                                    // frequency of num is atleast greater thsn k
            {
                return num;                                            // found the first number that hits k times
            }
        }

        return -1;                                                     // if none found so
    }
    public static void main(String[] args) 
    {
        int[] arr = {1, 7, 4, 3, 4, 8, 7};
        int k = 2;

        KOccurencesAtleast obj = new KOccurencesAtleast();
        int result = obj.firstElementKTime(arr, k);
        System.out.println(result);
    }
}