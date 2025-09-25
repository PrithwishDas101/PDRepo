import java.util.*;

class FindMajority 
{
    public ArrayList<Integer> findMajority(int[] arr)   // arr = [2, 2, 3, 1, 3, 2, 1, 1]
    {
        int n = arr.length;

        int candidate1 = 0, candidate2 = 0;             // Boyer-Moore idea => Keep 2 candidates & counts
        int count1 = 0, count2 = 0;                     // Cancel out counts when different numbers appear
                                                        // Initially => candidate1 = 0, count1 = 0 => candidate2 = 0, count2 = 0

        for (int num : arr) 
        {
            if (num == candidate1)                      // If num matches a candidate, increment its count
            {
                count1++;
            } 
            else if (num == candidate2)                 // If num matches a candidate, increment its count
            {
                count2++;
            } 
            else if (count1 == 0)                       // If not and we have a free slot, set it
            {
                candidate1 = num;
                count1 = 1;
            } 
            else if (count2 == 0)                       // If not and we have a free slot, set it
            {
                candidate2 = num;
                count2 = 1;
            } 
            else                                        // If both slots are full and num matches neither, decrease both counts
            {
                count1--;
                count2--;
            }                                           // num = 2 => count1 = 0 => candidate1 = 2, count1 = 1
                                                        // num = 2 => matches candidate1 => count1 = 2
                                                        // num = 3 => count2 = 0 => so candidate2 = 3, count2 = 1
                                                        // num = 1 doesn’t match candidate1 (2) or candidate2 (3) => both counts > 0 => decrement both => count1 = 1 => count2 = 0
                                                        // num = 3 matches candidate2 => count2 = 1
                                                        // num = 2 matches candidate1 => count1 = 2
                                                        // num = 1 doesn’t match candidate1 (2) or candidate2 (3) => both counts > 0 => decrement both => count1 = 1 => count2 = 0
                                                        // num = 1 => count2 = 0 ➜ candidate2 = 1 ➜ count2 = 1
                                                        // candidate1 = 2 and candidate2 = 1
        }

        count1 = 0;
        count2 = 0;

        for (int num : arr)                             // Counts could be off. So we reset and recoun
        {
            if (num == candidate1) 
            {
                count1++;
            }
            else if (num == candidate2) 
            {
                count2++;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        if (count1 > n / 3)                             // Only add a candidate if it really appears more than n/3
        {                                               // n/3 = 2 ➜ floor(8/3) => both are valid ➜ result: [1, 2]


            result.add(candidate1);
        }
        if (count2 > n / 3 && candidate2 != candidate1) 
        {
            result.add(candidate2);
        }

        Collections.sort(result);                    // Sort and return

        return result;                               // returns [1, 2]
    }

    public static void main(String[] args){
        FindMajority obj = new FindMajority();

        int[] arr1 = {2, 2, 3, 1, 3, 2, 1, 1};
        System.out.println(obj.findMajority(arr1));

        int[] arr2 = {-5, 3, -5};
        System.out.println(obj.findMajority(arr2));

        int[] arr3 = {3, 2, 2, 4, 1, 4};
        System.out.println(obj.findMajority(arr3));
    }
}
