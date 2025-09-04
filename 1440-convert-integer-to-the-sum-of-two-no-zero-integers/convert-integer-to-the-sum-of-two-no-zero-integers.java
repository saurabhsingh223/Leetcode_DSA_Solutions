class Solution {
    public int[] getNoZeroIntegers(int n) {
        // List<Integer> list = new ArrayList<>();
        int [] res = new int[2];
        for(int i =1; i<n; i++){
            int c = n-i;
            if(check(c) && check(i)){
                res[0] = i;
                res[1] = c;
                break;
            }
        }
        return res;
    }
    private boolean check(int c){
        while(c>0){
            int digit = c%10;
            if(digit == 0) return false;
            c = c/10;
        }
        return true;
    }
}