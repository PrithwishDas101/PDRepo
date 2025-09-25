import java.util.Arrays;

class TripletsSum
{
    public static boolean hasTripletSum(int arr[], int target) 
    {
        int n = arr.length;

        Arrays.sort(arr);                           // for the two pointer trick [1, 4, 6, 8, 10, 45]

        for (int i = 0; i < n - 2; i++)             // left = i + 1 => right = n - 1
                                                    // index n - 2 => left = i + 1 = n - 1
                                                    // => there’s only one number left => we need two more
                                                    // If i is at index n - 1 => left would be out of bounds.
        {
            int left  = i + 1;                       // starts right after the fixed element
            int right = n - 1;                       // starts at the end of the array

            while (left < right)                     // keep searching while left is to the left of right
            {
                int currentSum = arr[i] + arr[left] + arr[right];  // i = 0 => arr[i] = 1 => left = 4 => right = 45
                                                                   // currentSum = 1 + 4 + 45 = 50 => right--
                                                                   // i = 0 => arr[i] = 1 => left = 4 => right = 10
                                                                   // currentSum = 1 + 4 + 10 = 15 => left++
                                                                   // i = 0 => arr[i] = 1 => left = 6 => right = 10
                                                                   // currentSum = 1 + 6 + 10 = 17 => left++
                                                                   // i = 0 => arr[i] = 1 => left = 8 => right = 10
                                                                   // currentSum = 1 + 8 + 10 = 19 => left++ => crosses right => i++
                                                                   // i = 1 => arr[i] = 4 => left = 6 => right = 45
                                                                   // currentSum = 4 + 6 + 45 = 55 => right--
                                                                   // i = 1 => arr[i] = 4 => left = 6 => right = 10
                                                                   // currentSum = 4 + 6 + 10 = 20 => left++
                                                                   // i = 1 => arr[i] = 4 => left = 8 => right = 10
                                                                   // currentSum = 4 + 8 + 10 = 22 => target => triplet found 💖
                if (currentSum == target) 
                {
                    return true;                      // triplet found
                } 
                else if (currentSum < target)         // need a bigger sum so move left pointer to the right
                {
                    left++;
                } 
                else                                  // need a smaller sum so move right pointer to the left
                {
                    right--;
                }
            }
        }
        return false;                                 // for no triplets found
    }
    public static void main(String[] args) 
    {
        int[] arr1 = {1, 4, 45, 6, 10, 8};
        int target1 = 22;
        System.out.println(hasTripletSum(arr1, target1)); 

        int[] arr2 = {1, 2, 3, 4, 5};
        int target2 = 50;
        System.out.println(hasTripletSum(arr2, target2)); 

        int[] arr3 = {0, -1, 2, -3, 1};
        int target3 = 0;
        System.out.println(hasTripletSum(arr3, target3)); 
    }
}
