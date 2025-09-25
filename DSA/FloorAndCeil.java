class FloorAndCeil 
{
    public static int[] getFloorAndCeil(int[] arr, int x) 
    {
        int floor = -1;
        int ceil = -1;

        for (int num : arr) 
        {
            if (num <= x && num > floor) 
            {
                floor = num; // best so far for floor
            }

            if (num >= x && (ceil == -1 || num < ceil)) 
            {
                ceil = num; // best so far for ceil
            }
        }

        return new int[]{floor, ceil};
    }
    public static void main(String[] args) 
    {
        int[] arr1 = {5, 6, 8, 9, 6, 5, 5, 6};
        int x1 = 7;
        int[] result1 = getFloorAndCeil(arr1, x1);

        System.out.println("Floor: " + result1[0] + ", Ceil: " + result1[1]);

        int[] arr2 = {5, 6, 8, 8, 6, 5, 5, 6, 11};
        int x2 = 10;
        int[] result2 = getFloorAndCeil(arr2, x2);

        System.out.println("Floor: " + result2[0] + ", Ceil: " + result2[1]); 
    }
}
