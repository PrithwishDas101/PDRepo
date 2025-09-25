class Node7
{
    int data;
    Node7 left,right;
    Node7(int d)
    {
        data=d;
        left=right=null;
    }
}

class Solution 
{
    boolean isIdentical(Node7 r1, Node7 r2) 
    {
        if (r1 == null && r2 == null)                // if nodes are null => identical 
        {
            return true;
        }

        if (r1 == null || r2 == null)               // if one nodes is null and the other is not => not identical
        {
            return false;
        }
        
        return (r1.data == r2.data) &&             // current node data are the same
                isIdentical(r1.left, r2.left) &&   // left  subtrees are identical
                isIdentical(r1.right, r2.right);   // right subtrees are identical
    }
}