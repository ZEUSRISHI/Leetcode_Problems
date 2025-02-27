import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(arr[i], i);
        }
        
        Map<Integer, Integer> dp = new HashMap<>();
        int maxLength = 0;

        for (int k = 0; k < n; k++) {
            for (int j = 0; j < k; j++) {
                int ai = arr[k] - arr[j];
                if (ai >= arr[j] || !indexMap.containsKey(ai)) {
                    continue;
                }
                int i = indexMap.get(ai);
                int len = dp.getOrDefault(i * n + j, 2) + 1;
                dp.put(j * n + k, len);
                maxLength = Math.max(maxLength, len);
            }
        }
        
        return maxLength >= 3 ? maxLength : 0;
    }
}
