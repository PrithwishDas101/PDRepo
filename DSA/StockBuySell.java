class StockBuySell
{
    public int maximumProfit(int prices[]) 
    {
        int maxProfit = 0;                                // initially the total profit => 0 => Greedy Algorithm
        for (int i = 1; i < prices.length; i++)           // from day 1 to the end
        {
            if (prices[i] > prices[i - 1])                // today’s price > than yesterday’s => profit
            {
                maxProfit += prices[i] - prices[i - 1];   // profit => (today - yesterday) => maxProfit
            }
        }
        return maxProfit;                                 // prices = [100, 180, 260, 310, 40, 535, 695]
                                                          // Buy 100 => Sell 310 => profit => 210
                                                          // Buy 40  => Sell 695 => profit => 655
                                                          // maxProfit = 210 + 655 = 865
                                                          // returns 865 
    }
    public static void main(String[] args) 
    {
        StockBuySell obj = new StockBuySell();

        int[] prices1 = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(obj.maximumProfit(prices1));

        int[] prices2 = {4, 2, 2, 2, 4};
        System.out.println(obj.maximumProfit(prices2));
    }
}
