/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

*/

class SymmetricTree 
{
    public boolean isSymmetric(Node root) 
    {
        if (root == null) 
        {
            return true;                        // empty tree is always symmetric
        }
        
        return isMirror(root.left, root.right); // sending left anf right nodes of main tree root 
    }

    private boolean isMirror(Node t1, Node t2)  
    {
        if (t1 == null && t2 == null)          
        {
            return true;                        // empty left and right nodes is null then the tree is always symmetric
        }
        
        if (t1 == null || t2 == null)          
        {
            return false;                       // if the left node is null and the right node is not and vice versa then the tree is not symmetric
        }

        return (t1.data == t2.data) &&          // left and right nodes are equal then return true 
                isMirror(t1.left, t2.right) &&  // again we send in the left nodes left and right nodes
                isMirror(t1.right, t2.left);    // and again we send in the left nodes left and right nodes
    }
    public static void main(String[] args) 
    {
        // Example 1: [1,2,2,3,4,4,3]
        Node root1        = new Node(1);
        root1.left        = new Node(2);
        root1.right       = new Node(2);
        root1.left.left   = new Node(3);
        root1.left.right  = new Node(4);
        root1.right.left  = new Node(4);
        root1.right.right = new Node(3);
        
        SymmetricTree sol = new SymmetricTree();
        System.out.println("Tree 1 is symmetric = " + sol.isSymmetric(root1));
        
        // Example 2: [1,2,2,null,3,null,3]
        Node root2        = new Node(1);
        root2.left        = new Node(2);
        root2.right       = new Node(2);
        root2.left.right  = new Node(3);
        root2.right.right = new Node(3);
        
        System.out.println("Tree 2 is symmetric = " + sol.isSymmetric(root2)); // false
    }
}