class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits; // done
            }
            digits[i] = 0; // carry over
        }

        // If all digits were 9, we need a new array
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1; // rest are 0 by default
        return newNumber;
    }
}
