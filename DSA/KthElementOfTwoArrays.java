class KthElementOfTwoArrays 
{
    public int kthElement(int a[], int b[], int k) 
    {
        int m = a.length;                       // a = [2, 3, 6, 7, 9]
        int n = b.length;                       // b = [1, 4, 8, 10]
                                                // k = 5
                                                // Combined sorted: [1, 2, 3, 4, 6, 7, 8, 9, 10] => 5th element = 6
        
        int i = 0, j = 0;                       // counter variable for array a and b respectively

        while (i < m && j < n)                  // first while loop => (i=0, j=0, k=5, m=5, n=4)        // second while loop => (i=2, j=0, k=3)        // third while loop => (i=2, j=1, k=2)        // fourth while loop => (i=2, j=2, k=1)
        {
            if (k == 1)                         // k = 5 != 1                                           // k = 3 != 1                                  // k = 2 != 1                                 // k = 1 = 1
            {
                return Math.min(a[i], b[j]);                                                                                                                                                         // return => min(6, 8) = 6 [ANSWER]
            }

            int mid = k / 2;                      // mid = 5/2 = 2                                      // mid = 3/2 = 1                               // mid = 2/2 = 1
            int newI = Math.min(i + mid, m) - 1;  // newI => min(0 + 2, 5) - 1 = 1                      // newI = min(2 + 1, 5) - 1 = 2                // newI = min(2 + 1, 5) - 1 = 2
            int newJ = Math.min(j + mid, n) - 1;  // newJ => min(0 + 2, 4) - 1 = 1                      // newJ = min(0 + 1, 4) - 1 = 0                // newJ = min(1 + 1, 4) - 1 = 1

            int valA = a[newI];                   // valA => a[1] = 3                                   // valA = a[2] = 6                             // valA = a[2] = 6
            int valB = b[newJ];                   // valB => b[1] = 4                                   // valB = b[0] = 1                             // valB = b[1] = 4

            if (valA <= valB)                     // 3 < 4                                              // 6 !< 1                                      // 6 !< 4
            {
                k -= (newI - i + 1);              // k => 5 - (1 - 0 + 1) = 3
                i = newI + 1;                     // i => 1 + 1 = 1
            } 
            else 
            {
                k -= (newJ - j + 1);                                                                    // k => 3 - (0 - 0 + 1) = 2                    // k => 2 - (1 - 1 + 1) = 1   
                j = newJ + 1;                                                                           // j => 0 + 1 = 1                              // j => 1 + 1 = 2
            }
        }                                         

        if (i < m) 
        {
            return a[i + k - 1];
        }
        return b[j + k - 1];
    }
    public static void main(String[] args) {
        KthElementOfTwoArrays solution = new KthElementOfTwoArrays();
        
        int[] a = {2, 3, 6, 7, 9};
        int[] b = {1, 4, 8, 10};
        int k = 5;

        int result = solution.kthElement(a, b, k);
        System.out.println("The " + k + "th element is: " + result);
    }   
}