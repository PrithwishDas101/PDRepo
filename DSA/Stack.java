class Stack 
{
    private int[] arr;
    private int top;

    public Stack() 
    {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) 
    {
        if (top < arr.length - 1)  // Make sure we don't overflow
        {  
            top++;
            arr[top] = x;
        }
    }

    public int pop() 
    {
        if (top >= 0) 
        {
            int pop = arr[top];
            top--;
            return pop;
        } 
        else 
        {
            return -1;  // Stack is empty
        }
    }
}