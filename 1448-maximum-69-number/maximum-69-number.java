class Solution {
    public int maximum69Number (int num) {
      if(num == 9999 || num == 999 || num == 99 || num == 9){
        return num;
      }
       int []arr = new int[4];
       int i = arr.length -1;
       while(num > 0){
        int digit = num%10;
        arr[i] = digit;
        num = num/10;
        i--;
       }
        for(int j = 0; j<arr.length; j++){
            if(arr[j] == 6){
                arr[j] = 9;
                break;
            }
        }
        int realNum = 0;
        for(int j = 0; j<arr.length; j++){
            int digit = arr[j];
            realNum = realNum*10 + digit;
        }
        return realNum;
    }
}