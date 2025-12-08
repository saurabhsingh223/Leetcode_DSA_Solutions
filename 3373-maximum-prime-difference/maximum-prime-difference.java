class Solution {
    public int maximumPrimeDifference(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            if(isPrime(nums[i])){
                list.add(i);
            }
        }
        if(list.size() == 1) return 0;
        Collections.sort(list);
        int first = list.get(0);
        int last = list.get(list.size() - 1);
        int ans = last - first;
        return ans;
    }
    static boolean isPrime(int n){
        if(n <= 1) return false;
        int limit = (int) Math.sqrt(n);
        for(int i = 2; i<= limit; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}