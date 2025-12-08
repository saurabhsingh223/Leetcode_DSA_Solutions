class Solution {
    public int countTriples(int n) {
        int [] arr = new int[n+1];
        for(int i = 1; i<=n; i++){
            arr[i] = i*i;
        }
        int count = 0;
        for(int i = 0; i<arr.length - 2; i++){
            for(int j = i+1; j<arr.length-1; j++){
                 for(int k = j+1; k<arr.length; k++){
                    if(arr[i] + arr[j] == arr[k]){
                        count += 2;
                    }
                 }
            }
        }
        return count;
    }
}