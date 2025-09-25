import java.util.ArrayList;

class subarraySumbyIndex 
{
    static ArrayList<Integer> subarraySum(int[] arr, int target) 
    {
        int n = arr.length;
        int start = 0;                                       //start => left boundary
        int currentSum = 0;

        for (int end = 0; end < n; end++)                    //end   => right boundary
        {
            currentSum += arr[end];                          // [1, 2, 3, 7, 5] currentSum => 1=> 3=> 6=> 13=> 18

            while (currentSum > target && start < end)       // if currentSum exceeds target, sizing it down
            {
                currentSum -= arr[start];                    // when currentSum = 13; currentSum > target(12)
                                                             // arr[start] = arr[0] = 1 => currentSum -= arr[start] =>
                                                             // 13-1 = 12(target)
                start++;                                     // start = 1
            }

            if (currentSum == target)                        // currentSum = target = 12 arr[1] to arr[3] => [1, 2, 7]
            {
                ArrayList<Integer> ans = new ArrayList<>(2);
                ans.add(start + 1);                          // [start + 1] => [1+1] => start = 2
                ans.add(end + 1);                            // [end + 1]   => [3+1] => end   = 4 
                return ans;                                  // returns [2, 4]
            }
        }

        ArrayList<Integer> ans = new ArrayList<>(1);
        ans.add(-1);                                         // incase target is not achieved anyhow
        return ans;                                          // returns [-1]
    }
    public static void main(String[] args) 
    {
        int[] arr1 = {1, 2, 3, 7, 5};
        int target1 = 12;
        System.out.println(subarraySum(arr1, target1));  

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target2 = 15;
        System.out.println(subarraySum(arr2, target2));  

        int[] arr3 = {5, 3, 4};
        int target3 = 2;
        System.out.println(subarraySum(arr3, target3));  
    }
}
