import java.util.*;

class Node10
{
    int data;
    Node10 left, right;

    Node10(int item)
    {
        data = item;
        left = right = null;
    }
}

class SiblinglessNodes 
{
    ArrayList<Integer> noSibling(Node10 node) 
    {
        ArrayList<Integer> result = new ArrayList<>();

        findNoSibling(node, result);                                

        if (result.isEmpty()) 
        {
            result.add(-1);                                     // as per gfg
        }

        Collections.sort(result);                               // sorting is necessary as per gfg

        return result; 
    }

    void findNoSibling(Node10 node, ArrayList<Integer> result) 
    {
        if (node == null)                                       // Obviously when node is empty
        {
            return;
        }

        if (node.left != null && node.right == null)            // if left  node child exists but right child node is not => add the left child  node's data to the list
        {
            result.add(node.left.data);
        }

        if (node.right != null && node.left == null)            // if right node child exists but left  child node is not => add the right child node's data to the list
        {
            result.add(node.right.data);
        }

        findNoSibling(node.left, result);
        findNoSibling(node.right, result);
    }
    public static void main(String[] args) 
    {
        /*
              1
             / \
            2   3
           /
          4
        */
        Node10 root1 = new Node10(1);
        root1.left = new Node10(2);
        root1.right = new Node10(3);
        root1.left.left = new Node10(4);

        SiblinglessNodes obj = new SiblinglessNodes();
        ArrayList<Integer> result1 = obj.noSibling(root1);

        System.out.print("Nodes without siblings: ");

        for (int val : result1) 
        {
            System.out.print(val + " ");
        }
        System.out.println();

        Node10 root2 = null;

        ArrayList<Integer> result2 = obj.noSibling(root2);

        System.out.print("Nodes without siblings: ");

        for (int val : result2) 
        {
            System.out.print(val + " ");
        }

        System.out.println();
    }
}