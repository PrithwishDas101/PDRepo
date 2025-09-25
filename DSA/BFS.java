import java.util.*;

class BFS 
{
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) 
    {
        ArrayList<Integer> bfsResult = new ArrayList<>();   // to store BFS traversal order
        int V = adj.size();                                 // to stores number of vertices => V = 5

        boolean[] visited = new boolean[V];                 // to keep track of visited nodes => visited = [true, false, false, false, false]
        Queue<Integer> queue = new LinkedList<>();          // queue for BFS

        visited[0] = true;                                  // marks vertex 0 as visited => BFS always starts from vertex 0
        queue.add(0);                                     // pushing vertex 0 into the queue as our starting point

        while (!queue.isEmpty()) 
        {
            int node = queue.poll();                        // Remove elements queue
            bfsResult.add(node);                            // Add them to the result list

            for (int neighbor : adj.get(node))              // looping through all neighbors of the current node
            {
                if (!visited[neighbor])                     // checking if this neighbor has not been visited before
                {
                    visited[neighbor] = true;               // marks the neighbor as visited to avoid revisiting
                    queue.add(neighbor);                    // enqueues the neighbor so it will be processed in future iterations
                }
            }
        }                     
        return bfsResult;                                   // Poll 0 => result = [0]
                                                            // Neighbors => 2, 3, 1 => mark visited + enqueue
                                                            // visited = [true, true, true, true, false]
                                                            // queue = [2, 3, 1]

                                                            // Poll 2 => result = [0, 2]
                                                            // Neighbors => 0 (skip), 4 => mark visited + enqueue
                                                            // visited = [true, true, true, true, true]
                                                            // queue = [3, 1, 4]

                                                            // Poll 3 => result = [0, 2, 3]
                                                            // Neighbors => 0 (skip)
                                                            // queue = [1, 4]

                                                            // Poll 1 => result = [0, 2, 3, 1]
                                                            // Neighbors => 0 (skip)
                                                            // queue = [4]

                                                            // Poll 4 => result = [0, 2, 3, 1, 4]
                                                            // Neighbors => 2 (skip)
                                                            // queue = []

                                                            // return result = [0, 2, 3, 1, 4]
    }
    public static void main(String[] args) 
    {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        adj.add(new ArrayList<>(Arrays.asList(2, 3, 1)));
        adj.add(new ArrayList<>(Arrays.asList(0)));
        adj.add(new ArrayList<>(Arrays.asList(0, 4)));
        adj.add(new ArrayList<>(Arrays.asList(0)));
        adj.add(new ArrayList<>(Arrays.asList(2)));

        BFS obj = new BFS();

        System.out.println(obj.bfs(adj));
    }
}
