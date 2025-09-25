class TransitionPoint 
{
    int transitionPoint(int arr[]) 
    {
        
        int n = arr.length;

        int low = 0, high = n - 1;
        int result = -1;                        // default value if no 1 is found

        while (low <= high) 
        {
            int mid = low + (high - low) / 2;   // midppoint of array

            if (arr[mid] == 1)
            {  
                result = mid;                   // possible transition point
                high = mid - 1;                 // traverse left for an earlier 1
            } 
            else 
            {
                low = mid + 1;                  // traverse right for 1
            }
        }
        return result;
    }
    public static void main(String[] args) 
    {
        TransitionPoint sol = new TransitionPoint();

        int[] arr1 = {1, 0, 1, 1, 1};
        int[] arr2 = {0, 0, 0, 0};
        int[] arr3 = {1, 1, 1};
        int[] arr4 = {0, 1, 1};

        System.out.println(sol.transitionPoint(arr1)); // Output: 3
        System.out.println(sol.transitionPoint(arr2)); // Output: -1
        System.out.println(sol.transitionPoint(arr3)); // Output: 0
        System.out.println(sol.transitionPoint(arr4)); // Output: 1
    }
}