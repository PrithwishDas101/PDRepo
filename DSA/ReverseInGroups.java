import java.util.Arrays;

public class ReverseInGroups 
{
    public static void reverseInGroups(int[] arr, int k)        // [1,2,3,4,5], k = 3
    {
        int n = arr.length;                                     //  n = 5 

        if (k >= n) 
        {
            reverse(arr, 0, n - 1);                        // reverses the entire array => as per gfg question
            return;
        }

        for (int i = 0; i < n; i += k)                          // looping (i=0) to (n-1) incrementing by k => 3 => (i=0) = (first group) => (i=3) = (next group)
        {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);             // (i=0) => left = 0 => right = min(0+3-1, 4) = 2 => arr[0...2] => [1, 2, 3]
                                                                // (i=3) => left = 3 => right = min(3+3-1, 4) = 4 => arr[3...4] => [4, 5]
            reverse(arr, left, right);                          // reverses this chunk => returns [3, 2, 1, 5, 4]
        }
    }

    private static void reverse(int[] arr, int left, int right) 
    {
        while (left < right)                                    // while left index is less than right index => swap arr[left] & arr[right]
        {
            int temp   = arr[left];
            arr[left]  = arr[right];
            arr[right] = temp;                                  // swapping arr[left] and arr[right]
            left++;                                             // next element from start
            right--;                                            // previous element from the end 
        }
    }

    public static void main(String[] args) 
    {
        int[] arr1 = {1, 2, 3, 4, 5};
        reverseInGroups(arr1, 3);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {5, 6, 9, 2, 5, 6, 7};
        reverseInGroups(arr2, 5);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {5, 1, 8, 9, 19, 2, 5};
        reverseInGroups(arr3, 3);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = {5, 2, 1, 2, 8, 9};
        reverseInGroups(arr4, 2);
        System.out.println(Arrays.toString(arr4));

        int[] arr5 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverseInGroups(arr5, 6);
        System.out.println(Arrays.toString(arr5));
    }
}
