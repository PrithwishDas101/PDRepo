import java.util.*;

public class PowerfulInteger 
{
    public static int powerfulInteger(int[][] intervals, int k)              //  interval = [[1, 3], [4, 6], [3, 4]] => k = 2
    {
        HashMap<Integer, Integer> map = new HashMap<>();                     // key: point on the number line => value: intervals start/stop (+1 for start, -1 for end+1)

        // Mark start (+1) and end+1 (-1) for each interval
        for (int[] iv : intervals) 
        {
            int start = iv[0];
            int end = iv[1];
            map.put(start, map.getOrDefault(start, 0) + 1);     // start with +1
            map.put(end + 1, map.getOrDefault(end + 1, 0) - 1); // end + 1 with -1
        }                                                                    // [1,3] => +1 at 1, -1 at 4
                                                                             // [4,6] => +1 at 4, -1 at 7
                                                                             // [3,4] => +1 at 3, -1 at 5

        ArrayList<Integer> points = new ArrayList<>(map.keySet());           // points before sort => [1, 4, 7, 3, 5]
        Collections.sort(points);                                            // points after sort  => [1, 3, 4, 5, 7]

        int count = 0;                                                       // tracks how many intervals overlap at the current sweep point
        int maxPowerful = -1;                                                // keeps the biggest integer found with count >= k
        Integer prevPoint = null;                                            // remembers the last event point to know the previous segment

        for (int point : points) 
        {
            int delta = map.get(point);                                      // point = 1 => delta = 1                                      point = 3 => delta = 1   point = 4 => delta = 0        point = 5 => delta = -1      point = 7 => delta = -1
            if (prevPoint != null && count >= k)
            {
                maxPowerful = Math.max(maxPowerful, point - 1);              //                                                                                      maxPowerful = max(-1, 3) = 3  maxPowerful = max(3, 4) = 4
            }

            count += delta;                                                  // count += 1 → count = 1                                      count += 1 => count = 2  count += 0 => count = 2        count += (-1) => count = 1  count += (-1) => count = 0
            prevPoint = point;                                               // prevPoint = null => no check for powerful => prevPoint = 1  prevPoint = 3            prevPoint = 4                  prevPoint = 5               prevPoint = 7
        }

        return maxPowerful;                                                  // returns 4
    }

    public static void main(String[] args) 
    {
        int[][] i1 = {{1, 3}, {4, 6}, {3, 4}};
        System.out.println(powerfulInteger(i1, 2)); // 4

        int[][] i2 = {{1, 4}, {12, 45}, {3, 8}, {10, 12}};
        System.out.println(powerfulInteger(i2, 3)); // -1

        int[][] i3 = {{16, 21}, {5, 8}, {12, 17}, {17, 29}, {9, 24}};
        System.out.println(powerfulInteger(i3, 3)); // 21

        int[][] i4 = {{16, 21}, {4, 6}, {3, 4}, {12, 45}, {5, 23}, {12, 3}, {3, 6}, {45, 7}};
        System.out.println(powerfulInteger(i4, 3));

        int[][] i5 = {{16, 21}, {5, 8}};
        System.out.println(powerfulInteger(i5, 5));
    }
}