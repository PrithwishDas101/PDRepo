import java.util.*;

class TwoSumPairs 
{
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) 
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        HashSet<String> addedPairs = new HashSet<>();

        for (int num : arr) 
        {
            int neg = -num;
            if (seen.contains(neg)) 
            {
                int a = Math.min(num, neg);
                int b = Math.max(num, neg);
                String key = a + "," + b;

                if (addedPairs.add(key))  // add() returns false if already present!
                {
                    result.add(new ArrayList<>(Arrays.asList(a, b)));
                }
            }
            seen.add(num);
        }

        result.sort((a, b) -> {
            if (!a.get(0).equals(b.get(0)))
            {
                return a.get(0) - b.get(0);
            }
            else
            {
                return a.get(1) - b.get(1);
            }
        });

        return result;
    }
}
