class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;

        // Calculate the total sum of the array
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // Initialize prefix sum and count of valid splits
        long prefixSum = 0;
        int count = 0;

        // Iterate through the array to calculate valid splits
        for (int i = 0; i < n - 1; i++) {
            prefixSum += nums[i];
            long suffixSum = totalSum - prefixSum;

            // Check if the current split is valid
            if (prefixSum >= suffixSum) {
                count++;
            }
        }

        return count;
    }
}