import java.util.Arrays;

class TripletSumZero 
{
    public boolean findTriplets(int[] arr) 
    {    
        int n = arr.length;
        Arrays.sort(arr);                                 // sort the array

        for (int i = 0; i < n - 2; i++) 
        {
            int left = i + 1;
            int right = n - 1;

            while (left < right) 
            {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) 
                {
                    return true;                          // Triplet found
                } 
                else if (sum < 0) 
                {
                    left++;                               // Move right to a larger number
                } 
                else 
                {
                    right--;                              // Move left to a smaller number
                }
            }
        }
        return false;                                     // No triplet found
    }
    public static void main(String[] args) 
    {
        TripletSumZero sum = new TripletSumZero();

        int[] arr1 = {0, -1, 2, -3, 1};
        boolean result1 = sum.findTriplets(arr1);
        System.out.println(result1);  

        int[] arr2 = {1, 2, 3};
        boolean result2 = sum.findTriplets(arr2);
        System.out.println(result2);  

        int[] arr3 = {0, 1, -1, 0, 3};
        boolean result3 = sum.findTriplets(arr3);
        System.out.println(result3);

    }
}