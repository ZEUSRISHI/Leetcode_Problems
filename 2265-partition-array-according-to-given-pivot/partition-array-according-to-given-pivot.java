class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> left = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int num : nums) {
            if (num < pivot) {
                left.add(num);
            } else if (num == pivot) {
                equal.add(num);
            } else {
                right.add(num);
            }
        }
        int index = 0;
        for (int num : left) nums[index++] = num;
        for (int num : equal) nums[index++] = num;
        for (int num : right) nums[index++] = num;

        return nums;
    }
}
