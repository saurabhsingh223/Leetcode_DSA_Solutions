import java.util.*;

class Solution {
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        if (primes.size() < 2) return new int[]{-1, -1};

        int bestA = -1, bestB = -1;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < primes.size() - 1; i++) {
            int a = primes.get(i);
            int b = primes.get(i + 1);
            int diff = b - a;

            if (diff < minDiff) {
                minDiff = diff;
                bestA = a;
                bestB = b;
            }
        }

        return new int[]{bestA, bestB};
    }

    static boolean isPrime(int n){
        if(n <= 1) return false;
        int limit = (int) Math.sqrt(n);
        for(int i = 2; i <= limit; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
