class SmallestPositiveMissing 
{
    public int missingNumber(int[] arr) 
    {
        int n = arr.length;

        for (int i = 0; i < n; i++) 
        {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i])  // while the current number is: Positive 
                                                                            // within [1, n] => and not already in its correct spot
                                                                            // keep swapping it to its correct spot
                                                                            // swaps arr[i] to its correct index arr[i] - 1
            {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] != i + 1)                                             // first index i where arr[i] != i + 1 => i + 1 is missing
            {
                return i + 1;
            }
        }
        return n + 1;                                                        // if all 1..n are present => the answer is n + 1
    }
    public static void main(String[] args) 
    {
        SmallestPositiveMissing obj = new SmallestPositiveMissing();

        int[] arr1 = {2, -3, 4, 1, 1, 7};
        System.out.println(obj.missingNumber(arr1));

        int[] arr2 = {5, 3, 2, 5, 1};
        System.out.println(obj.missingNumber(arr2));

        int[] arr3 = {-8, 0, -1, -4, -3};
        System.out.println(obj.missingNumber(arr3));
    }
}
