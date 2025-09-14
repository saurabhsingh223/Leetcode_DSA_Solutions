class Solution {
    public int smallestNumber(int n, int t) {
        int small = 0;
        for(int i = n; i<=Integer.MAX_VALUE; i++){
            if(div(i,t)){
                small = i;
                break;
            }
        }
        return small;
    }
    private boolean div(int n, int t){
        int prod = 1;
        while(n > 0){
            int dig = n%10;
            prod *= dig;
            n /= 10;
        }
        if(prod % t == 0){
            return true;
        }
        return false;
    }
}