import java.util.*;
class DivisorsNine 
{
    public static int countNumbers(int n) 
    {   // A number has exactly 9 divisors if and only if its prime factorization is either
        // p^8 for some prime 𝑝, or
        // p^2xq^2 for some distinct primes p, q2
        // 1. Sieve primes up to √n
        // 2. Count how many primes 𝑝 satisfy 𝑝^8 ≤ 𝑛
        // 3. Count all pairs (𝑝,𝑞) with p<q such that p^2q^2 <= n


        int count = 0;                                      // accumulates the answer

        int maxP2Q2 = (int) Math.sqrt(n) + 1;               // maxP2Q2 ~ floor(√n) for p^2q^2 pairs 
                                                            // For p^2 * q^2 <= n, we need p*q <= sqrt(n).

        boolean[] isPrime = new boolean[maxP2Q2 + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;                    // Initialize all as prime.

        for (int i = 2; i * i <= maxP2Q2; i++) 
        {
            if (isPrime[i]) 
            {
                for (int j = i * i; j <= maxP2Q2; j += i) 
                {
                    isPrime[j] = false;                     // Eliminate multiples of each prime <= √maxP2Q2.
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= maxP2Q2; i++) 
        {
            if (isPrime[i]) primes.add(i);                  // Now primes contains every prime <= √n
        }

        for (int p : primes)                                // for each p integer in primes do
        {
            long pow8 = 1;
            for (int i = 0; i < 8; i++) 
            {
                pow8 *= p;                                 // a number has exactly 9 divisors if it’s p^8.
                if (pow8 > n) break;                       // for n = 100, p = 2 => 2^8 = 256 => 256 > 100 => stop.
            }
            if (pow8 <= n)                                 // If pow8 is still ≤ n, it means p^8 is valid.
            {
                count++;                                   // A number with exactly 9 divisors => add 1 to our counter
            }
        }

        int size = primes.size();
        for (int i = 0; i < size; i++) 
        {
            long p2 = (long) primes.get(i) * primes.get(i);
            if (p2 > n)
            {
                break;                                     // Outer loop: picks p
            }
            for (int j = i + 1; j < size; j++) 
            {
                long q2 = (long) primes.get(j) * primes.get(j);
                if (p2 * q2 <= n)                          // p^2 x q^2 must be less than n
                                                           // Number of divisors = (2+1) × (2+1) = 9
                {                                          
                    count++;                               // [2, 3, 5, 7] => i = 0 => p = 2 => p^2 = 4 => 4 <= 100   => continue
                                                           // j = 1 => q = 3 => q^2 = 9  => 4x9   = 36  <= 100 count ++
                                                           // j = 2 => q = 5 => q^2 = 25 => 4x16  = 100 <= 100 count ++
                                                           // j = 3 => q = 7 => q^2 = 49 => 4x49  = 196 > 100 => stop
                                                           
                                                           // [2, 3, 5, 7] => i = 1 => p = 3 => p^2 = 9 => 9 <= 100   => continue
                                                           // j = 2 => q = 5 => q^2 = 25 => 9x25  = 225 > 100 => stop

                                                           // [2, 3, 5, 7] => i = 2 => p = 5 => p^2 = 25 => 25 <= 100 => continue
                                                           // j = 3 => q = 7 => q^2 = 49 => 25x49 = 1225 > 200 => stop

                                                           // [2, 3, 5, 7] => i = 3 => p = 7 => p^2 = 49 => 49 <= 100 => continue
                                                           // j = 4 => q = out of bounds => stop
                                                           
                } 
                else 
                {
                    break;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) 
    {
        System.out.println(countNumbers(100));  // for 100 
        System.out.println(countNumbers(200));  // 3  (36, 100, 196)
    }
}
