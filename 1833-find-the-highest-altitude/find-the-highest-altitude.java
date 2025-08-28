class Solution {
    public int largestAltitude(int[] gain) {
      int n = gain.length;
      int highest = 0;
      int [] arr = new int[n+1];
      for(int i = 0; i<n; i++){
        arr[i+1] = arr[i] + gain[i];
      }
      for(int i = 0; i<arr.length; i++){
        if(arr[i] > highest){
            highest = arr[i];
        }
      }
      return highest;
    }
}