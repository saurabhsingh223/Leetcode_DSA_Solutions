class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increase = true;
        boolean decrease = true;
        int n = nums.length;
        int left = 0;
        int right = 1;
        while(right < n){
            if(nums[left] > nums[right]) increase = false;
            if(nums[left] < nums[right]) decrease = false;
            left++;
            right++;
        }
        return increase || decrease;
    }
}
