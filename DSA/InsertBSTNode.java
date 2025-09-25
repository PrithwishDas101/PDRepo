class BSTNode
{
    int data;
    BSTNode left, right;

    BSTNode(int data)
    {
        this.data = data;
        left = right = null;
    }
}

public class InsertBSTNode 
{
    static BSTNode insert(BSTNode root, int Key)    // inserting sequence => 3, 1, 6, 4, 2
    {
        if (root == null)                           // if the current node is null => create a new node with Key
        {
            return new BSTNode(Key);                // this is where we actually insert keys
                                                    // (root == null) => create new node 3
        }

        if (root.data < Key)                        // key is smaller than current node’s data => to the left subtree
        {                                           // Key=1 => root.data = 3 => 1 < 3 => to the left  => root.left  = null  => insert new node 1 [1, 3] 
            root.left = insert(root.left, Key);     // key=6 => root.data = 3 => 6 > 3 => to the right => root.right = null  => insert new node 6 [1, 3, 6]
        }                                           // key=4 => root.data = 3 => 4 > 3 => to the right => root.right.data = 4 < 6 => to the left => root.left  = null => insert new node 4 [1, 3, 4, 6]
                                                    // key=2 => root.data = 3 => 2 < 3 => to the left  => root.left.data = 2 > 1 => to the right => root.right = null => insert new node 4 [1, 2, 3, 4, 6]
        else if (root.data > Key)
        {
            root.right = insert(root.right, Key);   // key is  bigger than current node’s data => to the right subtree
        }

        return root;
    }
    static void inorder(BSTNode root)
    {
        if (root == null)
        {
            return;
        }

        inorder(root.right);
        System.out.print(root.data + " ");
        inorder(root.left);
    }
    public static void main(String[] args) 
    {

        BSTNode root = null;

        root = insert(root, 3);
        root = insert(root, 1);
        root = insert(root, 6);
        root = insert(root, 4);
        root = insert(root, 2);
        root = insert(root, 6);

        System.out.print("Inorder traversal: ");
        inorder(root);
    }
}
