import java.util.*;

public class DistinctIntersection 
{
    static int intersectSize(int a[], int b[])
    {
        Set<Integer> setA = new HashSet<>();

        for (int num : a)                      // for every int num in array a
        {
            setA.add(num);                     // stores all the elements in Array a
        }
        
        int count = 0;

        for (int num : b)                      // for every int num in array b
        {
            if (setA.contains(num))            // if setA containg elements from array a contains any element from array b
            {
                count ++;                      // count of disctinct intersected elements increases
                setA.remove(num);              // removing the element from setA to prevent repetition
            }
        }

        return count;
    }    
    public static void main(String[] args) 
    {

        int[] a = {89, 24, 75, 11, 23};
        int[] b = {89, 2, 4};

        System.out.println(intersectSize(a, b));

        int[] a2 = {1, 2, 4, 3, 5, 6};
        int[] b2 = {3, 4, 5, 6, 7};

        System.out.println(intersectSize(a2, b2));

        int[] a3 = {20, 10, 30, 50, 40};
        int[] b3 = {15, 25, 30, 20, 35};

        System.out.println(intersectSize(a3, b3));
    }
}
