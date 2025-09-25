import java.util.*;

class KLargestElements 
{
    public ArrayList<Integer> kLargest(int[] arr, int k)         // finds the k largest elements in descending order
    {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();  // minHeap trick => smallest element is always at the head (By default)
                                                                 // arr = [12, 5, 787, 1, 23], k = 2
        for (int num : arr)                                      // add 12  => heap: [12]
                                                                 // add 5   => heap: [5, 12]
                                                                 // add 787 => heap: [5, 12, 787]  => size = 3 → poll smallest => [12, 787]
                                                                 // add 1   => heap: [1, 12, 787]  => size = 3 → poll smallest => [12, 787]
                                                                 // add 23  => heap: [12, 23, 787] => size = 3 → poll smallest => [23, 787]
        {
            minHeap.add(num);                                    // add each number to the min-heap
            if (minHeap.size() > k)                              // when heap grows larger than k =>
            {
                minHeap.poll();                                  // remove the smallest element => k largest elements remain in the heap at the end
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        while (!minHeap.isEmpty())                               
        {
            result.add(minHeap.poll());                          // Takes out the k largest elements from the heap => these come out in ascending order
                                                                 // result => [23, 787]
        }

        result.sort(Collections.reverseOrder());                 // sorting in descending order => need the output in decreasing order
        return result;                                           // result => [787, 23]
    }
    public static void main(String[] args) 
    {
        KLargestElements obj = new KLargestElements();

        int[] arr1 = {12, 5, 787, 1, 23};
        System.out.println(obj.kLargest(arr1, 2));

        int[] arr2 = {1, 23, 12, 9, 30, 2, 50};
        System.out.println(obj.kLargest(arr2, 3));

        int[] arr3 = {12, 23};
        System.out.println(obj.kLargest(arr3, 1));
    }
}
