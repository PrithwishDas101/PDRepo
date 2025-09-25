import java.util.*;

class MinimumDifference 
{
    public int minimumDifference(String[] arr)                        // String[] arr = {"00:00:01", "23:59:59", "00:00:05"};
    {
        int n = arr.length;                                           // n = 3
        int[] seconds = new int[n];

        for (int i = 0; i < n; i++) 
        {
            String[] parts = arr[i].split(":");                 // Split at : to get hours minutes and seconds

            int h = Integer.valueOf(parts[0]);                        // h gets hours
            int m = Integer.valueOf(parts[1]);                        // h gets minutes
            int s = Integer.valueOf(parts[2]);                        // h gets seconds

            seconds[i] = h * 3600 + m * 60 + s;                       // stores seconds total => seconds = [1, 86399, 5]
        }

        Arrays.sort(seconds);                                         // sorting => seconds = [1, 5, 86399]

        int minDiff = Integer.MAX_VALUE;                              // for finding minimum difference

        for (int i = 1; i < n; i++) 
        {
            minDiff = Math.min(minDiff, seconds[i] - seconds[i - 1]); // minDiff = 5     - 1 = 4 => final
                                                                      // minDiff = 86399 - 5 = 86394 
        }

        int wrapDiff = 86400 - seconds[n - 1] + seconds[0];           // 86400 - 86399 + 1 = 2
        minDiff = Math.min(minDiff, wrapDiff);                        // Min = min(4, 2) = 2

        return minDiff;                                               // returns 2
    }
    public static void main(String[] args) 
    {
        MinimumDifference obj = new MinimumDifference();

        String[] arr1 = {"12:30:15", "12:30:45"};
        System.out.println(obj.minimumDifference(arr1));

        String[] arr2 = {"00:00:01", "23:59:59", "00:00:05"};
        System.out.println(obj.minimumDifference(arr2));
    }
}
