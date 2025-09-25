class SLLCircularNode{

    int data;
    SLLCircularNode next;

    SLLCircularNode(int data)
    {
        this.data = data;
        next = null;
    }
}

public class CheckForCircularList 
{
    boolean isCircular (SLLCircularNode head)                       // 1 -> 2 -> 3 -> 1
    {
        if (head == null)
        {
            return false;
        }

        SLLCircularNode curr = head.next;                           // curr = 2

        while (curr != null && curr != head)                        // curr = 2 != null  |  curr = 3 != null  |  curr = 1 != null
        {                                                           // curr != 1         |  curr != 1         |  curr == 1
            curr = curr.next;                                       // curr = 3          |  curr = 1
        }

        return curr == head;                                        // returns true
    }    
    public static void main(String[] args) 
    {

        CheckForCircularList sol = new CheckForCircularList();

        SLLCircularNode head1 = new SLLCircularNode(1);
        head1.next = new SLLCircularNode(2);
        head1.next.next = new SLLCircularNode(3);
        head1.next.next.next = head1;

        System.out.println(sol.isCircular(head1));

        SLLCircularNode head2 = new SLLCircularNode(1);
        head2.next = new SLLCircularNode(2);
        head2.next.next = new SLLCircularNode(3);

        System.out.println(sol.isCircular(head2));
    }
}
