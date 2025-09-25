import java.util.ArrayList;

class PostOrderNode 
{
    int data;
    PostOrderNode left, right;

    PostOrderNode(int data) 
    {
        this.data = data;
        left = right = null;
    }
}

class PostorderTraversal 
{
    static ArrayList<Integer> inOrder(PostOrderNode root) 
    {
        ArrayList<Integer> result = new ArrayList<>();

        inorderHelper(root, result);
        
        return result;
    }
    
    private static void inorderHelper(PostOrderNode node, ArrayList<Integer> result) 
    {
        if (node == null) 
        {
            return;                         // standard procedure
        }
        
        inorderHelper(node.right, result);  // traversing the right nodes of the tree

        inorderHelper(node.left, result);   // traversing the left nodes of the tree
        
        result.add(node.data);              // adding the left nodes to result

    }
    public static void main(String[] args) 
    {
        // Creating a sample tree:
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5
        
        PostOrderNode root = new PostOrderNode(1);
        root.left = new PostOrderNode(2);
        root.right = new PostOrderNode(3);
        root.left.left = new PostOrderNode(4);
        root.left.right = new PostOrderNode(5);

        ArrayList<Integer> inorderList = inOrder(root);
        
        System.out.println("Inorder Traversal: " + inorderList);
    }
}