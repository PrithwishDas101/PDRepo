import java.util.*;

public class Spiral 
{
    static class Node11 
    {
        int data;
        Node11 left, right;

        Node11(int item) 
        {
            data = item;
            left = right = null;
        }
    }

    public static ArrayList<Integer> findSpiral(Node11 root) 
    {
        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null)                                     // empty node so return nothing
        {
            return ans;
        }

        Queue<Node11> q = new LinkedList<>();
        q.add(root);

        boolean reverse = true;                               // starting with right-to-left

        while (!q.isEmpty()) 
        {
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) 
            {
                Node11 curr = q.poll();
                level.add(curr.data);

                if (curr.left != null) 
                {
                    q.add(curr.left);
                }

                if (curr.right != null) 
                {
                    q.add(curr.right);
                }
            }

            if (reverse) 
            {
                Collections.reverse(level);
            }

            ans.addAll(level);

            reverse = !reverse;                               // Toggle direction
        }

        return ans;
    }

    public static void main(String[] args) 
    {
        /*
              1
             / \
            3   2
        */
        Node11 root1 = new Node11(1);
        root1.left = new Node11(3);
        root1.right = new Node11(2);
        System.out.println(findSpiral(root1)); // Output: [1, 3, 2]

        /*
              10
             /  \
           20    30
          /  \
        40    60
        */
        Node11 root2 = new Node11(10);
        root2.left = new Node11(20);
        root2.right = new Node11(30);
        root2.left.left = new Node11(40);
        root2.left.right = new Node11(60);
        System.out.println(findSpiral(root2)); // Output: [10, 20, 30, 60, 40]
    }
}
