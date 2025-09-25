class CycleGraph 
{
    public boolean isCycle(int V, int[][] edges) 
    {
        int[] parent = new int[V];  // parent keeps track of each node’s representative (root of its set).
        int[] rank   = new int[V];  // rank keeps track of the height of the tree → helps merge sets smartly.

        for (int i = 0; i < V; i++) 
        {
            parent[i] = i;         // Each node is its own parent at first
            rank[i] = 0;           // All trees start with height 0
        }

        for (int[] edge : edges) 
        {
            int u = edge[0]; // We loop over every edge — for our example [(0–1), (1–2), (2–3), (0–3)]
            int v = edge[1]; // We loop over every edge — for our example [(0–1), (1–2), (2–3), (0–3)]

            int parentU = find(u, parent);
            int parentV = find(v, parent);

            if (parentU == parentV) 
            {
                return true;
            } 
            else 
            {
                union(parentU, parentV, parent, rank);
            }
        }

        return false;
    }

    private int find(int node, int[] parent) 
    {
        if (parent[node] != node)                              // find(0) => if parent[0] is 0 => done.
                                                               // But if parent[0] is 2 → follow the chain until you 
                                                               // reach root => then compress the path.
        {
            parent[node] = find(parent[node], parent);         // Path compression
        }
        return parent[node];                                   // Adding this edge makes a cycle                            
    }

    private void union(int u, int v, int[] parent, int[] rank) 
    {
        if (rank[u] < rank[v]) 
        {
            parent[u] = v;
        } else if (rank[u] > rank[v]) 
        {
            parent[v] = u;
        } 
        else 
        {
            parent[v] = u;
            rank[u]++;
        }
                                           // The smaller tree attaches under the bigger tree’s root.
                                           // If equal, pick one and bump its rank (height).
                                           // This keeps the tree flat => find stays fast.
    }
    public static void main(String[] args) 
    {
        CycleGraph g = new CycleGraph();

        int V1 = 4;
        int[][] edges1 = { {0, 1}, {0, 2}, {1, 2}, {2, 3} };
        System.out.println(g.isCycle(V1, edges1));

        int V2 = 4;
        int[][] edges2 = { {0, 1}, {1, 2}, {2, 3} };
        System.out.println(g.isCycle(V2, edges2));
    }
}
