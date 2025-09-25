class MultiplyStrings 
{
    public String multiplyStrings(String s1, String s2)             // s1 = "11" s2 = "23"
    {
        boolean negative = false;                                   // Keeps track if the result should be negative.
        if (s1.charAt(0) == '-') 
        {
            negative = !negative;                                   // boolean negative = true => -- = + => - = -
            s1 = s1.substring(1);
        }
        if (s2.charAt(0) == '-') 
        {
            negative = !negative;                                   // boolean negative = true => -- = + => - = -
            s2 = s2.substring(1);
        }

        s1 = stripLeadingZeros(s1); s2 = stripLeadingZeros(s2);     // easily strip leading zeros

        // Zero check *after* stripping
        if (s1.equals("0") ||                              // After stripping => if either = "0" => result = "0".
            s2.equals("0")) 
            {
                return "0";
            }  

        int n = s1.length();                                        // n = 2
        int m = s2.length();                                        // m = 2
        int[] result = new int[n + m];                              // handles max possible digits.
                                                                    // size 4 => [0,0,0,0]

        for (int i = n - 1; i >= 0; i--)                            // starting from the end
        {
            int d1 = s1.charAt(i) - '0';                            // java//c++ thing
            for (int j = m - 1; j >= 0; j--)                        // starting from the end
            {
                int d2 = s2.charAt(j) - '0';                        // java//c++ thing
                int sum = d1 * d2 + result[i + j + 1];              // i + j + 1 => where in result[] this product lands
                                                                    //  => 10's or 1's or 100's...place
                                                                    // 1*3 = 3 => result[3] += 3 => result[3] = 3
                                                                    // 1*2 = 2 => result[2] += 2 => result[2] = 2
                                                                    // 1*2 = 2 => result[1] += 2 => result[1] = 2
                result[i + j + 1] = sum % 10;                       // sum % 10 gives you the ones digit
                                                                    // 1*3 = 3 + result[2] = 2 => sum = 5
                result[i + j] += sum / 10;                          // sum / 10 gives you the carry => add that carry to the left neighbor result[i + j]
                                                                    // result[2] = 5%10 = 5 => carry = 0
                                                                    // result = [0,2,5,3]
                                                                    // Result => "253"

            }
        }

        StringBuilder sb = new StringBuilder();                     // for converting result[] to string
        int i = 0;
        while (i < result.length && result[i] == 0)                 // Skip leading zeros.
        {
            i++;
        }
        while (i < result.length) 
        {
            sb.append(result[i++]);                                // append digits as string
        }

        if (negative) 
        {
            sb.insert(0, '-');                            // insert (-ve) sign is value is negative
        }

        return sb.toString();                                      // converts result[] => string
    }

    private String stripLeadingZeros(String s) 
    {
        int i = 0;
        while (i < s.length() && s.charAt(i) == '0')                    
        {
            i++;
        }
        return i == s.length() ? "0" : s.substring(i);            // Removes all leading zeros => If all are zeros => return "0"
    }

    public static void main(String[] args) 
    {
        MultiplyStrings ms = new MultiplyStrings();

        System.out.println(ms.multiplyStrings("0033", "2"));   
        System.out.println(ms.multiplyStrings("11", "23"));    
        System.out.println(ms.multiplyStrings("123", "0"));    
        System.out.println(ms.multiplyStrings("-33", "00000"));
        System.out.println(ms.multiplyStrings("-11", "23"));   
        System.out.println(ms.multiplyStrings("-11", "-23"));  
    }
}
