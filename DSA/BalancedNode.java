class Node5 
{
    int data;
    Node5 left, right;

    Node5(int d) 
    {
        data = d;
        left = right = null;
    }
}

class BalancedNode 
{
    public boolean isBalanced(Node5 root) 
    {
        return checkHeight(root) != -1;
    }

    private int checkHeight(Node5 node) 
    {
        if (node == null) 
        {
            return 0;                                // node empty so
        }

        int leftHeight = checkHeight(node.left);

        if (leftHeight == -1) 
        {
            return -1; // Left subtree unbalanced
        }

        int rightHeight = checkHeight(node.right);
        
        if (rightHeight == -1)
        {
            return -1; // Right subtree unbalanced
        }

        if (Math.abs(leftHeight - rightHeight) > 1)
        { 
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }
    public static void main(String[] args) 
    {
        BalancedNode obj = new BalancedNode();

        Node5 root1 = new Node5(10);
        root1.left = new Node5(20);
        root1.right = new Node5(30);
        root1.left.left = new Node5(40);
        root1.left.right = new Node5(60);

        System.out.println("Tree 1 Balanced: " + obj.isBalanced(root1));

        Node5 root2 = new Node5(1);
        root2.left = new Node5(2);
        root2.left.left = new Node5(3);
        root2.left.left.left = new Node5(4);

        System.out.println("Tree 2 Balanced: " + obj.isBalanced(root2)); 
    }
}