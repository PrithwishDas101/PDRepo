class RemoveAdjDuplicates
{
    public String removeUtil(String s) 
    {
        if (s.length() <= 1) 
        {
            return s;                                            // if string is empty or has just 1 char => there can’t be any adjacent duplicates => return as is
        }
        StringBuilder result = new StringBuilder();              // will build the new string without adjacent duplicates  

        int i = 0;

        while (i < s.length()) 
        {
            int j = i;
            while (j < s.length() && s.charAt(i) == s.charAt(j))  // block of consecutive same characters starting at i and ending just before j
            {
                j++;
            }

            if (j - i == 1) 
            {
                result.append(s.charAt(i));                       // block was only 1 letter => keep it => because it’s not duplicate
            }

            i = j;                                                // move i to j => to check next block
        }
        if (result.length() == s.length()) 
        {
            return result.toString();                             // no duplicates were found in this pass => return result
        }

        return removeUtil(result.toString());                     // removed any block => we might have new adjacent duplicates => recurse again
    }
    public static void main(String[] args) 
    {
        RemoveAdjDuplicates obj = new RemoveAdjDuplicates();

        System.out.println(obj.removeUtil("geeksforgeek"));
        System.out.println(obj.removeUtil("abccbccba"));  
        System.out.println(obj.removeUtil("abcd"));
        System.out.println(obj.removeUtil("aabbccddeeff"));
        System.out.println(obj.removeUtil("aaabba"));
    }
}
