import java.util.ArrayList;
import java.util.List;

class Node4 
{
    int data;
    Node4 left, right;
    Node4(int value) 
    {
        data = value;
        left = right = null;
    }
}

class TreeLeafPath 
{
    public static List<List<Integer>> Paths(Node4 root)          // root[] = [1, 2, 3, 4, 5, N, N]
    {
        List<List<Integer>> result = new ArrayList<>();  // to store all root-to-leaf paths
        List<Integer> path = new ArrayList<>();          // current path to leaf
        dfs(root, path, result);                         // depth first search
        return result;
    }

    private static void dfs(Node4 node, List<Integer> path, List<List<Integer>> result) 
    {
        if (node == null)                                //  current node is null => stop
        {
            return;
        }

        path.add(node.data);                             // add current node’s value to the path

        if (node.left == null && node.right == null)     // both children are null => leaf node is found
        {
            result.add(new ArrayList<>(path));           // adding current path to node
        } 
        else 
        {
            dfs(node.left, path, result);                // track down the left path to look for leaf nodes
            dfs(node.right, path, result);               // track down the right path to look for leaf nodes
        }

        path.remove(path.size() - 1);                    // backtrackin => removing current path => build other paths
    }
    public static void main(String[] args) 
    {
        Node4 root = new Node4(1);
        root.left = new Node4(2);
        root.right = new Node4(3);
        root.left.left = new Node4(4);
        root.left.right = new Node4(5);

        List<List<Integer>> result = TreeLeafPath.Paths(root);

        for (List<Integer> path : result) 
        {
            System.out.println(path);
        }
    }
}
