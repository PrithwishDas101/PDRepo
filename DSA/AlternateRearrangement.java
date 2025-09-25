import java.util.Arrays;

class AlternateRearrangement 
{
    public void rearrange(int arr[]) 
    {
        Arrays.sort(arr);                                    // Array has to be sorted => arr[] = [1, 2, 3, 4, 5, 6]

        int n = arr.length;
        int maxIdx = n - 1;                                  // rightmost index => maxIdx = n - 1 = 5      
        int minIdx = 0;                                      // leftmost  index => minIdx = 0

        int maxElem = arr[n - 1] + 1;                        // greater than any element => arr[n-1] + 1 = 6 + 1 = 7

        for (int i = 0; i < n; i++) 
        {
            if (i % 2 == 0)                                  // max, min, 2nd max, 2nd min, 3rd max, 3rd min,...
                                                             // Even positions: take largest  remaining
                                                             // Odd positions : take smallest remaining
            {
                arr[i] += (arr[maxIdx] % maxElem) * maxElem; // arr[i] => current value => arr[maxIdx] => value to be placed in the final position
                                                             // arr[0] => 1 + (6%7) * 2 = 43
                maxIdx--;                                    // maxIdx-- => maxIdx = 4
                                                             // arr[2] => 3 + (5*7) = 38
                                                             // maxIdx-- => maxIdx = 3
                                                             // arr[4] 5 + (4%7) * 7 = 33
                                                             // maxIdx-- => maxIdx = 2
                                                   
            } 
            else 
            {
                arr[i] += (arr[minIdx] % maxElem) * maxElem; // arr[i] => current value => arr[minIdx] => value to be placed in the final position
                                                             // arr[1] => 2 + (1*7) = 9
                                                             // minIdx++ => minIdx = 1
                                                             // arr[3] => 4 + (2*7) = 18
                                                             // minIdx++ => 2 
                                                             // arr[5] = 6 + (3*7) = 27
                                                             // minIdx++ => 3
                minIdx++;
            }
        }

        for (int i = 0; i < n; i++)                          // currently => arr[] = [43, 9, 38, 18, 33, 27] => needs to be decoded
        {
            arr[i] = arr[i] / maxElem;                       // arr[0] = 43 / 7 = 6
                                                             // arr[1] = 9  / 7 = 1
                                                             // arr[2] = 38 / 7 = 5
                                                             // arr[3] = 18 / 7 = 2
                                                             // arr[4] = 33 / 7 = 4
                                                             // arr[5] = 27 / 7 = 3 
        }
    }
    public static void main(String[] args) 
    {
        AlternateRearrangement obj = new AlternateRearrangement();

        int[] arr1 = {890, 289, 483, 519, 550, 447, 946, 957, 92, 783};
        System.out.println("Original: " + Arrays.toString(arr1));

        obj.rearrange(arr1);
        System.out.println("Rearranged: " + Arrays.toString(arr1));

        int[] arr2 = {6, 5, 3, 2 ,1, 4};
        System.out.println("Original: " + Arrays.toString(arr2));

        obj.rearrange(arr2);
        System.out.println("Rearranged: " + Arrays.toString(arr2));
    }
}
