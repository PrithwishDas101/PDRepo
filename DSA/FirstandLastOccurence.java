import java.util.ArrayList;

class FirstandLastOccurence 
{
    public static ArrayList<Integer> findFirstAndLast(int[] arr, int x) 
    {
        int first = -1;                          // assuming not found yet
        int last  = -1;                          // assuming not found yet

        int low = 0, high = arr.length - 1;      // start and end of the array

        while (low <= high)                      // Looking for the first occurrence
         {
            int mid = low + (high - low) / 2;    // midpoint of the array

            if (arr[mid] == x) 
            {
                first = mid;                     // possibly the first occurrence
                high  = mid - 1;                 // shrinking search to look for the element left of the midpoint
            } 
            else if (arr[mid] < x) 
            {
                low = mid + 1;                   // shrinking search to look for the element right of the midpoint
            } 
            else 
            {
                high = mid - 1;                  // shrinking search to look for the element left of the midpoint
            }
        }

        low = 0; high = arr.length - 1;

        while (low <= high)                      // Looking for the first occurrence
        {
            int mid = low + (high - low) / 2;    // midpoint of the array

            if (arr[mid] == x) 
            {
                last = mid;                      // possibly the last occurrence
                low = mid + 1;                   // shrinking search to look for the element right of the midpoint
            } 
            else if (arr[mid] < x)               
            {
                low = mid + 1;                   // shrinking search to look for the element right of the midpoint
            } 
            else                             
            {
                high = mid - 1;                  // shrinking search to look for the element left of the midpoint
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(first);
        result.add(last);
        return result;
    }
    public static void main(String[] args) 
    {
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int x = 5;

        ArrayList<Integer> ans = findFirstAndLast(arr, x);
        System.out.println("First Occurrence: " + ans.get(0));
        System.out.println("Last  Occurrence: " + ans.get(1));
    }
}
