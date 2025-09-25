import java.util.*;

public class BalancedStrings 
{
    public static int countBalanced(String[] arr)                                       // s = {"ab", "be"}
    {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u')); // making vowels for fast lookup => vowels = {a,e,i,o,u}
        Map<Integer, Integer> balanceCount = new HashMap<>();                           // to track how often each balance has appeared so far
        balanceCount.put(0, 1);                                               // balanceCount = {0:1}

        int count = 0;
        int balance = 0;                                                                //  running difference => +1 = vowel, -1 = consonant

        for (String word : arr)                                                         // for each String in the array
        {
            for (char c : word.toCharArray())                                           // each char in "ab"
            {
                if (vowels.contains(c))                                                 // c = 'a' => vowel     => balance++ => balance = 1
                                                                                        // c = 'e' => vowel     => balance++ => balance = 0
                {
                    balance++;
                } 
                else                                                                    // c = 'b' => consonant => balance-- => balance = 0
                                                                                        // c = 'b' => consonant => balance-- => balance = -1
                {
                    balance--;
                }
            }

            count += balanceCount.getOrDefault(balance, 0);                // adding to count how many times this balance was seen before
                                                                                        // balanceCount[0] = 1
                                                                                        // count = 0 + 1 = 1
                                                                                        // balance = 0 => seen 2 times alreadu
                                                                                        // count += 2 => count = 1 + 2 = 3
            balanceCount.put(balance, balanceCount.getOrDefault(balance, 0) + 1); // updating map with this new balance
        }                                                                                      // balanceCount[0] was 1 => now 2.
                                                                                               // balanceCount = {0:2}
                                                                                               // balanceCount[0] goes from 2 => 3
                                                                                               // balanceCount = {0:3}

        return count;                                                                    // returns 3 => "ab", "ab be", "be"
    }

    public static void main(String[] args) 
    {
        String[] arr1 = {"ab", "be"};
        System.out.println(countBalanced(arr1));
    }
}
