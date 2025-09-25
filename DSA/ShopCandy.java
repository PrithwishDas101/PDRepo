import java.util.*;

class ShopCandy 
{
    public static ArrayList<Integer> minMaxCandy(int[] prices, int k) // prices = [3, 2, 1, 4], k=2
    {
        int n = prices.length;                                        // n = 4
        Arrays.sort(prices);                                          // prices = [1, 2, 3, 4]
                                                                      // prices[0] = cheapest => prices[n-1] => most expensive

        int minCost = 0;
        int i = 0;                                                    // points to the cheapest not-yet-claimed candy => start of array
        int j = n - 1;                                                // points to the most expensive not-yet-claimed candy => end of array
        
        while (i <= j)                                                // iterating from the cheapest to the most expensive candy
        {
            minCost += prices[i];                                     // greedy choice for minimizing total cost => always buy the smallest available price
            i++;                                                      // after buying the candy at i => it’s considered claimed => move i forward
            j -= k;                                                   // because buying one candy allows you to take up to k other different candies for free
                                                                      // you use that power to take the k most expensive remaining candies (so you remove them from consideration)
                                                                      // subtracting k from j removes up to k items from the expensive end 
                                                                      // if j becomes less than i, the loop will terminate next check
                                                                      // buying the current cheapest and taking the most expensive freebies minimizes money spent while maximizing the value received for free
        }
        
        
        int maxCost = 0;
        i = 0;                                                        // points to the cheapest not-yet-claimed candy => start of array
        j = n - 1;                                                    // points to the most expensive not-yet-claimed candy => end of array
        
        while (i <= j)                                                // iterating from the cheapest to the most expensive candy
        {
            maxCost += prices[j];                                     // buy the most expensive remaining candy => pay for it => to maximize total money => we buy the largest price first
            j--;                                                      // that candy is now claimed => move the expensive-end pointer left
            i += k;                                                   // for this purchase => we can take up to k other candies free
                                                                      // to maximize money paid => we use freebies to remove the cheapest remaining candies 
                                                                      // because we want to keep expensive ones to pay for later 
                                                                      // shift i right by k to mark k cheapest candies as free/claimed
                                                                      // buying expensive items and using freebies to remove cheap items makes you pay for the higher-cost ones rather than getting them free 
                                                                      // Greedy again but in opposite direction
        }

        ArrayList<Integer> result = new ArrayList<>();

        result.add(minCost);                                          // as per gfg
        result.add(maxCost);                                          // as per gfg
        
        return result;                                                // displays the minimum cost and maximum cost
    }
    public static void main(String[] args) 
    {
        int[] prices = {3, 2, 1, 4};
        int k = 2;
        System.out.println(minMaxCandy(prices, k));
        
        prices = new int[]{3, 2, 1, 4, 5};
        k = 4;
        System.out.println(minMaxCandy(prices, k));
    }
}
