import java.util.*;
class FirstRepeatedElement 
{
    public static int firstRepeated(int arr[]) 
    {
        Map<Integer, Integer> indexMap = new HashMap<>(); // empty hashmap where key and value are both integers

        Set<Integer> seen = new HashSet<>();              // empty hashset to tracks all numbers already seen while scanning the array.

        int minIndex = Integer.MAX_VALUE;                 // to find the minimum repetition first initialize it with the max value

        for (int i = 0; i < arr.length; i++) 
        {
            int val = arr[i];

            if (seen.contains(val)) 
            {
                minIndex = Math.min(minIndex, indexMap.get(val)); // arr = [1, 5, 3, 4, 3, 5, 6]
                                                                  // i = 4 => 3 repeats => first seen at 2 => minIndex = min(minIndex, 2) = 2
                                                                  // i = 5 => 5 repeats => first seen at 1 => minIndex = min(2, 1) = 1
                                                                  // return => (1+1) = 2
            } 
            else 
            {
                seen.add(val);
                indexMap.put(val, i);
            }
        }

        return (minIndex == Integer.MAX_VALUE) ? -1 : minIndex + 1;
    }
    public static void main(String[] args) 
    {
        int[] arr1 = {1, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeated(arr1)); 

        int[] arr2 = {1, 2, 3, 4};
        System.out.println(firstRepeated(arr2)); 

        int[] arr3 = {10, 20, 10, 30, 20};
        System.out.println(firstRepeated(arr3)); 

        int[] arr4 = {7, 8, 9, 7, 9, 8};
        System.out.println(firstRepeated(arr4)); 
    }
}

