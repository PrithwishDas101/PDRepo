import java.util.ArrayList;

public class InsertIntervals 
{
    public static ArrayList<int[]> insertIntervals (int[][] interval, int[] newInterval) //  interval => [[1, 3], [4, 5], [6, 7], [8, 10]] ; newInterval = [5, 6]
    {
        ArrayList<int[]> result = new ArrayList<>();

        int i = 0;                          // starting point of array
        int n = interval.length;            // ending point of array

        while (i < n && interval[i][1] < newInterval[0]) // (i < n) => we don’t go out of bounds && intervals[i][1] is the end time of the current interval => newInterval[0] is the start time of the new interval => If the current interval ends before the new one starts, there’s no overlap
        {                                                // (i=0) => interval[0][1] = [1, 3] => newinterval starts at 5 => 3 < 5
            result.add(interval[i]);                     // add [1, 3] to result => result = [[1, 3]]
            i++;                                         // (i=1) => interval[1][1] = [4, 5] ends at 5 => new interval starts at 5 => 5 < 5
                                                         // stop looping
        }

        
        while (i < n && interval[i][0] <= newInterval[1])                // (i < n) => we don't go out of bounds && intervals[i][0] is the start of the current interval => newInterval[1] is the end of the new interval => if the current interval starts before or exactly when the new interval ends, it means there’s an overlap
        {                                                                // (i=1) => [4, 5] => 4 < 6  => overlap => newInterval[0] = min(5, 4) = 4 => newInterval[1] = max(6, 5) = 6 => newInterval = [4, 6]
            newInterval[0] = Math.min(newInterval[0], interval[i][0]);   // (i=2) => [6, 7] => 6 <= 6 => overlap => newInterval[0] = min(4, 6) = 4 => newInterval[1] = max(6, 7) = 7 => newInterval = [4, 7]
            newInterval[1] = Math.max(newInterval[1], interval[i][1]);   // (i=3) => [8, 10] => 8 <= 7 => false => stop loop
            i++;
        }

        result.add(newInterval);                                         // result = [[1, 3], [4, 7]]

        
        while (i < n)                                                    // still have intervals left in the original ArrayListlist
        {
            result.add(interval[i]);                                     // (i=3) => add [8, 10] => result = [[1, 3], [4, 7], [8, 10]]
            i++;                                                         // (i=4) => loop ends
        }

        return result;                                                   // returns result = [[1, 3], [4, 7], [8, 10]]
    }

    public static void printList(ArrayList<int[]> list) 
    {
        System.out.print("[");

        for (int j = 0; j < list.size(); j++) 
        {
            int[] interval = list.get(j);

            System.out.print("[" + interval[0] + ", " + interval[1] + "]");

            if (j != list.size() - 1) 
            {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
    public static void main(String[] args) 
    {
        int[][] intervals1 = { {1, 3}, {4, 5}, {6, 7}, {8, 10} }; int[] newInterval1 = {5, 6};
        ArrayList<int[]> ans1 = insertIntervals(intervals1, newInterval1);
        printList(ans1);

        int[][] intervals2 = { {1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16} }; int[] newInterval2 = {4, 9};
        ArrayList<int[]> ans2 = insertIntervals(intervals2, newInterval2);
        printList(ans2);
    }
}
