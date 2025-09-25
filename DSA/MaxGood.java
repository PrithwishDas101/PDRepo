public class MaxGood 
{
    public static String largestGoodInteger ( String num)      // for num = "6777133339"
    {
        String maxGood = "";

        for (int i = 0; i < num.length() - 3; i ++)                                                          // (i=0) => sub = "677" => all same ? Nah => maxGood = ""
        {                                                                                                    // (i=1) => sub = "777" => all same ? Yeh => 777 > 0   => maxGood = "777"
            String sub = num.substring(i, i + 3);                                                            // (i=2) => sub = "771" => all same ? Nah => maxGood ="777"
                                                                                                             // (i=3) => sub = "713" => all same ? Nah => maxGood ="777"
            if (sub.charAt(0) == sub.charAt(1) && sub.charAt(1) == sub.charAt(2))    // (i=4) => sub = "133" => all same ? Nah => maxGood ="777"
            {                                                                                                // (i=5) => sub = "333" => all same ? Yeh => 777 > 333 => maxGood ="777"
                if (sub.compareTo(maxGood) > 0)                                                              // (i=6) => sub = "333" => all same ? Yeh => 777 > 333 => maxGood ="777"
                {                                                                                            // (i=7) => sub = "339" => all same ? Nah => maxGood = "777"
                    maxGood = sub;
                }
            }
        }

        return maxGood;                                                                                      // returns "  777"
    }    
    public static void main(String[] args) 
    {
        String num1 = "6777133339";
        System.out.println(largestGoodInteger(num1));

        String num2 = "2300019";
        System.out.println(largestGoodInteger(num2));

        String num3 = "42352338";
        System.out.println(largestGoodInteger(num3));
    }
}
