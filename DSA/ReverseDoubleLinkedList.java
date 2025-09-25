class DLLNode 
{
    int data; DLLNode next; DLLNode prev;

    DLLNode(int data) 
    {
        this.data = data;
        next = null;
        prev = null;
    }
}

class ReverseDoubleLinkedList 
{
    public DLLNode reverseDLL(DLLNode head) 
    {
        if (head == null || head.next == null) // standard testing for null
        {
            return head;
        }

        DLLNode current = head;               // currently we store the head as our current node
        DLLNode temp = null;                  // we need a temporary node holder too

        while (current != null) 
        {
            temp = current.prev;              // standard double linked list reversal technique 
            current.prev = current.next;     
            current.next = temp;
            current = current.prev;          
        }

        if (temp != null) 
        {
            head = temp.prev;                 // new head after loop
        }

        return head;
    }

    public void printList(DLLNode head) 
    {
        DLLNode curr = head;
    
        while (curr != null) 
        {
            System.out.print(curr.data);
            
            if (curr.next != null) 
            {
                System.out.print(" <-> ");
            }

            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) 
    {
        ReverseDoubleLinkedList obj = new ReverseDoubleLinkedList();

        // Create DLL: 3 <-> 4 <-> 5
        
        DLLNode head = new DLLNode(3);
        DLLNode second = new DLLNode(4);
        DLLNode third = new DLLNode(5);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        System.out.print("Original List: ");
        obj.printList(head);

        // Reverse the list
        head = obj.reverseDLL(head);

        System.out.print("Reversed List: ");
        obj.printList(head);
    }
}
