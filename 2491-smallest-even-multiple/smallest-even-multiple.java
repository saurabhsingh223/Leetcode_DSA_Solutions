class Solution {
    public int smallestEvenMultiple(int n) {
        int num = n;
        while(!(num % 2 == 0 && num % n == 0)){
            if(num % 2 == 0 && num % n == 0) return num;
            num++;
        }
        return num;
    }
}