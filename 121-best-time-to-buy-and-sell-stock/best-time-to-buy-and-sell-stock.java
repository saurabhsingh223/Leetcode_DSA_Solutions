class Solution {
    public int maxProfit(int[] prices) {
        // int n = prices.length;
        // int maxProfit = 0;
        // int diff = 0;
        // for(int i = n-1; i>=1; i--){
        //     for(int j = i-1; j >=0; j--){
        //     diff = prices[i] - prices[j];
        //      if(diff > maxProfit){
        //         maxProfit = diff;
        //        }
        //     }   
        // }
        int buyPrice = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++){
            int cost = prices[i] - buyPrice;
            maxProfit = Math.max(maxProfit, cost);
            buyPrice = Math.min(buyPrice, prices[i]);
        }
    return maxProfit;
        // brute force
    //    for(int i = 0; i<prices.length-1; i++){
    //     for(int j = i+1; j<prices.length; j++){
    //         int profit = prices[j] - prices[i];
    //         maxProfit = Math.max(maxProfit, profit);
    //     }
    //    }
        
    }
}