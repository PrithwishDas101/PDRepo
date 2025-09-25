import java.util.Arrays;

class KthSmallest
 {
    public static int kthSmallest(int[] arr, int k) 
    {
        Arrays.sort(arr);  // {12, 3, 5, 7, 19} => {3, 5, 7, 12, 19} => k = 2
        
        return arr[k - 1]; // returns arr[2-1] => arr[1] => 2nd smallest element in sorted array => returns 5
    }
    public static void main(String[] args) 
    {
        int[] arr1 = {12, 3, 5, 7, 19};
        int k1 = 2;

        int result1 = kthSmallest(arr1, k1);
        System.out.println("The " + k1 + "th smallest element is: " + result1);

        int[] arr2 = {5, 6, 7, 8, 9, 11};
        int k2 = 4;

        int result2 = kthSmallest(arr2, k2);
        System.out.println("The " + k2 + "th smallest element is: " + result2);

        int[] arr3 = {11, 23, 43, 55};
        int k3 = 1;

        int result3 = kthSmallest(arr3, k3);
        System.out.println("The " + k3 + "th smallest element is: " + result3);

        int[] arr4 = {32, 43, 5, 7667, 7, 2, 32, 6, 76, 78, 3, 9, 437, 5, 69};
        int k4 = 9;

        int result4 = kthSmallest(arr4, k4);
        System.out.println("The " + k4 + "th smallest element is: " + result4);
    }
}
