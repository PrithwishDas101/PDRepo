public class LongestCommonString 
{
    public static String longestCommonString (String[] strs)
    {
        if (strs == null || strs.length == 0)
        {
            return "Nothing breh";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++)
        {
            while (strs[i].indexOf(prefix) != 0) 
            {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                {
                    return "Nothing breh";
                }
            }
        }
        
        return prefix;
    }
    public static void main(String[] args) 
    {
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix String = " + longestCommonString(strs1)); // Output: "fl"

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Longest Common Prefix String = " + longestCommonString(strs2)); // Output: ""
    }
}
