class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        if(n < 3) return false;
        int count = 0;
        for(int i = 0; i<n ; i++){
           if(arr[i] % 2 != 0){
            count++;
            if(count == 3) return true;
           } else{
            count = 0;
           }
        }
        return false;
    }
}