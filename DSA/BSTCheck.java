class Node                    // blueprint for the tree nodes
{
    int data;                 // the value (of the nodes)
    Node left, right;         // left => pointer of data's left child right => pointer of data's right child

    Node(int data) 
    {
        this.data = data;
        left = right = null;  // empty nodes
    }
}

class BSTCheck 
{

    boolean isBST(Node root) 
    {
        return isBSTUtil(root, Long.MIN_VALUE, Long.MAX_VALUE); // sending the range
    }

    private boolean isBSTUtil(Node node, long min, long max) 
    {
        if (node == null)                            //  we hit a leaf, so it's va;id
        {
            return true;
        }
        if (node.data <= min || node.data >= max)    // if this node's data is not within the valid range =>  Not BST
        { 
            return false;
        }
        return isBSTUtil(node.left, min, node.data)  // for left subtree => all values must be < node.data
        && isBSTUtil(node.right, node.data, max);    // for left subtree => all values must be > node.data
    }

    public static void main(String[] args) 
    {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(3);   // 2 (root) is between 1 (left child) and 3 (right child) => rules not violated

        BSTCheck tree1 = new BSTCheck();
        System.out.println(tree1.isBST(root1));  

        Node root2 = new Node(10);
        root2.left = new Node(5);
        root2.right = new Node(20);
        root2.right.left = new Node(9);  // 5 (left child), 10(root), 20 (right child), 9 (left child of 20) 
                                              // => violates rules (9 is less than main root (10))

        BSTCheck tree2 = new BSTCheck();
        System.out.println(tree2.isBST(root2)); 
    }
}
