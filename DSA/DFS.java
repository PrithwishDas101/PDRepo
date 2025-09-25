import java.util.*;

class DFS 
{
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) 
    {
        ArrayList<Integer> result = new ArrayList<>();           // to collect the traversal in the visited order

        boolean[] visited = new boolean[adj.size()];             //  visited = [false,false,false,false,false]

        dfsHelper(0, adj, visited, result);
        return result;                                           // returns [0, 2, 4, 3, 1]
    }

    private void dfsHelper(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> result) 
    {
        visited[node] = true;                                     // mark current node so it won’t be revisited
        result.add(node);                                         // apend the node to result the first we see it
        for (int neighbor : adj.get(node)) 
        {
            if (!visited[neighbor])                               // only recurse on neighbors that haven’t been visited yet
            {
                dfsHelper(neighbor, adj, visited, result);
            }                                                     // dfsHelper(0, ...)
                                                                  // visited[0] = true => visited = [true, false, false, false, false]
                                                                  // result.add(0) => result = [0]
                                                                  // iterate neighbors of 0: 2, 3, 1
                                                                  // first neighbor = 2, not visited => recurse dfsHelper(2, ...)
                                                                  // dfsHelper(2, ...) (from 0=>2)
                                                                  // visited[2] = true => visited = [true, false, true, false, false]
                                                                  // result.add(2) => result = [0, 2]
                                                                  // neighbors of 2: 0, 4
                                                                  // neighbor 0 => already visited => skip
                                                                  // neighbor 4 => not visited => recurse dfsHelper(4, ...)
                                                                  // dfsHelper(4, ...) (from 2=>4)
                                                                  // visited[4] = true => visited = [true, false, true, false, true]
                                                                  // result.add(4) => result = [0, 2, 4]
                                                                  // neighbors of 4: 2 => already visited → no further recursion
                                                                  // return from dfsHelper(4) back to dfsHelper(2)
                                                                  // back in dfsHelper(2) after finishing neighbor 4
                                                                  // all neighbors processed => return from dfsHelper(2) back to dfsHelper(0)
                                                                  // back in dfsHelper(0) continuing neighbors
                                                                  // next neighbor = 3, not visited => recurse dfsHelper(3, ...)
                                                                  // dfsHelper(3, ...) (from 0→3)
                                                                  // visited[3] = true => visited = [true, false, true, true, true]
                                                                  // result.add(3) => result = [0, 2, 4, 3]
                                                                  // neighbors of 3: 0 => already visited => no recursion
                                                                  // return from dfsHelper(3) to dfsHelper(0)
                                                                  // back in dfsHelper(0) continuing neighbors
                                                                  // next neighbor = 1, not visited => recurse dfsHelper(1, ...)
                                                                  // dfsHelper(1, ...) (from 0=>1)
                                                                  // visited[1] = true => visited = [true, true, true, true, true]
                                                                  // result.add(1) => result = [0, 2, 4, 3, 1]
                                                                  // neighbors of 1: 0 => visited → skip
                                                                  // return from dfsHelper(1) to dfsHelper(0)
                                                                  // Back in dfsHelper(0) => all neighbors processed => return to caller
                                                                  // visited = [true, true, true, true, true]
                                                                  // result = [0, 2, 4, 3, 1]
        }
    }
    public static void main(String[] args) 
    {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        adj.add(new ArrayList<>(Arrays.asList(2, 3, 1)));
        adj.add(new ArrayList<>(Arrays.asList(0)));
        adj.add(new ArrayList<>(Arrays.asList(0, 4)));
        adj.add(new ArrayList<>(Arrays.asList(0)));
        adj.add(new ArrayList<>(Arrays.asList(2)));

        DFS obj = new DFS();

        System.out.println(obj.dfs(adj));
    }
}
