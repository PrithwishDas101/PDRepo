class BSTNode1 
{
    int data;
    BSTNode1 left, right;

    BSTNode1(int data) 
    {
        this.data = data;
        left = right = null;
    }
}

class KthNode 
{
    static int count = 0;                       // default
    static int result = -1;                     // default

    public int kthLargest(BSTNode1 root, int k) 
    {
        count = 0;
        result = -1;

        reverseInorder(root, k);

        return result;
    }

    private void reverseInorder(BSTNode1 node, int k) 
    {
        if (node == null || count >= k)               // standard actions
        {
            return;
        }

        reverseInorder(node.right, k);                // traverse right nodes

        count++;                                      // the more nodes we traverse more the count increases

        if (count == k)                               // if our counter and k matches then result is that node
        {
            result = node.data;
            return;
        }

        reverseInorder(node.left, k);                 // traverse left nodes too
    } 

    public void inorder(BSTNode1 node) 
    {
        if (node == null) 
        {
            return;
        }

        inorder(node.left);

        System.out.print(node.data + " ");

        inorder(node.right);
    }

    public static void main(String[] args) 
    {
        BSTNode1 root     = new BSTNode1(4);
        root.left         = new BSTNode1(2);
        root.right        = new BSTNode1(9);
        root.left.left    = new BSTNode1(1);
        root.left.right   = new BSTNode1(3);
        root.right.right  = new BSTNode1(10);

        KthNode sol = new KthNode();

        System.out.print("BST inorder: ");
        sol.inorder(root);
        System.out.println();

        int k = 2;
        System.out.println(k + "th largest: " + sol.kthLargest(root, k)); // Output: 9
    }
}
