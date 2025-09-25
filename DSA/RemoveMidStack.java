import java.util.Stack;

public class RemoveMidStack 
{
    public static void deleteMid(Stack<Integer> s)
    {
        int n = s.size();

        if (n == 0)
        {
            return;
        }

        int mid = (n + 1) / 2;

        int removeCount = n - mid;

        Stack<Integer> temp = new Stack<>();

        for (int i = 0; i < removeCount; i++)         // remove top elements until middle is at the top
        {
            temp.push(s.pop());                       // store the removed elements into the temp stack
        }

        s.pop();                                      // remove the middle element from the stack

        while (!temp.isEmpty()) 
        {
            s.push(temp.pop());                       // push back the popped element from stack s that are present 
                                                      // in the temp stack
        }
    }
    public static void main(String[] args) 
    {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println("Original Stack (top to bottom): " + s);

        deleteMid(s);

        System.out.println("After deleting mid (top to bottom): " + s);
    }
}