class CountInversion 
{
    static int inversionCount(int arr[]) 
    {
        int n = arr.length;
        int[] temp = new int[n];                            // for merging arrays later
        return mergeSort(arr, temp, 0, n - 1);         // range => 0 to n-1 []
    }

    private static int mergeSort(int[] arr, int[] temp, int left, int right)
    {
        int mid, invCount = 0;                                // mid => middle; invCount => stores inversion count for the array 
        if (left < right)                                     // only split array when there are atleast 2 elements present
        {
            mid = (left + right) / 2;                         // finding the midpoint of the array for spliting

            invCount += mergeSort(arr, temp, left, mid);      // adding elements from the leftmost till midpoint

            invCount += mergeSort(arr, temp, mid + 1, right); // adding elements after midpoint till the end

            invCount += merge(arr, temp, left, mid, right);   // to find the inversionCount
        }
        return invCount;
    }

    private static int merge(int[] arr, int[] temp, int left, int mid, int right) 
    {
        int i = left;            // pointer for the left  half
        int j = mid + 1;         // pointer for the right half
        int k = left;            // for temp
        int invCount = 0;

        while (i <= mid && j <= right) // merging while both halves have elements
        {
            if (arr[i] <= arr[j])      // condition
            {
                temp[k++] = arr[i++];  // add arr[i] to temp => keep shifting i to the right
            } 
            else 
            {
                temp[k++] = arr[j++];       // arr[i] > arr[j] => inversion found => all remainig elements in left...mid 
                                            // is bigger than arr[j]
                                            // add arr[j] to temp => keep shifting i to the right
                invCount += (mid - i + 1);  // left  half = [2, 4, 6] => i = 0 to mid = 2;
                                            // right half = [1, 5, 7] => j = 3 to mid = right
                                            // inversions => (2, 1) , (4, 1) , (6, 1) => 3 inversions
                                            // invCount += (2 - 0 + 1) = 3 inversions
            }
        }

        while (i <= mid)          // anything left in the left half
        {
            temp[k++] = arr[i++]; // copy anything left
        }

        while (j <= right)        // anything left in the right half
        {
            temp[k++] = arr[j++];
        }

        for (i = left; i <= right; i++) 
        {
            arr[i] = temp[i];     // copy and merge the whole array back
        }

        return invCount;          // returns the inversion count
    }
    public static void main(String[] args) 
    {
        int[] arr1 = {2, 4, 1, 3, 5};
        System.out.println(inversionCount(arr1));  

        int[] arr2 = {2, 3, 4, 5, 6};
        System.out.println(inversionCount(arr2));  
    }
}