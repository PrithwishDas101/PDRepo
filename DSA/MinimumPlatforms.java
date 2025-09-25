import java.util.Arrays;
class MinimumPaltforms 
{
    static int findPlatform(int arr[], int dep[]) 
    {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int n = arr.length;
        int platformsNeeded = 1;      // initially atleast one platform is needed
        int maxPlatforms = 1;         // so initially maximum platform is one

        int i = 1;                    // counter variable for arrival
        int j = 0;                    // counter variable for departure

        while (i < n && j < n)
        {
            if (arr[i] <= dep[j])     // next train arrives before the last one departs => need a new platform
            {
                platformsNeeded++;    // hence platform += 1
                i++;                  // counter for arrival += 1
            } 
            else                      // one train departed => free up a platform
            {
                platformsNeeded--;    // hence platform -= 1
                j++;                  // counter for departure += 1
            }
            maxPlatforms = Math.max(maxPlatforms, platformsNeeded);  // will show the maximum platforms needed
        }

        return maxPlatforms;         //  returns maximum platforms needed
    }
    public static void main(String[] args) 
    {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};   // Arrival times
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000}; // Departure times         // dry run:
                                                                                    // (i=1, j=0, platformsNeeded=1) => arr[i] = 940,  arr[j] = 910  => 940  > 910  => arr[i] > dep[j] => platformsNeeded-- = 0 => j++ = 1 => maxPlatforms = 1
                                                                                    // (i=1, j=1, platformsNeeded=0) => arr[i] = 940,  arr[j] = 1200 => 940  < 1200 => arr[i] < dep[j] => platformsNeeded++ = 1 => i++ = 2 => maxPlatforms = 1
                                                                                    // (i=2, j=1, platformsNeeded=1) => arr[i] = 950,  arr[j] = 1200 => 950  < 1200 => arr[i] < dep[j] => platformsNeeded++ = 2 => i++ = 3 => maxPlatforms = 2
                                                                                    // (i=3, j=1, platformsNeeded=2) => arr[i] = 1100, arr[j] = 1200 => 1100 < 1200 => arr[i] < dep[j] => platformsNeeded++ = 3 => i++ = 4 => maxPlatforms = 3
                                                                                    // (i=4, j=1, platformsNeeded=1) => arr[i] = 1500, arr[j] = 1200 => 1500 > 1200 => arr[i] > dep[j] => platformsNeeded-- = 2 => j++ = 2 => maxPlatforms = 3
                                                                                    // (i=4, j=2, platformsNeeded=1) => arr[i] = 1500, arr[j] = 1120 => 1500 > 1120 => arr[i] > dep[j] => platformsNeeded-- = 1 => j++ = 3 => maxPlatforms = 3
                                                                                    // (i=4, j=3, platformsNeeded=1) => arr[i] = 1500, arr[j] = 1130 => 1500 > 1130 => arr[i] > dep[j] => platformsNeeded-- = 0 => j++ = 4 => maxPlatforms = 3
                                                                                    // (i=4, j=4, platformsNeeded=1) => arr[i] = 1500, arr[j] = 1900 => 1500 < 1900 => arr[i] < dep[j] => platformsNeeded++ = 1 => i++ = 5 => maxPlatforms = 3
                                                                                    // (i=4, j=2, platformsNeeded=1) => arr[i] = 1800, arr[j] = 1900 => 1800 < 1900 => arr[i] < dep[j] => platformsNeeded++ = 2 => i++ = 6 => maxPlatforms = 2
                                                                                    // loop ends as i=6  => reaches out of bounds
        int result = MinimumPaltforms.findPlatform(arr, dep);

        System.out.println("Minimum number of platforms needed: " + result);
    }
}