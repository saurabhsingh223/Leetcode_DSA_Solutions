class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(self(i)){
                list.add(i);
            }
        }
        return list;
    }

    static boolean self(int num){
        int real = num;
        while(num > 0){
            int digit = num%10;
            if(digit == 0 || real % digit != 0) return false;
            num = num/10;
        }
        return true;
    }
}