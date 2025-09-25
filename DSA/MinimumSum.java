import java.util.*;

class MinimumSum 
{
    String solve(int[] arr, int n)                                 // arr = [6, 8, 4, 5, 2, 3]
    {
        Arrays.sort(arr);                                          // arr = [2, 3, 4, 5, 6, 8]

        StringBuilder num1 = new StringBuilder();                  // num1 => holds 1st number
        StringBuilder num2 = new StringBuilder();                  // num2 => holds 2nd number

        for (int i = 0; i < n; i++) 
        {
            if (i % 2 == 0) 
            {
                num1.append(arr[i]);                               // even index => num1 = "246"
            } 
            else 
            {
                num2.append(arr[i]);                               // odd index  => num2 = "358"
            }
        }

        String res = addStrings(num1.toString(), num2.toString()); // res = "604"
        
        int i = 0;
        while (i < res.length() && res.charAt(i) == '0')           // scanning from left to right to check for non-zero number
        {
            i++;
        }

        return i == res.length() ? "0" : res.substring(i);         // if whole string is 0 return 0 else return a trimmed string
                                                                   // returns = "604"
    }

    String addStrings(String num1, String num2) 
    {
        StringBuilder sb = new StringBuilder();

        int i = num1.length() - 1, j = num2.length() - 1, carry = 0; // pointers from right end => and carry for addition.

        while (i >= 0 || j >= 0 || carry > 0)                        // loop until both numbers and carry are exhausted
        {
            int sum = carry;                                         // starting with the carry

            if (i >= 0)                                              // add digits of still in bound
            {
                sum += num1.charAt(i--) - '0';
            }

            if (j >= 0)                                              // add digits of still in bound
            {
                sum += num2.charAt(j--) - '0';
            }

            sb.append(sum % 10);
            carry = sum / 10;                                        // keep last digit => carry over rest
                                                                     // 6+8   = 14 => digit 4 => carry 1
                                                                     // 4+5+1 = 10 => digit 0, carry 1
                                                                     // 2+3+1 = 6  => digit 6
                                                                     // sb = 406
        }

        return sb.reverse().toString();                              // since we built result backwards => reverse
                                                                     // returns "604"
    }

    public static void main(String[] args) 
    {
        MinimumSum obj = new MinimumSum();

        System.out.println(obj.solve(new int[]{6, 8, 4, 5, 2, 3}, 6));
        System.out.println(obj.solve(new int[]{5, 3, 0, 7, 4}, 5));
        System.out.println(obj.solve(new int[]{9, 4}, 2));
    }
}
