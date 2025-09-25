import java.util.ArrayList;
import java.util.Arrays;

class FindPermutation 
{
    public static ArrayList<String> find_permutation(String s) 
    {
        ArrayList<String> result = new ArrayList<>();
        boolean[] used = new boolean[s.length()];
        char[] chars = s.toCharArray();
        Arrays.sort(chars);                    // chars = ['A', 'A', 'B']
        backtrack(result, new StringBuilder(), chars, used);
        return result;
    }
    private static void backtrack(ArrayList<String> result, StringBuilder current, char[] chars, boolean[] used) 
    {
        if (current.length() == chars.length) 
        {
            result.add(current.toString());    // 'ABC' char.length = 3 => current is empty "" => Add A => current = "A"
                                               // Add B => current = "AB" => Add C => current = "ABC"
            return;
        }

        for (int i = 0; i < chars.length; i++) 
        {
            if (used[i]) 
            {
                continue;                                          // skips any character already added
            } 
            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) // i > 0 => skipped => not at the very first character
                                                                   // char [i] == char [i-1] => skipped => current character is the same as the previous character
                                                                   // !used[i - 1] => skipped => previous identical character hasn't been used yet, picking this violates the order
            {
                continue;                                          // skips for if the 3 conditions are true
            }

            used[i] = true;                                        // picking the rest chars
            current.append(chars[i]);

            backtrack(result, current, chars, used);

            used[i] = false;
            current.deleteCharAt(current.length() - 1);            // deletes the last char at the current string
        }
    }
    public static void main(String[] args)
    {
    String s = "ABA";
    ArrayList<String> ans = find_permutation(s);
    System.out.println(ans);
    }
}