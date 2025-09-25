import java.util.Arrays;

class NextPermutation 
{
    public void nextPermutation(int[] arr)              // [2, 4, 1, 7, 5, 0]
    {
        int n = arr.length;                             // Get the length of the input array => n = 6

        int i = n - 2;                                  // The pivot is the first element (from right) which breaks the descending order
                                                        // i = 4
        while (i >= 0 && arr[i] >= arr[i + 1])          // 5 >=  0 => i-- (i=3)
        {                                               // 7 >=  5 => i-- (i=2)
            i--;                                        // 1 !>= 7 => stop
        }

        if (i >= 0)                                     // i = 2>0 => true
        {
            int j = n - 1;                              
            while (arr[j] <= arr[i])                    //  the smallest number greater than arr[i] to its right
            {
                j--;
            }
            swap(arr, i, j);                            // Swap them → makes the next permutation slightly bigger
        }

        // 4. Reverse the suffix
        reverse(arr, i + 1, n - 1);                     // part after i is still in descending order => so reverse it to ascending
    }

    private void swap(int[] arr, int i, int j)          // general swapping method in java
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void reverse(int[] arr, int start, int end) // reverse from start to end until they flip
    {
        while (start < end) 
        {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) 
    {
        NextPermutation obj = new NextPermutation();

        int[] arr1 = {2, 4, 1, 7, 5, 0};
        obj.nextPermutation(arr1);
        System.out.println(Arrays.toString(arr1)); 

        int[] arr2 = {3, 2, 1};
        obj.nextPermutation(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {3, 4, 2, 5, 1};
        obj.nextPermutation(arr3);
        System.out.println(Arrays.toString(arr3)); 
    }
}