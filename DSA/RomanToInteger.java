import java.util.HashMap;

class RomanToInteger
{
    public static int romanToInt (String s)                   // s = "MCMXCIV"
    {
        HashMap<Character, Integer> map = new HashMap<>();    // maps roman letters as key and their values as values

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++)
        {
            int currentVal = map.get(s.charAt(i));          // stores value of the current key => (i=0) => currentVal = 1000 (M)
                                                            //                                    (i=1) => currentVal = 100  (C)
                                                            //                                    (i=2) => currentVal = 1000 (M)
                                                            //                                    (i=3) => currentVal = 10   (X)
                                                            //                                    (i=4) => currentVal = 100  (C)
                                                            //                                    (i=5) => currentVal = 1    (I)
                                                            //                                    (i=6) => currentVal = 5    (V)

            if (i + 1 < s.length() && currentVal < map.get(s.charAt(i + 1))) // (i + 1 => so we don't reach out of bounds)
            {                                                                // (i=0) => currentVal = 1000 < 100  => False
                total -= currentVal;                                         // total = 0 + 1000    = 1000
            }                                                                // (i=1) => currentVal = 100  < 1000 => True
                                                                             // total = 1000 - 100  = 900
            else                                                             // (i=2) => currentVal = 1000 < 10   => False
            {                                                                // total = 900 + 1000  = 1900
                total += currentVal;                                         // (i=3) => currentVal = 10   < 100  => True
            }                                                                // total = 1900 - 10   = 1890
        }                                                                    // (i=4) => currentVal = 100  < 1    => False
                                                                             // total = 1890 + 100  = 1990
                                                                             // (i=5) => currentVal = 1    < 5    => True
                                                                             // total = 1990 - 1    = 1989
                                                                             // (i=6) => currentVal = 5           => no next value
                                                                             // total = 1989 + 5    = 1994

        return total;                                                        // returns 1994
    }
    public static void main(String[] args) 
    {
        Solution sol = new Solution();

        String s1 = "III";
        String s2 = "LVIII";
        String s3 = "MCMXCIV";
        String s4 = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";

        System.out.println(s1 + " => " + romanToInt(s1));     // 3
        System.out.println(s2 + " => " + romanToInt(s2));     // 58
        System.out.println(s3 + " => " + romanToInt(s3));     // 1994
        System.out.println(s4 + " => " + romanToInt(s4));
    }
}