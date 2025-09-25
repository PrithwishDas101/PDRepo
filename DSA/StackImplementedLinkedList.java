class StackNode 
{
    int data;
    StackNode next;

    StackNode(int data) 
    {
        this.data = data;
        next = null;
    }
}

class StackImplementedLinkedList 
{
    StackNode top;                             // top of stack

    void push(int data) 
    {
        StackNode newNode = new StackNode(data);
        newNode.next = top;                    // link new node to the previous top
        top = newNode;                         // move top to new node
    }

    int pop() 
    {
        if (top == null)                       // empty stack
        { 
            return -1;
        }

        int poppedValue = top.data;
        top = top.next;                        // move top to next node

        return poppedValue;
    }

    void printStack() 
    {
        StackNode curr = top;
        System.out.print("Stack: ");

        while (curr != null) 
        {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        
        System.out.println();
    }

    // MAIN for testing
    public static void main(String[] args) 
    {
        StackImplementedLinkedList stack = new StackImplementedLinkedList();

        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());

        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
