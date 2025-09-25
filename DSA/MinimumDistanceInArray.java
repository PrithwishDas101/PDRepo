public class MinimumDistanceInArray 
{
    int minDist(int arr[], int x, int y)
    {
        int n = arr.length;

        int minDistance = Integer.MAX_VALUE;
        int prevIndex = -1;
        int prevValue = -1;

        for (int i = 0; i < n; i++) 
        {
            if (arr[i] == x || arr[i] == y) 
            {
                if (prevIndex != -1 && arr[i] != prevValue) 
                {
                    minDistance = Math.min(minDistance, i - prevIndex);
                }
                prevIndex = i;
                prevValue = arr[i];
            }                                                           // (i=0) => arr[0] = 1
                                                                        // x or y => yes (x=1)
                                                                        // prevIndex = -1 => skip
                                                                        // Update prevIndex = 0, prevValue = 1
                                                                        // (i=1) => arr[1] = 2
                                                                        // x or y => yes (y=2)
                                                                        // prevIndex = 0, prevValue = 1, current value = 2 != prevValue
                                                                        // minDistance => min(infinity, 1 - 0) = 1
                                                                        // prevIndex = 1, prevValue = 2
                                                                        // (i=2) => arr[2] = 3
                                                                        // Not x or y => skip
                                                                        // (i=3) => arr[3] = 2
                                                                        // x or y => yes (y=2)
                                                                        // prevIndex = 1, prevValue = 2, current value = 2 == prevValue => skip
                                                                        // prevIndex = 3, prevValue = 2
        }

        return (minDistance == Integer.MAX_VALUE) ? -1 : minDistance;   // returns minDistance = 1
    }
    public static void main(String[] args) 
    {
        MinimumDistanceInArray obj = new MinimumDistanceInArray();
        int[] arr = {1, 2, 3, 2};
        int x = 1, y = 2;
        int result = obj.minDist(arr, x, y);
        System.out.println("Minimum distance between " + x + " and " + y + " is: " + result);
    }
}
