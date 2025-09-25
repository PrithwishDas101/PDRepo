import java.util.*;

public class MaximumOverlapping 
{
    public int maxSum(String s) 
    {
        int n = s.length();

        if (n < 2)                          // no two non-overlapping substrings exist
        {
            return 0;
        }

        int[] d = manacherOdd(s);           // using Manacher's algorithm => d[i] gives the radius of the longest odd-length palindrome centered at i
                                            // s = "aba" => d = [1, 2, 1]
                                            // (i=0) => 'a' => palindrome "a"   => radius 1
                                            // (i=1) => 'b' => palindrome "aba" => radius 2 (k=2 => length=2*2-1=3)
                                            // (i=2) => 'a' => palindrome "a"   => radius 1

        int[] maxEnd = new int[n];          // will store length of longest odd palindrome ending   at index i
        int[] maxStart = new int[n];        // will store length of longest odd palindrome starting at index i.

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0])); // max heap on B

        int centerIdx = 0;

        for (int e = 0; e < n; e++)                   //  computes maxEnd
        {
            while (centerIdx < n && centerIdx <= e) 
            {
                int c = centerIdx;                    // c <= e (palindromes centered at or before e)
                int B = 1 - 2 * c;                    // (a constant for palindrome length formula)
                int R = c + d[c] - 1;                 // (right boundary of palindrome centered at c)

                pq.offer(new int[]{B, R});

                centerIdx++;
            }

            while (!pq.isEmpty() && pq.peek()[1] < e) // remove from the heap any palindrome which ends before e (not covering e)
            {
                pq.poll();
            }

            maxEnd[e] = !pq.isEmpty() ? 2 * e + pq.peek()[0] : 1; // top of heap corresponds to palindrome covering e with largest length
                                                                  // s = "aba" => n=3, d = [1,2,1]
                                                                  // (e=0) => centers (c=0) only
                                                                  // B = 1 - 2*0 = 1 => R = 0 + 1 - 1 = 0
                                                                  // pq = [[1,0]].
                                                                  // pq.peek()[1] = 0 >= (e=0) => valid.
                                                                  // maxEnd[0] = 2*0 + 1 = 1 (palindrome "a")
                                                                  // (e=1) => add centers c=1
                                                                  // B = 1 - 2*1 = -1 => R = 1 + 2 - 1 = 2
                                                                  // pq = [[1,0], [-1,2]]
                                                                  // remove expired => [1,0] ends at 0 < 1 => remove it
                                                                  // pq = [[-1,2]]
                                                                  // maxEnd[1] = 2*1 + (-1) = 2 -1 = 1
        }

        int[] maxPref = new int[n];                               //  maxPref[i] is the longest palindrome ending at or before index i
        int cur = 0;

        for (int i = 0; i < n; i++) 
        {
            if (maxEnd[i] > cur)                                  // allows quick lookup of maximum palindrome length ending on or before any position
            {
                cur = maxEnd[i];
            }
            maxPref[i] = cur;
        }

        PriorityQueue<int[]> pq2 = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));
        int centerIdx2 = n - 1;

        for (int sIdx = n - 1; sIdx >= 0; sIdx--)                 // for each starting index sIdx from right to left
        {
            while (centerIdx2 >= 0 && centerIdx2 >= sIdx)         // for all palindrome centers c >= sIdx
            {
                int c = centerIdx2;
                int C = 2 * c + 1;
                int L = c - d[c] + 1;
                pq2.offer(new int[]{C, L});                    
                centerIdx2--;
            }

            while (!pq2.isEmpty() && pq2.peek()[1] > sIdx)        // remove palindromes whose left boundary L is after sIdx (palindrome does not start at or before sIdx)
            {
                pq2.poll();
            }
            
            maxStart[sIdx] = !pq2.isEmpty() ? -2 * sIdx + pq2.peek()[0] : 1;
        }

        int[] maxSuff = new int[n];                               // suffix max array for palindromes starting at or after index i
        cur = 0;

        for (int i = n - 1; i >= 0; i--)                           
        {
            if (maxStart[i] > cur) 
            {
                cur = maxStart[i];
            }
            
            maxSuff[i] = cur;
        }

        int ans = 0;

        for (int i = 0; i < n - 1; i++) 

        {
            ans = Math.max(ans, maxPref[i] + maxSuff[i + 1]);      // add max palindrome length ending on or before i and max palindrome length starting after i
        }

        return ans;
    }

    private int[] manacherOdd(String s) 
    {
        int n = s.length();
        int[] d = new int[n];                                      // d is output array to store palindrome radii for each cente
        int l = 0, r = -1;                                         // l = left boundary and r = right boundary

        for (int i = 0; i < n; i++) 
        {
            int k = 1;                                             // minimal palindrome radius 

            if (i <= r) 
            {
                k = Math.min(d[l + r - i], r - i + 1);             // if i is within the right boundary r of the current known palindrome
                                                                   // l + r - i is the mirror index of i with respect to center (l + r) / 2.
                                                                   // d[l + r - i] is the palindrome radius at the mirror index.
            }
            
            while (i - k >= 0 && i + k < n && s.charAt(i - k) == s.charAt(i + k)) // expand palindrome around center i by comparing characters equidistant on left and right.
                                                                                  // increment k while characters match, boundaries are respected.
                                                                                  // once mismatch or out of bounds, expansion stops
            {
                k++;
            }

            d[i] = k;                                                             // store final palindrome radius for center i

            if (i + k - 1 > r)                                                    // If palindrome around i expands beyond current right boundary r
            { 
                l = i - k + 1;    
                r = i + k - 1;                                                    // update boundaries l and r to the new palindrome boundaries                                   
            }                                                                     // s = "aba" => (i=0) => 'a' => k=1 => palindrome "a" radius 1 => l=0, r=0.
                                                                                  // (i=1) => 'b' => i <= r is false 1 > 0 => 'b': "aba" palindrome found, k=2 => l=0, r=2.
                                                                                  // (i=2) => 'a' => i <= r true (2 <= 2) => Mirror of 2 about center is l + r - i = 0 + 2 - 2 = 0 
                                                                                  // d[0] = 1, r - i + 1 = 2 - 2 + 1 = 1
                                                                                  // k = min(1,1) = 1
                                                                                  // d[2]=1
        }

        return d;
    }

    public static void main(String[] args) 
    {
        MaximumOverlapping sol = new MaximumOverlapping();

        System.out.println(sol.maxSum("gfgforgeeks"));
        System.out.println(sol.maxSum("xyabacbcz"));
        System.out.println(sol.maxSum("aaaa"));
        System.out.println(sol.maxSum("abc"));
    }
}
