class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        int count  = 0;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
        }
        while(sum != 0){
            if(sum%k == 0){
                return count;
            }else{
                sum -= 1;
                count++;
            }
        }
        return count;
    }
}