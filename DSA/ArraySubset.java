import java.util.HashMap;

class ArraySubset 
{
    public boolean isSubset(int a[], int b[]) 
    {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : a) 
        {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);  // a count of how many times each number appears in a
        }

        for (int num : b) 
        {
            if (!freqMap.containsKey(num) || freqMap.get(num) == 0) 
            {
                return false;                                                 // if num does not exist in the frequency map for a[] => return false(not subset)
            }
            freqMap.put(num, freqMap.get(num) - 1);                           // used one piece of num from a[] so it needs 1 less now”
        }

        return true; 
    }
    public static void main(String[] args) 
    {
        int[] a = {11, 1, 13, 21, 3, 7};
        int[] b = {11, 3, 7, 1};

        ArraySubset subsetChecker = new ArraySubset();
        boolean result = subsetChecker.isSubset(a, b);

        System.out.println(result);
    }
}
