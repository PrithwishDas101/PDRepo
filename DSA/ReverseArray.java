import java.util.Arrays;

class ReverseArray 
{
    public void reverseArray(int arr[]) 
    {
        int length = arr.length;

        int[] temp = new int[length];

        for (int i = 0; i < length; i++) 
        {
            int n = length - (1 + i);
            temp[n] = arr[i];
        }

        for (int i = 0; i < length; i++) 
        {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) 
    {
        ReverseArray obj = new ReverseArray();

        int[] arr = {1, 4, 3, 2, 6, 5};

        System.out.println("Original Array: " + Arrays.toString(arr));

        obj.reverseArray(arr);

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
