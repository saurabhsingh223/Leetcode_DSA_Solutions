class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int maxDiff = Integer.MIN_VALUE;
        int diff = 0;
        if(nums.length < 2) return 0;
        for(int i = nums.length-1; i>=1; i--){
            diff = nums[i] - nums[i-1];
            maxDiff = Math.max(maxDiff, diff);
        }
        return maxDiff;
    }
}