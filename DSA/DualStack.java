class DualStack 
{
    int size = 100;                // max size for now
    int[] arr = new int[size];     // will store elements for both stacks
    int top1 = -1;                 // starts at -1 meaning Stack 1 is empty
    int top2 = size;               // starts at size meaning Stack 2 is empty and grows from the end of the array backward

    DualStack() 
    {
        // nothing here as per gfg
    }

    void push1(int x)              // method to push x into Stack 1
    {
        if (top1 + 1 < top2)       // checks for space => Stack1’s next position doesn’t collide with Stack2
        {
            arr[++top1] = x;       // top1 is shifted to the next index and x is stored in that index
        }
    }

    void push2(int x)              // method to push x into Stack 2
    {
        if (top1 + 1 < top2)       // checks for space again
        {
            arr[--top2] = x;       // top2 is shifted to the previous index and x is stored in that index
        }
    }

    int pop1()                     // pops the top element from Stack 1
    {
        if (top1 >= 0)             // checks if Stack 1 has elements
        {
            return arr[top1--];    // return the top element and decrease top1 by 1
        }
        return -1;                 // empty => return -1
    }

    int pop2()                     // pops the top element from Stack 2
    {
        if (top2 < size)           // checks if Stack 2 has elements
        {
            return arr[top2++];    // return the top element and increase top2 by 1
        }
        return -1;                 // empty => return -1
    }
    public static void main(String[] args) 
    {
        DualStack ts = new DualStack();

        ts.push1(2);
        ts.push1(3);
        ts.push2(4);
        ts.push1(4);
        ts.push1(6);
        ts.push2(7);
        ts.push1(8);
        ts.push1(9);
        ts.push2(10);
        ts.push1(11);
        ts.push1(13);
        ts.push2(24);
        ts.push1(32);
        ts.push1(43);
        ts.push2(54);

        System.out.println(ts.pop1());  
        System.out.println(ts.pop2());  
        System.out.println(ts.pop2());  
        System.out.println(ts.pop1());  
        System.out.println(ts.pop1());  
        System.out.println(ts.pop1());  
        System.out.println(ts.pop2());  
        System.out.println(ts.pop2());  
        System.out.println(ts.pop1());  
        System.out.println(ts.pop1());  
        System.out.println(ts.pop1());  
        System.out.println(ts.pop2());  
        System.out.println(ts.pop2());  
        System.out.println(ts.pop1());  
        System.out.println(ts.pop1());  
        System.out.println(ts.pop1());  
        System.out.println(ts.pop1());  
    }
}
