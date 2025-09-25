class Node12 
{
    int data;
    Node12 next;
    Node12 prev;

    Node12(int d)
    {
        data = d;
        next = null;
        prev = null;
    }
}

public class DeleteDoubleLinkedList 
{
    public Node12 deleteNode(Node12 head, int x) 
    {
        if (head == null) 
        {
            return null;
        }

        if (x == 1)                                // first position to be removed
        {
            Node12 newHead = head.next;            // storing the next node of the head node temporarily

            if (newHead != null)                   // there is an existing node after the head
            {
                newHead.prev = null;               // we remove the head node
            }

            return newHead;                        // and we return the new Head node which was the previous head node's next node thus removing the original head node
        }

        Node12 curr = head;                        // storing the head as the current node
        int count = 1;                             // keeps track of the position of the current node we are visiting during traversal
                                                   // start counting from 1 because the head node is at position 1 in the list           

        while (curr != null && count < x)          // while we haven't reached the end of the list and the position to b removed
        {
            curr = curr.next;                      // we move to the next node
            count++;                               // we keep traversing to the position to be removed
        }

        if (curr == null)                          // If current node is null => the node to delete does not exist
        {
            return head;                           // simply return the original head
        }

        Node12 prevNode = curr.prev;               // stores previous of the current node
        Node12 nextNode = curr.next;               // stores next     of the current node

        if (prevNode != null)                      // if the previous node is null it means that the
        {
            prevNode.next = nextNode;              // current node is the head so skip that update the previous node of the node to be deleted to the next node
        }

        if (nextNode != null)                      // if the next node is null it means that the current node is the head so skip that           
        {
            nextNode.prev = prevNode;              // update the next node of the node to be deleted to the previous node
        }

        return head;                               // head might be unchanged or updated elsewhere (like if the first node was deleted) => but this code snippet assumes that handling is outside this block
    }

    public static void printList(Node12 head) 
    {
        Node12 curr = head;

        while (curr != null) 
        {
            System.out.print(curr.data);

            if (curr.next != null) 
            {
                System.out.print(" <--> ");     // default method for printing double linked lists
            }
            
            curr = curr.next;
        }

        System.out.println();
    }
    public static void main(String[] args)
    {
        DeleteDoubleLinkedList sol = new DeleteDoubleLinkedList();

        // Create doubly linked list: 1 <--> 5 <--> 2 <--> 9

        Node12 head  = new Node12(1);
        Node12 node2 = new Node12(5);
        Node12 node3 = new Node12(2);
        Node12 node4 = new Node12(9);

        head.next = node2;
        node2.prev = head;

        node2.next = node3;
        node3.prev = node2;

        node3.next = node4;
        node4.prev = node3;

        System.out.print("Original List: ");
        printList(head);

        head = sol.deleteNode(head, 1);
        System.out.print("After deleting position 1: ");
        printList(head);

        head = sol.deleteNode(head, 3);
        System.out.print("After deleting position 3: ");
        printList(head);
    }
}
