class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int h = 0;
        for (int i = 0; i < n; i++) {
            int remainingPapers = n - i;
            if (citations[i] >= remainingPapers) {
                h = remainingPapers;
                break;
            }
        }
        return h;
    }
}
