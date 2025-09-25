import java.util.HashMap;

class SubStringCount  
{
    public static int substrCount(String s, int k)                  // s = "aba", k = 2       
    {
        return atMostK(s, k) - atMostK(s, k - 1);                   // xxactly K distinct = at most K – at most K-1
                                                                    // atMostK("aba", 2) - atMostK("aba", 1)
    }

    private static int atMostK(String s, int k) 
    {
        int left   = 0;                                             // window start
        int  right = 0;                                             // window end
        int  count = 0;                                             // total substrings counted
        HashMap<Character, Integer> freq = new HashMap<>();         // key = each character => value = its count 

        while (right < s.length())                                  // sliding right across the string
        {
            char r = s.charAt(right);
            freq.put(r, freq.getOrDefault(r, 0) + 1);

            while (freq.size() > k)                                 // if unique chars exceed k => shrink window from left
            {
                char l = s.charAt(left);
                freq.put(l, freq.get(l) - 1);                       

                if (freq.get(l) == 0) 
                {
                    freq.remove(l);
                }

                left++;
            }

            count += right - left + 1;                              // s => s[left..right], s[left+1..right], ..., s[right..right]
            right++;                                                // expand window right
        }

        return count;
    }

    public static void main(String[] args) 
    {
        System.out.println(substrCount("abc", 2));
        System.out.println(substrCount("aba", 2));
        System.out.println(substrCount("aa", 1));
    }
}
