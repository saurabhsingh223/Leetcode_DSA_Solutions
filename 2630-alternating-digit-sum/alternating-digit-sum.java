class Solution {
    public int alternateDigitSum(int n) {
        int temp = n;
        int count = 0;
        while(temp > 0){
            count++;
            temp = temp/10;
        }
        int [] arr = new int[count];
        temp = n;
        int x = arr.length-1;
        while(temp > 0){
            int d = temp%10;
            arr[x] = d;
            x--;
            temp = temp/10;
        }
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            if(i%2 != 0){
                sum -= arr[i];
                
            }else{
                sum += arr[i];
            }
        }
        return sum;
    }
}