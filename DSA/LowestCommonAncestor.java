class LCANode
{
    int data;
    LCANode left, right;

    LCANode(int data)
    {
        this.data = data;
        left = right = null;
    }
}

public class LowestCommonAncestor 
{
    LCANode LCA(LCANode root, LCANode n1, LCANode n2) 
    {
        while (root != null)                                     // BST is in ascending order so left of the root is decreasing and the right of the root is increasing
        {
            if (n1.data < root.data && n2.data < root.data)      // keep moving leftwards till we find the n1 or n2 as they might be lower than the root
            {
                root = root.left;
            } 
            
            if (n1.data > root.data && n2.data > root.data)     // keep moving rightwards till we find the n1 or n2 as they might be higher than the root
            {
                root = root.right;
            } 

            else
            {
                return root;                                    // return the root as the that might be n1 or n2 which is obviously the lowest ancestor of itself and of n2 or n1 left or right of it
            }
        }
        return null;
    }    
    public static void main(String[] args) {
        /*
                 20
                /  \
               8    22
              / \
             4   12
                /  \
               10  14
        */
        LCANode root = new LCANode(20);
        root.left = new LCANode(8);
        root.right = new LCANode(22);
        root.left.left = new LCANode(4);
        root.left.right = new LCANode(12);
        root.left.right.left = new LCANode(10);
        root.left.right.right = new LCANode(14);

        LCANode n1 = root.left;
        LCANode n2 = root.left.right.right;

        LowestCommonAncestor obj = new LowestCommonAncestor();
        LCANode lca = obj.LCA(root, n1, n2);

        System.out.println("LCA of " + n1.data + " and " + n2.data + " is: " + lca.data);
    }
}
