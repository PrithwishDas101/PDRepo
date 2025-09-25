class SLLMiddleNode 
{
    int data;
    SLLMiddleNode next;
    
    SLLMiddleNode(int node)  
    { 
        data = node;  
        next = null; 
    }
}

class MiddleNode 
{
    int getMiddle(SLLMiddleNode head)                       // 1 => 2 => 3 => 4 => 5 => 6
    {
        if (head == null) 
        {
            return -1;  
        }

        SLLMiddleNode slow = head;                          // slow = 1
        SLLMiddleNode fast = head;                          // fast = 1

        while (fast != null && fast.next != null) 
        {
            slow = slow.next;                       // slow = 1
            fast = fast.next.next;                  // fast = 2
                                                    // slow = 2
                                                    // fast = 4
                                                    // slow = 3
                                                    // fast = 6
                                                    // slow = 4
                                                    // fast = null
        }

        return slow.data;                           // returns 4
    }
}
