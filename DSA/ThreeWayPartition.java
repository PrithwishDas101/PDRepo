import java.util.Arrays;

class ThreeWayPartition 
{
    public static void threeWayPartition(int[] arr, int a, int b) 
    {
        int n = arr.length;
        int low = 0, mid = 0, high = n - 1;           // low = starting point => mid = current element => high = end point

        while (mid <= high) 
        {
            if (arr[mid] < a)                         // if current element < a => line em' up in ascending order
            {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;  
            } 
            
            else if (arr[mid] > b)                   // if current element > b => line em' up in ascending order
            {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            } 
            
            else                                     // current element is within the range of a and b => stay as it is
            {
                mid++;
            }
        }
    }
    public static void main(String[] args) 
    {
        int[] arr1 = {1, 2, 3, 3, 4};
        int a1 = 1, b1 = 2;

        threeWayPartition(arr1, a1, b1);

        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {1, 4, 3, 6, 2, 1};
        int a2 = 1, b2 = 3;

        threeWayPartition(arr2, a2, b2);

        System.out.println(Arrays.toString(arr2));
    }
}
