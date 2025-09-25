import java.util.ArrayList;

class InOrderNode 
{
    int data;
    InOrderNode left, right;

    InOrderNode(int data) 
    {
        this.data = data;
        left = right = null;
    }
}

class InorderTraversal 
{
    static ArrayList<Integer> inOrder(InOrderNode root) 
    {
        ArrayList<Integer> result = new ArrayList<>();

        inorderHelper(root, result);
        
        return result;
    }
    
    private static void inorderHelper(InOrderNode node, ArrayList<Integer> result) 
    {
        if (node == null) 
        {
            return;                         // standard procedure
        }

        inorderHelper(node.left, result);   // traversing the left nodes of the tree
        
        result.add(node.data);              // adding the left nodes to result
        
        inorderHelper(node.right, result);  // traversing the right nodes of the tree
    }
    public static void main(String[] args) 
    {
        // Creating a sample tree:
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5
        
        InOrderNode root = new InOrderNode(1);
        root.left = new InOrderNode(2);
        root.right = new InOrderNode(3);
        root.left.left = new InOrderNode(4);
        root.left.right = new InOrderNode(5);

        ArrayList<Integer> inorderList = inOrder(root);
        
        System.out.println("Inorder Traversal: " + inorderList);
    }
}