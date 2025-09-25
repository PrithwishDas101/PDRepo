class MaximumIndex 
{
    int maxIndexDiff(int arr[])                      // arr1[] = [34, 8, 10, 3, 2, 80, 30, 33, 1]
    {
        int n = arr.length;                          // n = 9
        
        int[] LMin = new int[n];                     // LMin[i] => stores minimum value from arr[0] to arr[i]
        int[] RMax = new int[n];                     // RMax[j] => stores maximum value from arr[j] to arr[n-1]

        LMin[0] = arr[0];                            // LMin[0] is the  first element => LMin = 34
        for (int i = 1; i < n; i++) 
        {
            LMin[i] = Math.min(arr[i], LMin[i - 1]); // For each index i, store minimum of arr[i] and LMin[i-1]
                                                     // LMin[1] = Math.min(8, 34) = 8
                                                     // LMin[2] = Math.min(10, 8) = 8
                                                     // LMin[3] = Math.min(3,  8) = 3
                                                     // LMin[4] = Math.min(2,  3) = 2
                                                     // LMin[5] = Math.min(80, 2) = 2
                                                     // LMin[6] = Math.min(30, 2) = 2
                                                     // LMin[7] = Math.min(33, 2) = 2
                                                     // LMin[8] = Math.min(1,  2) = 1

        }

        RMax[n - 1] = arr[n - 1];                    // RMax[n-1] is the last element => RMax[8] = 1
        for (int j = n - 2; j >= 0; j--) 
        {
            RMax[j] = Math.max(arr[j], RMax[j + 1]); // For each index j moving back, store maximum of arr[j] and RMax[j+1]
                                                     // RMax[7] = Math.max(33, 1)  = 33
                                                     // RMax[6] = Math.max(30, 33) = 33
                                                     // RMax[5] = Math.max(80, 30) = 80
                                                     // RMax[4] = Math.max(2,  80) = 80
                                                     // RMax[3] = Math.max(3,  80) = 80
                                                     // RMax[2] = Math.max(10, 80) = 80
                                                     // RMax[1] = Math.max(8,  80) = 80
                                                     // RMax[0] = Math.max(34, 80) = 80

        }

        int i = 0, j = 0, maxDiff = -1;
        while (i < n && j < n)                
        {
            if (LMin[i] <= RMax[j])                  // gfg constraint arr[i] <= arr[j] holds 
                                                     // (i=0) (j=0) => 34 <=  80 => maxDiff = 0 => j++
                                                     // (i=0) (j=1) => 34 <=  80 => maxDiff = 1 => j++
                                                     // (i=0) (j=2) => 34 <=  80 => maxDiff = 2 => j++
                                                     // (i=0) (j=3) => 34 <=  80 => maxDiff = 3 => j++
                                                     // (i=0) (j=4) => 34 <=  80 => maxDiff = 4 => j++
                                                     // (i=0) (j=5) => 34 <=  80 => maxDiff = 5 => j++
                                                     // (i=0) (j=6) => 34 !<= 33 => i++
                                                     // (i=1) (j=6) => 8  <=  33 => maxDiff = 5 => j++
                                                     // (i=1) (j=7) => 8  <=  33 => maxDiff = 6 => j++
                                                     // (i=1) (j=8) => 8 !<=  1  => i++
                                                     // (i=2) (j=8) => 8 !<=  1  => i++
                                                     // (i=3) (j=8) => 3 !<=  1  => i++
                                                     // (i=4) (j=8) => 2 !<=  1  => i++
                                                     // (i=5) (j=8) => 2 !<=  1  => i++
                                                     // (i=6) (j=8) => 2 !<=  1  => i++
                                                     // (i=7) (j=8) => 2 !<=  1  => i++
                                                     // (i=8) (j=8) => 1  <=  1  => maxDiff = 6 => j++


            {
                maxDiff = Math.max(maxDiff, j - i);  // according to given constraints by gfg
                j++;                                 // increase j => to look for bigger maxDIff to the right
            }
            else                                     // condition fails => increase i => need a smaller LMin[i]
            {
                i++;
            }
        }
        return maxDiff;                              // returns 6
    }
    public static void main(String[] args) 
    {
        MaximumIndex mi = new MaximumIndex();

        int[] arr1 = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        System.out.println(mi.maxIndexDiff(arr1)); 

        int[] arr2 = {3, 8, 5, 8, 56, 3};
        System.out.println(mi.maxIndexDiff(arr2));

        int[] arr3 = {12, 78, 45, 23, 8};
        System.out.println(mi.maxIndexDiff(arr3));

        int[] arr4 = {90, 78, 56, 45, 3};
        System.out.println(mi.maxIndexDiff(arr4));

        int[] arr5 = {12, 78, 67, 34, 8};
        System.out.println(mi.maxIndexDiff(arr5));
    }
} 