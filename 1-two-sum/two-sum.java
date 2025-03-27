class Solution {
    public int[] twoSum(int[] arr, int target) {
        int b = arr.length;
        for(int i=0;i<b;i++){
            for(int j=i+1;j<b;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}