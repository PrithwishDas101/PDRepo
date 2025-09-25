public class IndexOfExtraElement 
{
    public static int findExtra(int a[], int b[])
    {
        for (int i = 0; i < b.length; i++)
        {
            if (a[i] != b[i])
            {
                return i;
            }
        }

        return a.length - 1;
    }    
    public static void main(String[] args) 
    {
        int a[] = {1, 2, 4, 5, 8, 2, 4};
        int b[] = {1, 2, 4, 5, 2, 4};

        System.out.println(("index for the extra element: " + findExtra(a, b)));
    }
}
