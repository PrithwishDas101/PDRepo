import java.util.*;

class Node8
{
    int data;
    Node8 next;

    Node8(int d) 
    {
        data = d;
        next = null;
    }
}

class RemoveDuplicateNodes 
{
    public Node8 removeDuplicates(Node8 head) 
    {
        if (head == null)                          // empty node so
        {
            return null;
        }

        HashSet<Integer> seen = new HashSet<>();

        Node8 current = head;
        Node8 prev = null;

        while (current != null) 
        {
            if (seen.contains(current.data)) 
            {
                prev.next = current.next;
            } 
            else
            {
                seen.add(current.data);
                prev = current;
            }
            current = current.next;
        }

        return head;
    }
}