class IndexOfFirstOccuringString 
{
    public int strStr(String haystack, String needle) // haystack = "geeksforgeeks" and needle = "geek"
    {
        if (needle.isEmpty())       // nothing to look for
        {
            return 0;  
        }

        int n = haystack.length();                    // n = 12
        int m = needle.length();                      // m = 4
        
        for (int i = 0; i <= n - m; i++)              // iteration starts at 0 and ends in 12-4 = 8 to prevent out of bound
        {                                             // (at i=9) => haystack = eks and runs out of bounds so
            if (haystack.substring(i, i + m).equals(needle)) // haystack.substring(0, 4) => first 4 letters to match the needle 
                                                             // and so on till the last 4 letters to match needle as needle 
                                                             // has only 4 letters                                
            {                                                // (i=0) haystack = geek equals geek
                return i;                                    // returns 0
            }
        }
        
        return -1;                                          // if needle is not found not found
    }

    public static void main(String[] args) 
    {
        IndexOfFirstOccuringString sol = new IndexOfFirstOccuringString();
        
        System.out.println(sol.strStr("sadbutsad", "sad"));
        System.out.println(sol.strStr("leetcode", "leeto"));
        System.out.println(sol.strStr("a", "a"));
        System.out.println(sol.strStr("abc", "c"));
        System.out.println(sol.strStr("abc", "d"));
    }
}
