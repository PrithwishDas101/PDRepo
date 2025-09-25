class PythagoreanTriplet 
{
    public boolean checkTriplet(int[] arr) 
    {
        int MAX = 1000;                                    // By gfg constraint: 1 <= arr[i] <= 1000.
        boolean[] present = new boolean[MAX + 1];          // lookup table to quickly check: is number x present?

        for (int num : arr)                                // for array [3, 2, 4, 6, 5]
        {
            present[num] = true;                           // Mark every number in the array as present present[2], present[3], present[4], present[5], present[6] → true.
        }

        for (int a = 1; a <= MAX; a++)                 
        { 
            if (!present[a])                               //  If present[a] is false, skip. 
            {
                continue;                                  // present[5] => True
            }

            for (int b = a; b <= MAX; b++)                 // For each a, try b ≥ a to avoid duplicate pairs like (3,4) and (4,3)
            {
                if (!present[b]) 
                {
                    continue;                               
                }

                int c2 = a * a + b * b;                     // (a=2) => (b=2) => 2*2 + 2*2 => c2 = 8
                int c = (int) Math.sqrt(c2);                // c = Math.sqrt(8)  = NOT int => skip
                                                            // (a=2) => (b=3) => 2*2 + 3*3 = 13 
                                                            // c = Math.sqrt(13) = NOT int => skip
                                                            // (a=2) => (b=4) => 2*2 + 4*4 = 20 
                                                            // c = Math.sqrt(20) = NOT int => skip
                                                            // (a=2) => (b=5) => 2*2 + 5*5 = 29 
                                                            // c = Math.sqrt(29) = NOT int => skip
                                                            // (a=2) => (b=6) => 2*2 + 6*6 = 40 
                                                            // c = Math.sqrt(40) = NOT int => skip
                                                            // (a=3) => (b=3) => 3*3 + 3*3 => c2 = 18
                                                            // c = Math.sqrt(18) = NOT int => skip
                                                            // (a=3) => (b=4) => 3*3 + 4*4 => 25
                                                            // c = Math.sqrt(25) => int => c = 5

                if (c * c == c2 && c <= MAX && present[c])  // basic trignometry
                {
                    return true;                            // returns triplets if found (3, 4, 5)
                }
            }
        }
        return false;                                       
    }

    public static void main(String[] args) 
    {
        PythagoreanTriplet obj = new PythagoreanTriplet();

        int[] arr1 = {3, 2, 4, 6, 5};
        System.out.println(obj.checkTriplet(arr1));

        int[] arr2 = {5, 12, 13, 0, 45};
        System.out.println(obj.checkTriplet(arr2));

        int[] arr3 = {15, 8, 17, 8, 9};
        System.out.println(obj.checkTriplet(arr3));

        int[] arr4 = {1, 2, 3, 4};
        System.out.println(obj.checkTriplet(arr4));

        int[] arr5 = {997, 796, 995, 4, 4};
        System.out.println(obj.checkTriplet(arr5));
    }
}
