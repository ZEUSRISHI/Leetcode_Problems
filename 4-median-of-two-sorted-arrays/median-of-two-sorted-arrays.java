class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length+nums2.length];
        int b = arr.length;
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        int j=0;
        for(int i=nums1.length;i<nums1.length+nums2.length;i++){
            arr[i]=nums2[j];
            j++;
        }
        Arrays.sort(arr);

        if(b%2==0){
            return (arr[b/2]+arr[b/2-1])/2.0;
        }
        else{
            return arr[b/2];
        }
    }
}