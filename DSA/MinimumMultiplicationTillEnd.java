import java.util.*;

class MinimumMultiplicationTillEnd 
{
    int minimumMultiplications(int[] arr, int start, int end) // arr = [2,5,7], start = 3, end = 30
    {
        int mod = 100000;                                     // as per gfg
        Queue<int[]> q = new LinkedList<>();                  // BFS queue => holds pairs [current number, steps so far]
        boolean[] visited = new boolean[mod];                 // marks which numbers have been visited to avoid cycles

        q.add(new int[]{start, 0});                           // start BFS with [start, 0 steps]
        visited[start] = true;                                // mark start as visited

        while (!q.isEmpty()) 
        {
            int[] node = q.poll();                            // remove current pair from queue
            int num = node[0];                                // extract current number 
            int steps = node[1];                              // extract steps to get here

            if (num == end)                                   // if current number is target => job done
            {
                return steps;                                 // return steps = 1+1 = 2
            }

            for (int factor : arr) 
            {
                int next = (num * factor) % mod;              // compute next number => as per gfg
                                                              // 3×2 = 6  mod 100000 => 6  => steps = 1 => mark visited, enqueue
                                                              // 3×5 = 15 mod 100000 => 15 => steps = 1 => mark visited, enqueue
                                                              // 3×7 = 21 mod 100000 => 21 => steps = 1 => mark visited, enqueue
                                                              // queue: [ [6,1], [15,1], [21,1] ]
                                                              // 6×2 = 12 => enqueue [12,2]
                                                              // 6×5 = 30 => FOUND  

                if (!visited[next])                           // if not visited, enqueue it
                {
                    visited[next] = true;                     // mark visited1
                    q.add(new int[]{next, steps + 1});        // add to queue with steps +1
                }
            }
        }

        return -1;                                            // if queue empties => no way to reach end
    }
    public static void main(String[] args) 
    {
        MinimumMultiplicationTillEnd obj = new MinimumMultiplicationTillEnd();

        System.out.println(obj.minimumMultiplications(new int[]{2, 5, 7}, 3, 30));
    }
}
