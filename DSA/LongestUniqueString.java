import java.util.HashMap;

class LongestUniqueString 
{
    public static int longestUniqueSubsttr(String s)        // s="geeksforgeeks"
    {
        HashMap<Character, Integer> map = new HashMap<>();  // key = each character => value = its latest index 
        int left = 0;                                       // start of sliding window => 
        int maxLen = 0;                                     // longest window found so far

        for (int right = 0; right < s.length(); right++)    // right pointer expands window by adding 1 char each loop
        {
            char ch = s.charAt(right);

            if (map.containsKey(ch))                        // duplicate found => jump left to 1 past the last index of that char
            {
                left = Math.max(left, map.get(ch) + 1);     // Math.max(left, ...) keeps left from going backward
            }

            map.put(ch, right);                             // updating that char’s index to right

            maxLen = Math.max(maxLen, right - left + 1);    // updating  maxLen to be the largest window so far
        }                                                   // right	char	map-updates	                                left	maxLen	Window (s[left..right])
                                                            // 0	     g	      g => 0	                                 0	      1	         "g"
                                                            // 1	     e	      e => 1	                                 0	      2	         "ge"
                                                            // 2	     e	      seen => left = max(0, 1+1) = 2	         2	      2	         "e" 
                                                            //                    e => 2			
                                                            // 3	     k	      k => 3	                                 2	      2          "ek"
                                                            // 4	     s	      s => 4                                     2	      3	         "eks"
                                                            // 5	     f	      f => 5	                                 2    	  4	         "eksf"
                                                            // 6	     o	      o => 6	                                 2	      5	         "eksfo"
                                                            // 7	     r	      r => 7                                     2	      6	         "eksfor"
                                                            // 8	     g	      seen g at 0 => left = 2	                 2	      7	         "eksforg" => is returned
                                                            // 9	     e	      seen e at 2 => left = max(2, 2+1) =3	     3	      7	         "ksforge"
                                                            // 10	     e	      seen e at 9 => left = max(3, 9+1) =10	     10	      7	         "e"
                                                            // 11	     k	      seen k at 3 => left = max(10, 3+1) =10	 10	      7	         "ek"
                                                            // 12	     s	      seen s at 4 => left = max(10, 4+1) =10	 10	      7	         "eks"

        return maxLen;                                      // returns 7
    }

    public static void main(String[] args) 
    {
        System.out.println(longestUniqueSubsttr("geeksforgeeks"));
        System.out.println(longestUniqueSubsttr("aaa"));
        System.out.println(longestUniqueSubsttr("abcdefabcbb"));
    }
}
