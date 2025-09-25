public class StockProfit 
{
    public static int maxProfit(int arr[])
    {
        int profit = 0;

        for (int i = 1; i < arr.length; i++)              // arr[] = {100, 180, 260, 310, 40, 535, 695}
        {
            if (arr[i] > arr[i-1])                        
            {
                profit += arr[i] - arr[i - 1];            // (i=1) 100 > 180 => profit += 180 - 100 = 80
                                                          // (i=2) 260 > 180 => profit += 260 - 180 = 80
                                                          // (i=3) 310 > 260 => profit += 310 - 260 = 50
                                                          // (i=4) 40  > 310 => skip 
                                                          // (i=5) 535 > 40  => profit += 535 - 40  = 495
                                                          // (i=6) 695 > 535 => profit += 695 - 535 = 160
            }
        }

        return profit;                                     // returns => profit = (80 + 80 + 50 + 495 + 160) = 865
    }
    public static void main(String[] args) 
    {
        int arr1[] = {100, 180, 260, 310, 40, 535, 695};
        System.out.println("Maximum profit: " + maxProfit(arr1));

        int arr2[] = {87, 345, 99, 456, 40, 999, 50};
        System.out.println("Maximum profit: " + maxProfit(arr2));

        int arr3[] = {100, 180, 55, 8, 0};
        System.out.println("Maximum profit: " + maxProfit(arr3));

        int arr4[] = {4, 0};
        System.out.println("Maximum profit: " + maxProfit(arr4));
    }
}
