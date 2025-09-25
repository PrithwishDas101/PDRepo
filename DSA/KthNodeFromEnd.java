class Node1
{
    int data;
    Node1 next;
    Node1(int d) 
    {
        data = d; next = null; 
    }
} 

class KthNodeFromEnd 
{

    int getKthFromLast(Node1 head, int k)                // 1 → 2 → 3 → 4 → 5 → 6 → 7 → 8 → 9 => k =2
    {
        Node1 first = head;                              // first  = 1
        Node1 second = head;                             // second = 1

        for (int i = 0; i < k; i++) 
        {
            if (first == null) 
            {
                return -1;                               // k is greater than length
            }

            first = first.next;                          // first = 2
                                                         // first = 3
        }

        while (first != null) 
        {
            first = first.next;                           // first  = 4
            second = second.next;                         // second = 2
                                                          // first  = 5
                                                          // second = 3
                                                          // first  = 6 
                                                          // second = 4
                                                          // first  = 7
                                                          // second = 5
                                                          // first  = 8
                                                          // second = 6
                                                          // first  = 9
                                                          // second = 7
                                                          // first  = null
                                                          // second = 8
        }                                               

        return (second != null) ? second.data : -1;       // returns 8
    }
}