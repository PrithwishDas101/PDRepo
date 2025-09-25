import java.util.*;

public class IsomorphicStrings 
{
    public static boolean isIsomorphic(String s1, String s2) 
    {
        if (s1.length() != s2.length()) 
        {
            return false;                   // basic thingy 
        }

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {

            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (map1.containsKey(c1) && map1.get(c1) != c2)  // if already mapped this c1 before
                                                             // but now it’s trying to map to a different c2
                                                             // inconsistent mapping => false
                                                             // s1 = "ab" => s2 = "xy" works (a→x, b→y)
                                                             // but if later we see a→z => fail.
            {
                return false;
            }

            if (map2.containsKey(c2) && map2.get(c2) != c1) // if already mapped this c2 before,
                                                            // but now it’s trying to map to a different c1
                                                            // another inconsistency => false
                                                            // s1 = "ab", s2 = "xx" fails because both a and b want to map to the same x
            {
                return false;
            }

            map1.put(c1, c2);                               // mapping exists => add the character
            map2.put(c2, c1);                               // mapping exists => add the character
        }

        return true;
    }

    public static void main(String[] args) 
    {
        String s1 = "aab", s2 = "xxy";
        System.out.println(isIsomorphic(s1, s2));

        s1 = "aab"; s2 = "xyz";
        System.out.println(isIsomorphic(s1, s2));

        s1 = "abc"; s2 = "xxz";
        System.out.println(isIsomorphic(s1, s2));
    }
}
