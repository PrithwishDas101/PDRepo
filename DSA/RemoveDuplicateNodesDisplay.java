class Node3
{
    int data;
    Node3 next;
        
    Node3(int d) 
    {
        data = d; 
        next = null; 
    }
}

class RemoveDuplicateNodesDisplay 
{
    Node3 removeDuplicates(Node3 head)                    // 1 -> 1 -> 2 -> 3 -> 3
    {
        Node3 current = head;

        while (current != null && current.next != null)
        {
            
            if (current.data == current.next.data)       // 1 == 1
            {
                current.next = current.next.next;        // 1 -> 2 -> 3 -> 3
                                                         // 1 -> 2 -> 3
            }
            else
            {
                current = current.next;                  
            }
        }

        return head;                                    
    }

    void printList(Node3 head) 
    {
        Node3 temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Node3 head = new Node3(1);
        head.next  = new Node3(1);
        head.next.next = new Node3(2);
        head.next.next.next = new Node3(3);
        head.next.next.next.next = new Node3(3);

        RemoveDuplicateNodesDisplay obj = new RemoveDuplicateNodesDisplay();
        System.out.print("Original List: ");
        obj.printList(head);

        Node3 newHead = obj.removeDuplicates(head);
        System.out.print("List after removing duplicates: ");
        obj.printList(newHead);
    }
}