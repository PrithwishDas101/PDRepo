import java.util.*;

class FirstNegativeInWindow 
{
    static List<Integer> firstNegInt(int arr[], int k)    // returns the 1st negative in each window of size k           
    {
        List<Integer> result = new ArrayList<>();         // holds the final output
        Deque<Integer> dq   = new ArrayDeque<>();         // Double-ended queue to keep indices of negative numbers only
                                                          // indices => checks if a negative number has gone out of window

        int n = arr.length;
        int i = 0, j = 0;                                 // i = window start, j = window end => slider stuff

        while (j < n) 
        {
            if (arr[j] < 0) 
            {
                dq.addLast(j);                            // if current element is negative =>  add to the dequeue
            }                                             // front of deque always gives you the first negative in window   

            if (j - i + 1 < k)                            // expand the window until it reaches size k
            {
                j++;
            } 
            else if (j - i + 1 == k)                      // when the window is exactly k wide
            {
                if (!dq.isEmpty()) 
                {
                    result.add(arr[dq.peekFirst()]);      // dequeue not empty => front has first negative’s index => add the element to result
                } 
                else 
                {
                    result.add(0);                       // If empty => no negative => add 0
                }

                if (!dq.isEmpty() && dq.peekFirst() == i)  // the index at front is the window’s start (i) => it’s exiting => remove it
                {
                    dq.pollFirst();
                }

                i++;                                       // Slide window ahead by 1: move both i and j
                j++;
            }
        }
        return result;                                    // arr = [-8, 2, 3, -6, 10], k = 2
                                                          // window => [-8, 2]  => (i=0,j=1) => dq = [0] => result => -8
                                                          // window => [2, 3]   => (i=1,j=2) => dq = []	 => result =>  0
                                                          // window => [3, -6]  => (i=2,j=3) => dq = [3] => result => -6
                                                          // window => [-6, 10] => (i=3,j=4) => dq = [3] => result => -6
                                                          // returns [-8, 0, -6, -6]
    }
    public static void main(String[] args) 
    {
        int[] arr1 = {-8, 2, 3, -6, 10};
        int k1 = 2;
        System.out.println(firstNegInt(arr1, k1));

        int[] arr2 = {12, -1, -7, 8, -15, 30, 16, 28};
        int k2 = 3;
        System.out.println(firstNegInt(arr2, k2));

        int[] arr3 = {12, 1, 3, 5};
        int k3 = 3;
        System.out.println(firstNegInt(arr3, k3));
    }
}
