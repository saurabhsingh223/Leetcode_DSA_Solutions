class Solution {
    public int buyChoco(int[] prices, int money) {
        int count = 0;
        int leftMoney = money;
        Arrays.sort(prices);
        for(int i = 0; i<prices.length; i++){
            
            if(leftMoney >= prices[i]){
                leftMoney = leftMoney - prices[i];
                count++;
                if(count == 2){
                return leftMoney;
            }
            }  
            if(count == 1 && leftMoney == 0){
                return money;
            }  
        }
        return money;
    }
}