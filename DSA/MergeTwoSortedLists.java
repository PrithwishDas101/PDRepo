class ListNode 
{
    int val;
    ListNode next;

    ListNode(int val) 
    { 
        this.val = val; 
    }

    ListNode(int val, ListNode next) 
    { 
        this.val = val; 
        this.next = next; 
    }
}

class MergeTwoSortedLists 
{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) 
        {
            if (list1.val <= list2.val) 
            {
                current.next = list1;
                list1 = list1.next;
            } 

            else 
            {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        if (list1 != null) 
        {
            current.next = list1;
        }
        
        if (list2 != null) 
        {
            current.next = list2;
        }

        return dummy.next;
    }

    public void printList(ListNode head) 
    {
        ListNode temp = head;
        while (temp != null) 
        {
            System.out.print(temp.val);

            if (temp.next != null) 
            {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) 
    {
        // List 1: 1 -> 2 -> 4
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));

        // List 2: 1 -> 3 -> 4
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        MergeTwoSortedLists obj = new MergeTwoSortedLists();
        ListNode merged = obj.mergeTwoLists(l1, l2);

        System.out.print("Merged list: ");
        obj.printList(merged);
    }
}
