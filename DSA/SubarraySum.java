public class SubarraySum 
{
    public int subarraySum(int[] arr)                // arr[] = {1, 2, 3}
    {
        int n = arr.length;                          // n = 3
        int totalSum = 0;

        for (int i = 0; i < n; i ++)
        {
            totalSum += arr[i] * (i+1) * (n-i);    // (i=0) => totalSum += arr[0] * (0+1) * (3-0) => 1 * 1 * 3 
                                                   // totalSum = 3
                                                   // (i=1) => totalSum += arr[1] * (1+1) * (3-1) => 2 * 2 * 2
                                                   // totalSum = 3 + 8 = 11
                                                   // (i=2) => totalSum += arr[2] * (2+1) * (3-2) => 3 * 3 * 1
                                                   // totalSum = 11 + 9 = 20
        }

    return totalSum;                               // returns 20
    }
    public static void main(String[] args) 
    {
        SubarraySum sum = new SubarraySum();

        int arr1[] = {1, 2, 3};
        System.out.println(sum.subarraySum(arr1));

        int arr2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(sum.subarraySum(arr2));

        int arr3[] = {1, 3};
        System.out.println(sum.subarraySum(arr3));

    }
}
