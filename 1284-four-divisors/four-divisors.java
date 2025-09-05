class Solution {
    public int sumFourDivisors(int[] nums) {
        int n = nums.length;
        int maxSum = 0;
        
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int count = 0, sum = 0;
            
            // find divisors of num
            for (int j = 1; j * j <= num; j++) {
                if (num % j == 0) {
                    int d1 = j;
                    int d2 = num / j;
                    
                    if (d1 == d2) { 
                        count++;
                        sum += d1;
                    } else {
                        count += 2;
                        sum += d1 + d2;
                    }
                }
                
                if (count > 4) break; // optimization
            }
            
            if (count == 4) {
                maxSum += sum;
            }
        }
        
        return maxSum;
    }
}
