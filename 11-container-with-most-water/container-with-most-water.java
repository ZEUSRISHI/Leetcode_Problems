class Solution {
    public int maxArea(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int asd = 0;
        int sdf = 0;
        while(left<right){
            if(arr[left]<arr[right]){
                asd = arr[left]*(right-left);
                left++;
            }
            else{
                asd = arr[right]*(right-left);
                right--;
            }
            if(sdf<asd){
                sdf=asd;
            }
        }
        return sdf;
    }
}