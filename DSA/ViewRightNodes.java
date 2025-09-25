import java.util.*;

class Node13
{
    int data;
    Node13 left, right;

    public Node13(int data)
    {
        this.data = data;
        left = right = null;
    }
}

class ViewRightNodes 
{

    static ArrayList<Integer> rightView(Node13 root) 
    {
        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null)                                 // for no nodes in tree
        {
            return ans;
        }

        Queue<Node13> q = new LinkedList<>();             // BFS (level-order traversal) with a queue
        q.add(root);                                      // start with root in queue

        while (!q.isEmpty()) 
        {
            int size = q.size();

            for (int i = 0; i < size; i++) 
            {
                Node13 curr = q.poll();                   // remove the first node in the tree

               
                if (i == size - 1)                        // if it's the last node in the current level => visible from right
                {
                    ans.add(curr.data);                   // add the right children of the tree's nodes
                }

                if (curr.left != null)                    // keep adding nodes, left of the current node to the queue
                {
                    q.add(curr.left);
                }
                
                if (curr.right != null)                   // keep adding nodes, right of the current node to the queue
                {
                    q.add(curr.right);
                }
            }
        }

        return ans;                                       // returns the right nodes of the tree
    }
    public static void main(String[] args) 
    {
        Node13 root = new Node13(1);
        root.left = new Node13(2);
        root.right = new Node13(3);
        root.left.left = new Node13(4);
        root.left.right = new Node13(5);
        root.right.right = new Node13(6);

        System.out.println(rightView(root));
    }
}
