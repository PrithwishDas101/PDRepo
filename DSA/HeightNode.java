class Node6
{
    int data;
    Node6 left, right;

    Node6(int item)
    {
        data = item;
        left = right = null;
    }
}

class HeightNode 
{
    int height(Node6 node) 
    {
        if (node == null) 
        {
            return 0;
        }

        return heightEdges(node);
    }

    private int heightEdges(Node6 node) 
    {
        if (node == null) 
        {
            return -1;
        }

        int leftH = heightEdges(node.left);
        int rightH = heightEdges(node.right);

        return 1 + Math.max(leftH, rightH);         // 12 is not null => go to heightEdges(12)
                                                    // leftH => 8 
                                                    // leftH => 5
                                                    // LeftH => null => heightEdges(null) = -1
                                                    // rightH => null => heightEdges(null) = -1
                                                    // Return 1 + max(-1, -1) = 1 + (-1) = 0
                                                    // at Node(8) => rightH = 11
                                                    // LeftH => null => heightEdges(null) = -1
                                                    // rightH => null => heightEdges(null) = -1
                                                    // Return 1 + max(-1, -1) = 1 + (-1) = 0
                                                    // at Node(12) => rightH = 18
                                                    // Return 1 + max(-1, -1) = 0
                                                    // returns 1 + max(1, 0) = 1 + 1 = 2

    }
    public static void main(String[] args) 
    {
        //      12
        //     /  \
        //    8    18
        //   / \
        //  5  11
        Node6 root = new Node6(1);
        root.left = new Node6(2);
        root.right = new Node6(3);
        root.left.left = new Node6(4);

        HeightNode obj = new HeightNode();
        System.out.println("Height of tree: " + obj.height(root));
    }
}