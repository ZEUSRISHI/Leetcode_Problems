class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int n = nums.size();
        
        // Step 1: Find the first decreasing element from the end
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            --i;
        }
        
        // Step 2: If such an element exists, find the element just larger than nums[i]
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                --j;
            }
            // Step 3: Swap elements at i and j
            swap(nums[i], nums[j]);
        }
        
        // Step 4: Reverse the sequence after index i
        reverse(nums.begin() + i + 1, nums.end());
    }
};
