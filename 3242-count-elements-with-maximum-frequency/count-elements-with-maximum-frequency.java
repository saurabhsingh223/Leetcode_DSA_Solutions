class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        if(n==1) return 1;
        int [] hash = new int[101];
        for(int i = 0; i<n; i++){
            hash[nums[i]]++;
        }
        int max = 0;
        for(int i = 0; i<hash.length; i++){
            max = Math.max(max, hash[i]);
        }
        int count = 0;
        for(int i = 0; i<hash.length; i++){
            if(hash[i] == max){
                count += hash[i];
            }
        }
        return count;
    }
}