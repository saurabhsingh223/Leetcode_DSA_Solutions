class Solution {
    public int majorityElement(int[] nums) {
         
         int cnt  = 0;
         int elm = -1;
         for(int i = 0; i<nums.length; i++){
            if(cnt == 0){
                cnt = 1;
                elm = nums[i];
            }else if(nums[i] == elm){
                cnt++;
            }else{
                cnt--;
            }
         }

         int count = 0;
         for(int i = 0; i<nums.length; i++){
            if(nums[i] == elm)
            {
                count++;
            }
         }

         if(count > (nums.length)/2)
         {
            return elm;
         }

         return -1;
             
        // better approach
        // HashSet<Integer> set = new HashSet<>();
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     for(int i = 0; i<nums.length; i++){ 
    //         if(map.containsKey(nums[i])){
    //             map.put(nums[i], map.get(nums[i])+1);
    //         }else{
    //             map.put(nums[i] , 1);
    //         }
    // }
    //     int freq = 0;
    //     int maxFreqElement = -1;
    //     for(Map.Entry<Integer, Integer> entry : map.entrySet()){
    //          if(entry.getValue() > freq){
    //             freq = entry.getValue();
    //             maxFreqElement = entry.getKey();
    //          }
    //     }
    //     return maxFreqElement;


    }
}