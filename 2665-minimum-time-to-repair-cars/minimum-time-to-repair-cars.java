import java.util.Arrays;

class Solution {
    public long repairCars(int[] ranks, int cars) {
        long left = 1, right = (long) ranks[0] * cars * cars, ans = right;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (canRepairAll(ranks, cars, mid)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    private boolean canRepairAll(int[] ranks, int cars, long time) {
        long repairedCars = 0;
        for (int rank : ranks) {
            repairedCars += (long) Math.sqrt(time / rank);
            if (repairedCars >= cars) return true;
        }
        return repairedCars >= cars;
    }
}
