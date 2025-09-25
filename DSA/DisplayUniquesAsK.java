public class DisplayUniquesAsK
{
    public static int removeDuplicates(int[] nums) // nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
    {
        if (nums == null || nums.length == 0)      // edge case => empty case
        {
            return 0;
        }

        int uniqueIndex = 0;                       // points to the last unique number we have in the array => initially the element at index 0 is the first unique element

        for (int i = 0; i < nums.length; i++)      // looping through
        {
            if (nums[i] != nums[uniqueIndex])      // (i=0) => nums[i] = 0 == nums[uniqueIndex] = 0 => skip
            {                                      // (i=1) => nums[i] = 0 == nums[uniqueIndex] = 0 => skip
                uniqueIndex++;                     // (i=2) => nums[i] = 1 != nums[uniqueIndex] = 0 => uniqueIndex++ = 1 => nums = [0, 1, 1, 1, 1, 2, 2, 3, 3, 4]
                nums[uniqueIndex] = nums[i];       // (i=3) => nums[i] = 1 == nums[uniqueIndex] = 1 => skip
            }                                      // (i=4) => nums[i] = 1 == nums[uniqueIndex] = 1 => skip
        }                                          // (i=5) => nums[i] = 2 == nums[uniqueIndex] = 1 => uniqueIndex++ = 2 => nums = [0, 1, 2, 1, 1, 2, 2, 3, 3, 4]
                                                   // (i=6) => nums[i] = 2 == nums[uniqueIndex] = 2 => skip
                                                   // (i=7) => nums[i] = 3 == nums[uniqueIndex] = 2 => uniqueIndex++ = 3 => nums = [0, 1, 2, 3, 1, 2, 2, 3, 3, 4]
                                                   // (i=8) => nums[i] = 3 == nums[uniqueIndex] = 3 => skip
                                                   // (i=9) => nums[i] = 4 == nums[uniqueIndex] = 3 => uniqueIndex++ = 4 => nums = [0, 1, 2, 3, 4, 2, 2, 3, 3, 4] => end loop

        return uniqueIndex + 1;                    // since we don't take the index 0 into consideration so we addd 1 here => return 5
    }
    public static void main (String args[])
    {
        int[] nums1 = {1,1,2};
        int k1 = removeDuplicates(nums1);
        System.out.println("k (unique numbers) = " + k1);

        System.out.print("Array of uniques: ");
        for (int i = 0; i < k1; i++) 
        {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        int k2 = removeDuplicates(nums2);
        System.out.println("k (unique numbers) = " + k2);

        System.out.print("Array of uniques: ");
        for (int i = 0; i < k2; i++) 
        {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }
}