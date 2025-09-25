import java.util.Arrays;

class ThirdLargestElement 
{
    static int thirdLargest(int arr[]) 
    {
        
        if (arr.length < 3)          // base case for less than 3 numbers
        {
            return -1;
        }

        Arrays.sort(arr);  // sorting is necessary
        
        return arr[arr.length-3];    // return the 3rd largest integer from the array
    }
    public static void main(String[] args) 
    {
        int arr1[] = {1, 2, 2, 5, 6, 8, 4};

        System.out.println(thirdLargest(arr1));    
    }
}