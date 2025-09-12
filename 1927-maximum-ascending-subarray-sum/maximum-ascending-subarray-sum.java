class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            int sum = nums[i];
            for(int j = i+1; j<nums.length; j++){
                if(nums[j] > nums[j-1]){
                    sum += nums[j];
                }else{
                    break;
                }
                
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}