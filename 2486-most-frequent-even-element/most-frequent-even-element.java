class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int [] freq = new int[max+1];
        for(int i = 0; i<nums.length; i++){
            freq[nums[i]]++;
        }
        int maximum = 0;
        int ans = -1;
        for(int i = 0; i<freq.length; i+=2){
            if(freq[i] > maximum){
                maximum = freq[i];
                ans = i;
            }
        }
          return ans;
    }
}