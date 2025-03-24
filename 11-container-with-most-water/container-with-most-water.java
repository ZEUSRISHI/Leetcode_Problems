class Solution {
    public int maxArea(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int asdf=0;
        int asdfg=0;
        while(left<right){
            if(arr[left]<arr[right]){
                asdf=arr[left]*(right-left);
                left++;
            }
            else{
                asdf=arr[right]*(right-left);
                right--;
            }

            if(asdfg<asdf){
                asdfg=asdf;
            }

        }
        return asdfg;
    }
}