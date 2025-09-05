class Solution {
    public int findFinalValue(int[] nums, int original) {
        while(find(nums, original)){
            original *= 2;
        }
        return original;
    }
    static boolean find(int[] nums, int original){
        // int got = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == original){
             return true;   
            }
        }
        return false;
    }
}