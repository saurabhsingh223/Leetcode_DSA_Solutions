class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        // Kadane Algo -> O(n)
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++)
        {
            sum += nums[i];

            if(sum > maxi)
            {
                maxi = sum;
            }

            if(sum < 0)
            {
                sum = 0;
            }
        }

    return maxi;
        // brute force approach -> O(n^2)
        // int maxSum = Integer.MIN_VALUE;
        // for(int i = 0; i<n; i++)
        // {
        //     int sum = 0;
        //     for(int j = i; j<n; j++)
        //     {
        //         sum += nums[j];
        //         maxSum = Math.max(sum, maxSum);
        //     }
        // }
        // return maxSum;
    }
}