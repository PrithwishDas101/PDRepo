public class DeleteNode 
{
    static class Node 
    {
        int data;
        Node next;

        Node(int d) 
        {
            data = d;
            next = null;
        }
    }

    static Node deleteNode(Node head, int x) 
    {
        x = x - 2;

        if (x < 0) 
        {
            return head.next;
        }

        Node temp = head;

        while (x != 0 && temp != null) 
        {
            temp = temp.next;
            x--;
        }

        if (temp != null && temp.next != null) 
        {
            temp.next = temp.next.next;
        }

        return head;
    }

    static void printList(Node head) 
    {
        Node curr = head;
        while (curr != null) 
        {
            System.out.print(curr.data);

            if (curr.next != null) 
            {
                System.out.print(" -> ");
            }

            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node(9);

        System.out.println("Original list:");
        printList(head);

        int x = 2;
        head = deleteNode(head, x);

        System.out.println("After deleting position " + x + ":");
        printList(head);
    }
}
