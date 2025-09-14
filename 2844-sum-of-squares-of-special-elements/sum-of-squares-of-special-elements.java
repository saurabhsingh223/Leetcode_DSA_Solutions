class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 1; i<=n; i++){
            if(special(n, i)){
               int sqr = nums[i-1]*nums[i-1];
               sum += sqr;
            }
        }
        return sum;
    }
    private boolean special(int a, int b){
        if(a%b == 0){
            return true;
        }
        return false;
    }
}