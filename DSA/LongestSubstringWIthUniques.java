import java.util.HashMap;

class LongestSubstringWIthUniques 
{
    public int longestKSubstr(String s, int k)                   // s = "aabacbebebe" => k = 3
    {
        int n = s.length();                                      // Get the length of the input string n = 11
        int left = 0, right = 0;                                 // left and right are window pointers
        int maxLen = -1;                                         // answer starts as -1 => not found yet
        HashMap<Character, Integer> map = new HashMap<>();

        while (right < n)                                        // Expand the window by moving right forward
        {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1); // Increment the count for the current characte

            while (map.size() > k)                               // If there are more than k unique chars
            {
                char leftChar = s.charAt(left);                  // Decrease the count of s[left]
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0)                      // If its count hits zero, remove it
                {
                    map.remove(leftChar);
                }
                left++;                                           // Slide left forward to shrink the window
            }

            if (map.size() == k) 
            {
                maxLen = Math.max(maxLen, right - left + 1);      // Calculate its length => Keep the maximum
            }

            right++;                                              // Try to add the next char by expanding the search
        }

        return maxLen;                                            // 1.     a       => map(a:1)             => size=1 => size<k => maxLen = -1
                                                                  // 2.     aa      => map(a:2)             => size=1 => size<k => maxLen = -1
                                                                  // 3.     aab     => map(a:2,b:1)         => size=2 => size<k => maxLen = -1
                                                                  // 4.     aaba    => map(a:3,b:1)         => size=2 => size<k => maxLen = -1
                                                                  // 5.     aabac   => map(a:3,b:1,c:1)     => size=3 => size=k => maxLen =  5
                                                                  // 6.     aabacb	=> map(a:3,b:2,c:1)	    => size=3 => size=k	=> maxLen =  6
                                                                  // 7	    aabacbe	=> map(a:3,b:2,c:1,e:1)	=> size=4 => size>k => shrink	
                                                                  // shrink	abacbe	=> map(a:2,b:2,c:1,e:1)	=> size=4 		
                                                                  // shrink	bacbe	=> map(a:1,b:2,c:1,e:1)	=> size=4	
                                                                  // shrink	acbe	=> map(a:1,b:2,c:1,e:1)	=> size=4		
                                                                  // 8.	    cbeb	=> map(c:1,b:3,e:1)	    => size=3 => size=k => maxLen =  4
                                                                  // 9.	    cbebe	=> map(c:1,b:3,e:2)	    => size=3 => size=k	=> maxLen =  5
                                                                  // 10.	cbebeb	=> map(c:1,b:4,e:2)	    => size=3 => size=k	=> maxLen =  6
                                                                  // 11.	cbebebe	=> map(c:1,b:4,e:3)	    => size=3 => size=k	=> maxLen =  7
                                                                  // returns 7
    }

    public static void main(String[] args) {
        LongestSubstringWIthUniques obj = new LongestSubstringWIthUniques();

        System.out.println(obj.longestKSubstr("aabacbebebe", 3));
        System.out.println(obj.longestKSubstr("aaaa", 2));
        System.out.println(obj.longestKSubstr("aabaaab", 2));
    }
}
