class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if(n < 3) return false;
        int peak = 0;

        for(int i = 0; i<n-1; i++){
            if(arr[i+1] == arr[i]) return false;
            if(arr[i+1] < arr[i]){
                peak = i;
                break;
            } 
        }
        
        if (peak == 0 || peak == n - 1) return false;

        for(int i = peak; i<n-1; i++){
            if(arr[i+1] >= arr[i]){
                return false;
            } 
        }
        return true;
    }
}