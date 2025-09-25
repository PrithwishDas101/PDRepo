class DivisibleBy13
{
    public static boolean isdivby13(String s) 
    {
        int remainder = 0;
        for (int i = 0; i < s.length(); i ++)
        {
            int digit = s.charAt(i) - '0';            // 0 = 48, A = 49, B = 50... (s="5234") digit(0) = 53 - 48 = 5
            remainder = (remainder * 10 + digit) %13; // (s="2990") => remainder = 0 => remainder (0 *10 + 2) %13  = 2  
                                                      //            => remainder = 2 => remainder (2 * 10 + 9) %13 = 3
                                                      //            => remainder = 3 => remainder (2 * 10 + 9) %13 = 0
                                                      //            => remainder = 0 => remainder (0 * 10 + 0) %13 = 0
                                                      //            => 2990 => divisible by 13
        }
        return remainder == 0;                        // returns true if number is divisible by 13
    }
    public static void main(String[] args)
    {
        String s1 = "2990";
        String s2 = "1637379913";
        
        System.out.println(isdivby13(s1));
        System.out.println(isdivby13(s2));
    }
}