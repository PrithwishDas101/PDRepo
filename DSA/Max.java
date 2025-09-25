class MaxCircularSum 
{
    public int maxCircularSum(int arr[])                              // arr = [8, -8, 9, -9, 10, -11, 12]
    {
        int n = arr.length;                                           // n = 7

        int maxKadane = kadane(arr);                                  // Standard max subarray sum (non-circular)

        int totalSum = 0;
        for (int i = 0; i < n; i++)                                   //  i	 => arr[i] => totalSum => totalSum += arr[i] => totalSum => arr[i] 
        {                                                             // (0)	   8	      0	          0 + 8  =  8	           8         -8
            totalSum += arr[i];                                       // (1)	  -8	      8        	  8 - 8  =  0	           0	      8
            arr[i] = -arr[i];                                         // (2)       9          0           0 + 9  =  9  	           9	     -9
        }                                                             // (3)      -9	      9	          9 - 9  =  0	           0	      9
                                                                      // (4)      10	      0	          0 + 10 = 10	          10	    -10
                                                                      // (5)     -11	     10	         10 - 11 = -1	          -1	     11
                                                                      // (6)      12	     -1	         -1 + 12 = 11	          11	    -12

        int maxWrap = totalSum + kadane(arr);                         // maxWrap => 11 + 11 = 22

        if (maxWrap == 0) 
        {
            return maxKadane;
        }

        return Math.max(maxKadane, maxWrap);                          // returns 22
    }

    private int kadane(int[] arr) 
    {
        int maxEndingHere = arr[0];                                   // maxEndingHere = -8
        int maxSoFar = arr[0];                                        // maxSoFar      = -8

        for (int i = 1; i < arr.length; i++)                          // (i=1) => arr[1] =  8  => maxEndingHere = max(8, -8 + 8)       = max(8, 0)    =  8 => maxSoFar = max(-8, 8)  = 8
        {                                                             // (i=2) => arr[2] = -9  => maxEndingHere = max(-9, 8 + (-9))    = max(-9, -1)  = -1 => maxSoFar = max(-8, -1) = 8
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]); // (i=3) => arr[3] =  9  => maxEndingHere = max(9, -1 + 9)       = max(9, 8)    =  9 => maxSoFar = max(8, 9)   = 9
            maxSoFar = Math.max(maxSoFar, maxEndingHere);             // (i=4) => arr[4] = -10 => maxEndingHere = max(-10, 9 + (-10))  = max(-10, -1) = -1 => maxSoFar = max(9, -1)  = 9
        }                                                             // (i=5) => arr[5] =  11 => maxEndingHere = max(11, -1 + 11)     = max(11, 10)  = 11 => maxSoFar = max(9, 11)  = 11 
                                                                      // (i=6) => arr[6] = -12 => maxEndingHere = max(-12, 11 + (-12)) = max(-12, -1) = -1 => maxSoFar = max(11, -1) = 11

        return maxSoFar;                                              // returns => maxSoFar = 11
    }

    public static void main(String[] args) 
    {
        MaxCircularSum sum = new MaxCircularSum();

        int[] arr1 = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(sum.maxCircularSum(arr1)); // 22

        int[] arr2 = {10, -3, -4, 7, 6, 5, -4, -1};
        System.out.println(sum.maxCircularSum(arr2)); // 23

        int[] arr3 = {5, -2, 3, 4};
        System.out.println(sum.maxCircularSum(arr3)); // 12

        int[] arr4 = {-2, -3, -1};
        System.out.println(sum.maxCircularSum(arr4)); // -1

        int[] arr5 = {2, -9, 0, 3, 5, 8};
        System.out.println(sum.maxCircularSum(arr5)); // -1
    }
}
