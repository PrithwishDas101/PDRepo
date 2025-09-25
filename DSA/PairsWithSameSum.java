import java.util.*;

class pair 
{
    long first, second;

    public pair(long first, long second) 
    {
        this.first = first;
        this.second = second;
    }
}

class PairsWithSameSum 
{
    public pair[] allPairs(int target, int arr1[], int arr2[])         // target = 9, arr1 = [1, 2, 4, 5, 7]
    {
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int num : arr2) 
        {
            map2.put(num, map2.getOrDefault(num, 0) + 1); // map to store frequency of elements in arr2
        }

        ArrayList<pair> resultList = new ArrayList<>();                // map to store frequency of elements in arr2

        for (int u : arr1) 
        {
            int v = target - u;                                       

            if (map2.containsKey(v))                                   
            {
                int freq = map2.get(v);                              

                for (int i = 0; i < freq; i++)   
                {  
                    resultList.add(new pair(u, v));            
                }
            }
        }

        resultList.sort((p1, p2) -> Long.compare(p1.first, p2.first)); // sort all pairs by the first element (u) in ascending order

        pair[] result = new pair[resultList.size()];                   // array to convert the ArrayList into an array

        return resultList.toArray(result);                    
    }

    // Optional main to test
    public static void main(String[] args) 
    {
        PairsWithSameSum sol = new PairsWithSameSum();

        int[] a = {1, 2, 4, 5, 7};
        int[] b = {5, 6, 3, 4, 8};
        int target = 9;

        pair[] res = sol.allPairs(target, a, b);

        for (pair p : res) 
        {
            System.out.println(p.first + " " + p.second);
        }
    }
}
