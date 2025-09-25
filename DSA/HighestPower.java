import java.util.*;
class HighestPower 
{
    public static int highestPower(int n, int k) 
    {
        Map<Integer, Integer> primeFactors = getPrimeFactors(k); // it maps prime factors as keys and exponents as values
                                                                 // k = 18 => 18 = 2 x 3^2 => 2 = 1; 3 = 2

        int result = Integer.MAX_VALUE; // tracks the smallest exponent x for k^x that divides n!
                                        // n! = 10! = 10x9x8x7x6x5x4x3x2x1 =>  7 twos 8 threes
                                        // for 2   => 7 twos   => 7 / 1 = 7
                                        // for 3^2 => 8 threes => 8 / 2 = 4

        for (Map.Entry<Integer, Integer> entry : primeFactors.entrySet()) // entrySet turns map into a set of key-value pairs
        {
            int p = entry.getKey();      // prime factor
            int a = entry.getValue();    // its exponent in k

            int count = countFactorInFactorial(n, p);

            result = Math.min(result, count / a);
        }

        return result;
    }

    private static int countFactorInFactorial(int n, int p) 
    {
        int count = 0;
        while (n > 0) 
        {
            n /= p;     // 10/2   = 5 => 5/2    = 2 => 2/2    = 1 => 1/2 = 0 > loop ends
                        // 10/3   = 3 => 3/3    = 1 => 1/3    = 0 => loop ends
            count += n; // count += 5 => count += 2 => count += 1 => count = 8
                        // count += 3 => count += 1 => count = 3
        }
        return count;   // returns 8 for p=2 and 4 for p=3
    }

    private static Map<Integer, Integer> getPrimeFactors(int k) 
    {
        Map<Integer, Integer> factors = new HashMap<>();
        for (int i = 2; i * i <= k; i++) // k = 18 sqrt(k) = 4.2 => test only 2 to 4
        {
            while (k % i == 0) 
            {
                factors.put(i, factors.getOrDefault(i, 0) + 1);  // i = 2 => 2x2 = 4 <= 18 => ok => 18%2 = 0 => true
                k /= i;                                                       // k /= 2 => 18/= 2 = 9
                                                                              // 9%2 == 0 => false => stop
                                                                              // final factors map => (2=1, 3=2)
            }
        }
        if (k > 1) 
        {
            factors.put(k, factors.getOrDefault(k, 0) + 1);
        }
        return factors;
    }

    public static void main(String args[]) 
    {
        System.out.println(highestPower(7, 2));  
        System.out.println(highestPower(10, 9));
    }
}