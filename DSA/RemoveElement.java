public class RemoveElement 
{
    public static int elementremove(int nums[], int val)  // nums[] = {3, 2, 2, 3}, val = 3
    {
        int k = 0;                    // counter for numbers != val

        for (int i = 0 ; i < nums.length; i++)            // i starts looping at 0 and ends at 3
        {
            if (nums[i] != val)                           // nums[0] = 3 == 3 => skip
            {                                             // nums[1] = 2 != 3 => nums = [2]    => k = 1
                nums[k] = nums[i];                        // nums[2] = 2 != 3 => nums = [2, 2] => k = 2
                k++;                                      // nums[3] = 3 == 3 => skip
            }
        }

        return k;                                          // returns k = 2
    }
    public static void main(String[] args) 
    {
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;

        int k1 = elementremove(nums1, val1);

        System.out.println("k = " + k1);
        System.out.print("nums = ");

        for (int i = 0; i < nums1.length; i++) 
        {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;

        int k2 = elementremove(nums2, val2);

        System.out.println("k = " + k2);
        System.out.print("nums = ");

        for (int i = 0; i < nums2.length; i++) 
        {
            System.out.print(nums2[i] + " ");
        }
    }
}
