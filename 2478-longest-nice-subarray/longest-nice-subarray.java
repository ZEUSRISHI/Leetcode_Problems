class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left = 0, maxLen = 0, windowMask = 0;

        for (int right = 0; right < nums.length; right++) {
            while ((windowMask & nums[right]) != 0) {
                windowMask ^= nums[left];
                left++;
            }
            windowMask |= nums[right];
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
