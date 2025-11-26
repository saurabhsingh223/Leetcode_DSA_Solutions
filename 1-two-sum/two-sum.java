class Solution {
    public int[] twoSum(int[] nums, int target) {
        //better
        Map<Integer, Integer> map = new HashMap<>();
        int [] res = new int[2];
        for(int i = 0; i<nums.length; i++){
            int req = target - nums[i];
            if(map.containsKey(req)){
                res[0] = map.get(req);
                res[1] = i;
                break; 
            }
            map.put(nums[i], i);
        }
        
        return res;
        
        //brute-force
        // // int target = sc.nextInt();
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i]+nums[j]==target){
        //         return new int[] {i,j};
        //         }
        //     }
        // }
        // return new int[] {};
    }
    
}