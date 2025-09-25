import java.util.ArrayList;

class PreOrderNode 
{
    int data;
    PreOrderNode left, right;

    PreOrderNode(int data) 
    {
        this.data = data;
        left = right = null;
    }
}

class PreorderTraversal 
{
    static ArrayList<Integer> inOrder(PreOrderNode root) 
    {
        ArrayList<Integer> result = new ArrayList<>();

        inorderHelper(root, result);
        
        return result;
    }
    
    private static void inorderHelper(PreOrderNode left, ArrayList<Integer> result) 
    {
        if (left == null) 
        {
            return;                         // standard procedure
        }

        result.add(left.data);              // adding the left nodes to result

        inorderHelper(left.left, result);   // traversing the left nodes of the tree
        
        inorderHelper(left.right, result);  // traversing the right nodes of the tree
    }
    public static void main(String[] args) 
    {
        // Creating a sample tree:
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5
        
        PreOrderNode root = new PreOrderNode(1);
        root.left = new PreOrderNode(2);
        root.right = new PreOrderNode(3);
        root.left.left = new PreOrderNode(4);
        root.left.right = new PreOrderNode(5);

        ArrayList<Integer> inorderList = inOrder(root);
        
        System.out.println("Inorder Traversal: " + inorderList);
    }
}