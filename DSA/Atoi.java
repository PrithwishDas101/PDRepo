class Atoi 
{
    public int myAtoi(String s) 
    {
        int i = 0, n = s.length();
        int sign = 1;                       // to store whether the number is (+ve or -ve)
        long result = 0;                    // numbers can be huge and lead to overflow

        while (i < n && s.charAt(i) == ' ') // step 1 is to lose whitespaces 
        {
            i++;                            // loop moves i forward to skip any spaces
                                            // for "    -123" => i will stop at '-' after skipping 4 spaces
        }

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-'))  // step 2 is to look for signs
        { 
            if (s.charAt(i) == '-')                               // for "-123"
            {
                sign = -1;                                        // sign = -1
            }
            i++;                                                  // loop moves i forward as for "+" we don't have to do anything
        }

        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') // as long as current character is a digit ('0' to '9')
        {
            int digit = s.charAt(i) - '0';                        // "-123" => 123 
            result = result * 10 + digit;                         // "-123" => "1" => result => 0*10 + 1  = 1
                                                                  //        => "2" => result => 1*10 + 2  = 12
                                                                  //        => "3" => result => 12*10 + 3 = 123          

            if (sign * result >= Integer.MAX_VALUE)               // step 4 is to check if number is greater than (2^31 – 1) => return (2^31 – 1)
            {
                return Integer.MAX_VALUE;
            }
            if (sign * result <= Integer.MIN_VALUE)               // step 4 is to check if number is less than -(2^31 – 1) => return -(2^31 – 1)
            {
                return Integer.MIN_VALUE;
            }
            i++;                                                  // moving i forward to look for more numbers in string
        }

        return (int) (sign * result);                             // returns -123 in integer form
    }
    public static void main(String[] args) 
    {
        Atoi obj = new Atoi();

        String s1 = "-123";
        String s2 = "  -";
        String s3 = " 1231231231311133";
        String s4 = "-999999999999";
        String s5 = "  -0012gfg4";

        System.out.println(obj.myAtoi(s1));  // Output: -123
        System.out.println(obj.myAtoi(s2));  // Output: 0
        System.out.println(obj.myAtoi(s3));  // Output: 2147483647
        System.out.println(obj.myAtoi(s4));  // Output: -2147483648
        System.out.println(obj.myAtoi(s5));  // Output: -12
    }
}
