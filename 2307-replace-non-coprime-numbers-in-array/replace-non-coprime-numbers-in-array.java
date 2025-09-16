class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        for (int num : nums) {
            int curr = num;
            // Try merging backwards while possible
            while (!list.isEmpty() && gcd(list.get(list.size() - 1), curr) > 1) {
                curr = lcm(list.remove(list.size() - 1), curr);
            }
            list.add(curr);
        }
        
        return list;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private int lcm(int a, int b) {
        return (int)((1L * a * b) / gcd(a, b)); // prevent overflow
    }
}
