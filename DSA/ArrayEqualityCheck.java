import java.util.Arrays;

class ArrayEqualityCheck 
{
    public static boolean checkEqual(int a[], int b[]) {


        if (a.length != b.length)
        { 
            return false;         // Different sizes = definetely not equal arrays
        }  

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) 
        {
            if (a[i] != b[i])
            {
                return false;    // if arrays don't match they are unequal obviously
            } 
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 1, 2};
        int[] arr2 = {2, 3, 1};

        boolean result = ArrayEqualityCheck.checkEqual(arr1, arr2);
        System.out.println("Are the arrays equal? " + result);
    }
}