import java.util.Arrays;

public class MaxValuePermutation 
{
    static final int MOD = 1000000007;                                 // common prime modulus => (10^9 + 7)
    
    int maxValue(int arr[]) 
    {
        Arrays.sort(arr); 

        long result = 0;

        for (int i = 0; i < arr.length; i++) 
        {
            result = (result + ((long) arr[i] * i) % MOD) % MOD;       // permutation formula result= ((i=0)∑(n−1)) ​arr[i]xi (mod MOD)
        }

        return (int) result;
        
    }
    public static void main(String[] args) {
        MaxValuePermutation obj = new MaxValuePermutation();

        int[] arr1 = {3, 1, 2};
        System.out.println(obj.maxValue(arr1)); 

        int[] arr2 = {5, 2, 8, 10};
        System.out.println(obj.maxValue(arr2)); 

        int[] arr3 = {4, 4, 4};
        System.out.println(obj.maxValue(arr3)); 

        int[] arr4 = {1, 2, 3, 4, 5};
        System.out.println(obj.maxValue(arr4)); 
    }
}
