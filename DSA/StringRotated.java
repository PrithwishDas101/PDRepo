class StringRotated 
{
    public static boolean areRotations(String s1, String s2) 
    {
        if (s1.length() != s2.length()) // s1 = "abcd" s2 = "cdab"
        {
            return false;
        }
        String temp = s1 + s1;          // temp = abcdabcd
        return kmpSearch(temp, s2);
    }

    private static boolean kmpSearch(String text, String pattern) 
    {
        int n = text.length();          // text    = "abcdabcd" => n = 8
        int m = pattern.length();       // pattern = "cdab"     => m = 4
 
        int lps[] = buildLPS(pattern);  // "cdab" for i=1 'd'VS'c' => no match for i=2 'a'VS'c => no match for i=3 'b'VS'c => no match
                                        // lps = [0, 0, 0, 0]

        int i = 0, j = 0;

        while (i < n) 
        {
            if (text.charAt(i) == pattern.charAt(j)) // i=0, j=0 => text[0] = a vs pattern[0] = c
                                                     // i=1, j=0 => text[1] = b vs pattern[0] = c
                                                     // i=2, j=0 => text[2] = c vs pattern[0] = c 
                                                     // => i++ j++ => i=3, j=1 => text[3] = d vs pattern[1] = d
                                                     // => i++ j++ => i=4, j=2 => text[4] = a vs pattern[2] = a
                                                     // => i++ j++ => i=5, j=3 => text[5] = b vs pattern[3] = b
                                                     // => i++ j++ => i=6, j=4
            {
                i++;
                j++;
                if (j == m)                          // j == m == 4
                {
                    return true;                     
                }             
            } 
            else                                    // for any mismatch                      
           {
                if (j > 0) 
                {
                    j = lps[j - 1];
                } 
                else 
                {
                    i++;
                }
            }
        }

        return false;
    }

    private static int[] buildLPS(String pattern) 
    {
        int m = pattern.length();
        int[] lps = new int[m];
        int len = 0;
        int i = 1;

        while (i < m)                                     // i = 1 => lps = [0, 0, 0, 0, 0, 0, 0, 0, 0]
        {
            if (pattern.charAt(i) == pattern.charAt(len)) // i=1 b vs a => else
                                                          // i=2 a vs a => lps = [0, 0, 1, 0, 0, 0, 0, 0, 0]
                                                          // i=3 b vs b => lps = [0, 0, 1, 2, 0, 0, 0, 0, 0]
                                                          // i=4 c vs a => else
                                                          // i=4 c vs a => else
                                                          // i=5 a vs a => lps = [0, 0, 1, 2, 0, 1, 0, 0, 0]
                                                          // i=6 b vs b => lps = [0, 0, 1, 2, 0, 1, 2, 0, 0]
                                                          // i=7 a vs a => lps = [0, 0, 1, 2, 0, 1, 2, 3, 0]
                                                          // i=8 b vs b => lps = [0, 0, 1, 2, 0, 1, 2, 3, 4]
            {
                len++;
                lps[i] = len;
                i++;
            } 
            else 
            {
                if (len > 0) 
                {
                    len = lps[len - 1];
                } 
                else 
                {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    public static void main(String[] args) 
    {
        System.out.println(areRotations("abcd", "cdab")); // true
    }
}
