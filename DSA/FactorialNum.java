import java.util.*;

class FactorialNum 
{
    static ArrayList<Integer> factorial(int n)                  // n = 5
    {
        ArrayList<Integer> res = new ArrayList<>();             // res holds digits in reverse order
                                                                // 120 will be stored as [0, 2, 1] at first
        res.add(1);                                           // factorial starts as 1 as 0! = 1! = 1

        for (int x = 2; x <= n; x++) 
        {
            multiply(res, x);                                   // basically 1 × 2 × 3 × 4 × ... × n
        }

        Collections.reverse(res);                               // reverses [0, 2, 1] => [1, 2, 0]
        return res;                                             // returns [1, 2, 0]
    }

    static void multiply(ArrayList<Integer> res, int x) 
    {
        int carry = 0;                                          // for handeling values > 9

        for (int i = 0; i < res.size(); i++) 
        {
            int prod = res.get(i) * x + carry;                  // prod = res = [1] x 2 + 0 = 2  prod = res = [2] x 3 + 0 = 6  prod = res = [6] x 4 + 0 = 24  (i=0) prod = 4 × 5 = 20 = 20 => res[0]=0, carry=2
            res.set(i, prod % 10);                              // res[0] = 2 % 10 = 2           res[0] = 6 % 10 = 6           res[0] = 24 % 10 = 4           (i=1) prod = 2 × 5 = 10 + 2 = 12 => res[1] = 2, carry = 1
            carry = prod / 10;                                  // carry  = 2 / 10 = 0           carry  = 6 / 10 = 0           carry = 24 / 10 = 2
        }                                                       // res = [2]                     res = [6]                   

        while (carry != 0) 
        {
            res.add(carry % 10);                                                                                            // res = [4, 2]                    res = [0, 2, 1]
            carry /= 10;
        }
    }

    public static void main(String[] args) 
    {
        System.out.println(factorial(5));   // [1, 2, 0]
        System.out.println(factorial(10));  // [3, 6, 2, 8, 8, 0, 0]
        System.out.println(factorial(1));   // [1]
    }
}
