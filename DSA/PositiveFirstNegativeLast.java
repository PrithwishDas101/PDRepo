public class PositiveFirstNegativeLast 
{
    static void seggregation(int arr[])
    {
        int temp[] = new int[arr.length];
        int index  = 0;

        for (int i = 0; i < arr.length; i++)   // store positive numbers first
        {
            if (arr[i] >= 0)
            {
                temp[index++] = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++)  // store negative numbers next
        {
            if (arr[i] < 0)
            {
                temp[index++] = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++)  // store the 
        {
            arr[i] = temp[i];
        }
    }
    public static void main(String[] args) 
    {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        seggregation(arr);

        for (int num : arr) 
        {
            System.out.print(num + " ");
        }

    }
}
