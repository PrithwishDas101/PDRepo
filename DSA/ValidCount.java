import java.util.HashSet;

class ValidCount 
{
    public int countValid(int n, int[] arr) 
    {
        long totalNumbers = 9 * (long) Math.pow(10, n - 1);  // Total possible n-digit numbers => Always 9 × 10^(n-1) => the first digit can’t be 0

        HashSet<Integer> forbiddenDigits = new HashSet<>();
        for (int digit : arr) 
        {
            forbiddenDigits.add(digit);
        }

        int allowedCount = 10 - forbiddenDigits.size();        // only digits allowed
        long invalidNumbers;

        if (n == 1) 
        {
            int invalidCount = 0;                              // For single-digit numbers => only digits 1–9 matter => remove forbidden digits from 1–9
            for (int d = 1; d <= 9; d++) 
            {
                if (!forbiddenDigits.contains(d))              // If the digit is not in the required set => it’s invalid because it does not contain any required digit.
                {
                    invalidCount++;                                                    
                }
            }
            invalidNumbers = invalidCount;
        } 
        else if (forbiddenDigits.contains(0)) 
        {
            invalidNumbers = (long) Math.pow(allowedCount, n);  // 0 forbidden => it cannot be used at all
        } 
        else 
        {
            invalidNumbers = (long) (allowedCount - 1) * (long) Math.pow(allowedCount, n - 1);         // 0 is allowed => but cannot be first digit
        }

        long result = totalNumbers - invalidNumbers;

        return (int) result;
    }
     public static void main(String[] args) 
    {
        ValidCount sol = new ValidCount();

        int n1 = 1;
        int[] arr1 = {1, 2, 3};
        System.out.println(sol.countValid(n1, arr1)); 

        int n2 = 2;
        int[] arr2 = {3, 5};
        System.out.println(sol.countValid(n2, arr2)); 

        int n3 = 3;
        int[] arr3 = {};
        System.out.println(sol.countValid(n3, arr3));

        int n4 = 2;
        int[] arr4 = {0, 3};
        System.out.println(sol.countValid(n4, arr4)); 
    }
}
