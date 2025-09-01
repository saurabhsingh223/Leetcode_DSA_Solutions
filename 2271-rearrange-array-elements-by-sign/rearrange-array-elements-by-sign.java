class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int i : nums){
            if(i >= 0){
                pos.add(i);
            }else{
                neg.add(i);
            }
        }
        int p =0, n= 0;
        for(int i = 0; i<nums.length; i = i+2){
            nums[i] = pos.get(p);
            nums[i+1] = neg.get(n);
            p++;
            n++;
        }
        return nums;
    }
}