import java.util.*;

class MinimumCostOfRopes 
{
    public static int minCost(int[] arr) 
    {

        if (arr.length <= 1)                                   // obviously cost = 0
        {
            return 0;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int len : arr) 
        {
            pq.offer(len);
        }

        int totalCost = 0;

        while (pq.size() > 1) 
        {
            int first = pq.poll();
            int second = pq.poll();
            int cost = first + second;
            totalCost += cost;
            pq.offer(cost);                 // heap = [2, 3, 4, 6]
                                            // cost = 2 + 3 = 5
                                            // totalCost = 5
                                            // heap = [4, 5, 6]
                                            // cost = 4 + 5 = 9
                                            // totalCost = 9
                                            // heap = [6, 14]
                                            // totalCost = 6 + 9 = 15
                                            // heap = [15]
                                            // cost = 0 + 15
                                            // totalCost = 14 + 15 = 29

        }

        return totalCost;                   // returns 29
    }
    public static void main(String[] args) 
    {
        int[] arr = {4, 3, 2, 6};
        int minCost = MinimumCostOfRopes.minCost(arr);
        System.out.println("Minimum cost to connect ropes: " + minCost); // Output: 29
    }
}
