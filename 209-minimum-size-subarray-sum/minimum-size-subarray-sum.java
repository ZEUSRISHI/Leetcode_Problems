class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLen = Integer.MAX_VALUE;  // To store the minimum length of subarray
        int currentSum = 0;
        int left = 0;  // Left pointer of the sliding window

        for (int right = 0; right < n; right++) {
            currentSum += nums[right];  // Add the current number to the sum
            
            // Shrink the window from the left as long as the sum is >= target
            while (currentSum >= target) {
                minLen = Math.min(minLen, right - left + 1);  // Update the minimal length
                currentSum -= nums[left];  // Subtract the leftmost element
                left++;  // Move the left pointer to shrink the window
            }
        }

        // If no valid subarray is found, return 0
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
