 public class PalindromeCheck 
{
    public static boolean isPalindrome(int n)    // n = 12321 (odd), n = 1221 (even)
    {
        if (n < 0 || (n % 10 == 0 && n != 0))    // a number less than 0 or a non-zero single digit number cannot be palindrome
        {
            return false;
        }

        int reverse = 0;

        while (n > reverse)                      // for odd number                              ||  for even number
        {  
            reverse = reverse*10 + n % 10;       // reverse =  0*10 + 1 = 1                     ||  reverse = 0*10 + 1 = 1
            n /= 10;                             // n = 1232                                    ||  n = 122
                                                 // reverse =  1*10 + 2 = 12                    ||  reverse = 1*10 + 2 = 12
                                                 // n = 123                                     ||  n = 12 => 12 = 12 => while loop stops 
                                                 // reverse = 12*10 + 3 = 123
                                                 // n = 12 => n < reverse => while loop stops
        }

        return n == reverse || n == reverse/10;  // returns true => n == reverse/10 => 12 == 12  || returns true => n == reverse => 12 == 12  
    }
    public static void main(String[] args) 
    {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(12321)); 
    }
}
