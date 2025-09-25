class OccurenceOfNumber 
{
    static int countFreq(int[] arr, int target) 
    {
         int count = 0;

        for (int num : arr)
         {
            if (num == target)         // if an element matches our target element counter goes += 1
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int arr1[] = {1, 2, 3, 4, 5, 6, 6, 7};
        int target = 3;

        int count = countFreq(arr1, target);
        System.out.println(count);
    }
}
