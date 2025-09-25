import java.util.ArrayList;
import java.util.Stack;

class StockSpan 
{
    public ArrayList<Integer> calculateSpan(int[] arr) 
    {
        ArrayList<Integer> span = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) 
        {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i])   // as long as stack is empty and The price at the top 
                                                                // index is <= current price => pop it => it cannot block the span anymore.


            {
                st.pop();
            }

            if (st.isEmpty()) 
            {
                span.add(i + 1);                                // If stack empty => no greater price before =>
                                                                // span is all days up to i => i + 1
            } 
            else 
            {
                span.add(i - st.peek());                        // If stack has index => top of stack’s index is the 
                                                                // last day with price > arr[i] => so span is i - st.peek().

            }

            st.push(i);                                         // Push current day’s index for future days to use.
        }
        return span;                                            // arr[] = [100, 80, 60, 70, 60, 75, 85]
                                                                // (i=0) => arr[i] = 100 => Stack Before = []           => Pop = -            => Stack After Pops = []        => Span = 1 => Stack After Push = [0]
                                                                // (i=1) => arr[i] = 80  => Stack Before = [0]          => Pop = NO           => Stack After Pops = [0]       => Span = 1 => Stack After Push = [0, 1]
                                                                // (i=2) => arr[i] = 60  => Stack Before = [0, 1]       => Pop = NO           => Stack After Pops = [0, 1]    => Span = 1 => Stack After Push = [0, 1, 2]
                                                                // (i=3) => arr[i] = 70  => Stack Before = [0, 1, 2]    => Pop = pop 2        => Stack After Pops = [0, 1]    => Span = 2 => Stack After Push = [0, 1, 3]
                                                                // (i=4) => arr[i] = 60  => Stack Before = [0, 1, 3]    => Pop = NO           => Stack After Pops = [0, 1, 3] => Span = 1 => Stack After Push = [0, 1, 3, 4]
                                                                // (i=5) => arr[i] = 75  => Stack Before = [0, 1, 3, 4] => Pop = pop 4, pop 3 => Stack After Pops = [0, 1]    => Span = 4 => Stack After Push = [0, 1, 5]
                                                                // (i=6) => arr[i] = 80  => Stack Before = [0, 1, 3, 5] => Pop = pop 5, pop 1 => Stack After Pops = [0]       => Span = 6 => Stack After Push = [0, 6]
                                                                // Final span: [1, 1, 1, 2, 1, 4, 6]
    }
    public static void main(String[] args) 
    {
        StockSpan obj = new StockSpan();

        int[] arr1 = {100, 80, 60, 70, 60, 75, 85};
        System.out.println(obj.calculateSpan(arr1));  

        int[] arr2 = {10, 4, 5, 90, 120, 80};
        System.out.println(obj.calculateSpan(arr2));
    }
}
