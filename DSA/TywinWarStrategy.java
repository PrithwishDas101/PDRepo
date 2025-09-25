import java.util.Arrays;

public class TywinWarStrategy 
{
    public static int minSoldiers(int[] arr, int k) 
    {         
        int n = arr.length;
        
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = (k - arr[i] % k) % k;         // as per Tywin's strategy
                                                   // (i=0) => 5%2 = 1 => (2-1)%2 = 1 => arr[0] = 1 => 5 needs 1 soldier
                                                   // (i=1) => 6%2 = 0 => (2-0)%2 = 0 => arr[1] = 0 => 6 needs 0 soldier
                                                   // (i=2) => 3%2 = 1 => (2-1)%2 = 1 => arr[2] = 1 => 3 needs 1 soldier
                                                   // (i=3) => 2%2 = 0 => (2-0)%2 = 0 => arr[3] = 0 => 2 needs 0 soldier
                                                   // (i=4) => 1%2 = 1 => (2-1)%2 = 1 => arr[4] = 1 => 1 needs 1 soldier
        }
        
        Arrays.sort(arr);                          // arr => [0, 0, 1, 1, 1]
        
        int sum = 0;
        
        for(int i = 0 ; i < (n + 1) / 2 ; i++)     // iterating 0 to 3 
        {
            sum += arr[i];                         // sum += 0 + 0 + 1
        }
        
        return sum;                                // returns 1 so only 1 soldier is needed to be considered ods in favour for Tywin
    }
    public static void main(String[] args) 
    {
        int arr1[] = {5, 6, 3, 2, 1};
        int k1 = 2;

        System.out.println("Minimum soldiers to be added to be lucky: " + minSoldiers(arr1, k1));

        int arr2[] = {7, 10, 21, 18, 1, 6};
        int k2 = 3;

        System.out.println("Minimum soldiers to be added to be lucky: " + minSoldiers(arr2, k2));
    }
}
