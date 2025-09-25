public class MaximumSixtyNineNumber 
{
    public static int maximum69Number (int num)            // num = 9669
    {
        char digits[] = String.valueOf(num).toCharArray(); // String.valueOf(num) => converts num into a string => "9669"
                                                           // toCharArray => converts the string "9669" to an array of chars => ['9', '6', '6', '9']
        for (int i = 0; i < digits.length; i++)
        {
            if (digits[i] == '6')                          // convert the first found 6 into a 9 and break 
            {
                digits[i] = '9';
                break;
            }
        }

        return Integer.valueOf(new String(digits));       // Integer.valueOf => gets the Integer value of the new String(digits) => which converts the char array of digits into a string => ultimately we return an Integer 9969
    } 
    public static void main(String[] args) 
    {
        System.out.println(" Maximum of 9669  = " + maximum69Number(9669));
        System.out.println(" Maximum of 9996  = " + maximum69Number(9996));
        System.out.println(" Maximum of 9999  = " + maximum69Number(9999));
        System.out.println(" Maximum of 66666 = " + maximum69Number(66666));
        System.out.println(" Maximum of 69    = " + maximum69Number(69));
    }
}
