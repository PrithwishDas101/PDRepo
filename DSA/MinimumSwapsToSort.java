import java.util.Arrays;
import java.util.Comparator;

public class MinimumSwapsToSort
 {
    public static int minSwaps(int[] arr)                           // arr = [2, 8, 5, 4]
    {
        int n = arr.length, swaps = 0;                              // n => size of the array => swaps => counts swaps needed
        int[][] pairs = new int[n][2];                              // each element is [value, original index]
        for (int i = 0; i < n; i++) 
        {
            pairs[i] = new int[]{arr[i], i};                        // pairs[i][0] = element value => pairs[i][1] = original index
        }                                                           // pairs = [[2,0], [8,1], [5,2], [4,3]]
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));     // After sort => [[2,0], [4,3], [5,2], [8,1]]

        boolean[] visit = new boolean[n];                           // tracks if this index has been visited in our cycle detection
        for (int i = 0; i < n; i++)                             
        {
            if (visit[i] || pairs[i][1] == i)                       // already visited = skip => (pairs[i][1] == i) = skip 
            {
                continue;                                           // pairs[0] = [2,0] => index matches => no move needed
            }  
            int cycle = 0;                                          // count how big this cycle is
            int j = i;                                              // current index we’re tracing

            while (!visit[j]) 
            {
                visit[j] = true;                                    // while not visited => mark visited
                j = pairs[j][1];                                    // jump to the original index of where this value came from
                cycle++;                                            // counts hops until you’re back where you started
            }
            swaps += cycle - 1;                                     // for a cycle of length L, you need (L - 1) swaps => add that to your total
        }
        return swaps;                                               // returns the total minimum swaps
    }

    public static void main(String[] args) 
    {
        System.out.println(minSwaps(new int[]{2, 8, 5, 4}));
        System.out.println(minSwaps(new int[]{10, 19, 6, 3, 5}));
        System.out.println(minSwaps(new int[]{1, 3, 4, 5, 6}));
    }
}
