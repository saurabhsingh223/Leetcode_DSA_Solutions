class Solution {
    public int maxProduct(int n) {
        List<Integer> list = new ArrayList<>();
        while(n > 0){
            int digit = n%10;
            list.add(digit);
            n = n/10;
        }
        Collections.sort(list);
        int product = 1;
        for(int i = list.size()-1; i>=0; i++){
              product = list.get(i)*list.get(i-1);
              break;
        }
        return product;
    }
}