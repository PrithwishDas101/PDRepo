class Node9
{
    int data;
    Node9 left, right;
   Node9(int item)
   {
        data = item;
        left = right = null;
    }
} 

class MirrorTree 
{
    void mirror(Node9 node) 
    {
        if (node == null)                   // obviously when tree is empty
        {
            return;
        }

        Node9 temp = node.left;             // standard swapping left and right nodes
        node.left = node.right;
        node.right = temp;

        mirror(node.left);
        mirror(node.right);
    }

    void printNode(Node9 node) 
    {
        if (node == null) return;

        printNode(node.left);
        System.out.print(node.data + "  ");
        printNode(node.right);
    }
    public static void main(String[] args) {
        /*
              1
             / \
            2   3
           / \
          4   5
        */
        Node9 root = new Node9(1);
        root.left = new Node9(2);
        root.right = new Node9(3);
        root.left.left = new Node9(4);
        root.left.right = new Node9(5);

        MirrorTree mt = new MirrorTree();

        System.out.print("Original tree (in-order): ");
        mt.printNode(root);
        System.out.println();

        mt.mirror(root);
        System.out.print("Mirrored tree (in-order): ");
        mt.printNode(root);
        System.out.println();
    }
}