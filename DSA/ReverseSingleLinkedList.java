class SLLNode
{
    int data;
    SLLNode next;

    SLLNode(int value) 
    {
        this.data = value;
        next = null;
    }
}

class ReverseSingleLinkedList 
{
    SLLNode reverseList(SLLNode head) 
    {

        SLLNode current = head;

        SLLNode prev = null;

        while (current != null) 
        {
            SLLNode nextNode = current.next;     // standard single linked list reversal technique
            current.next = prev;              
            prev = current;                   
            current = nextNode;               
        }

        return prev;                           // when no nodes
    }

    void printList(SLLNode head) 
    {
        SLLNode temp = head;

        while (temp != null) 
        {
            System.out.print(temp.data + " "); // standard displaying of nodes 
            temp = temp.next;
        }

        System.out.println();
    }
    public static void main(String[] args) 
    {
        SLLNode head = new SLLNode(2);

        head.next = new SLLNode(7);
        head.next.next = new SLLNode(10);
        head.next.next.next = new SLLNode(9);
        head.next.next.next.next = new SLLNode(8);

        ReverseSingleLinkedList obj = new ReverseSingleLinkedList();

        System.out.print("Original List: ");
        obj.printList(head);

        SLLNode reversedHead = obj.reverseList(head);

        System.out.print("Reversed List: ");
        obj.printList(reversedHead);
    }
}
