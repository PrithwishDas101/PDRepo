class ProductArrayPuzzle 
{
    public static int[] productExceptSelf(int[] arr) 
    {
        int n = arr.length;
        int[] left  = new int[n];
        int[] right = new int[n];
        int[] res   = new int[n];

        left[0] = 1;
        for (int i = 1; i < n; i++)                 // left product for {10, 3, 5, 6, 2}
        {
            left[i] = arr[i - 1] * left[i - 1];     // (i=0) => left[0] = 1
                                                    // (i=1) => arr[0] * left[0] = 10 * 1   => left[1] = 10
                                                    // (i=2) => arr[1] * left[1] = 3  * 10  => left[2] = 30
                                                    // (i=3) => arr[3] * left[2] = 5  * 30  => left[3] = 150
                                                    // (i=4) => arr[4] * left[3] = 6  * 150 => left[3] = 900
        }

        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--)            // right product for {10, 3, 5, 6, 2}
        {
            right[i] = arr[i + 1] * right[i + 1];   // (i=4) => right[4] = 1
                                                    // (i=3) => arr[4] * right[4] = 2 * 1  => right[3] = 2
                                                    // (i=2) => arr[3] * right[3] = 6 * 2  => right[2] = 12
                                                    // (i=1) => arr[2] * right[2] = 5 * 12 => right[1] = 60 
                                                    // (i=0) => arr[1] * right[1] = 3 * 60 => right[0] = 180   
        }

        for (int i = 0; i < n; i++)                 // final product => left = [1, 10, 30, 150, 900] * right = [180, 60, 12, 2, 1]
        {
            res[i] = left[i] * right[i];            // (i=0) => left[0] * right[0] = 1    * 180 => res[0] = 180
                                                    // (1=1) => left[1] * right[1] = 10   * 60  => res[1] = 600
                                                    // (i=2) => left[2] * right[2] = 30   * 12  => res[2] = 360
                                                    // (i=3) => left[3] * right[3] = 150  * 2   => res[3] = 300
                                                    // (i=4) => left[4] * right[4] = 900  * 1   => res[4] = 900
        }

        return res;                                 // res = [180, 600, 360, 300, 900]
    }

    public static void main(String[] args) 
    {
        int[] arr1 = {10, 3, 5, 6, 2};
        int[] result1 = productExceptSelf(arr1);

        for (int i : result1) 
        {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] arr2 = {100, 30, 50, 60, 20};
        int[] result2 = productExceptSelf(arr2);

        for (int i : result2) 
        {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] arr3 = {11, 33, 55, 66, 22};
        int[] result3 = productExceptSelf(arr3);

        for (int i : result3) 
        {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] arr4 = {10, 300, 5, 600, 2};
        int[] result4 = productExceptSelf(arr4);

        for (int i : result4) 
        {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] arr5 = {1, 2, 3, 4, 5};
        int[] result5 = productExceptSelf(arr5);

        for (int i : result5) 
        {
            System.out.print(i + " ");
        }
    }
}
