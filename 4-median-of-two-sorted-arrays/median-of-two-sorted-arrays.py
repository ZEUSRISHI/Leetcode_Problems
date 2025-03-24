class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        nums1.extend(nums2)
        b = len(nums1)
        nums1.sort()
        if b%2 == 0:
            return (nums1[b//2] + nums1[b//2-1])/2.0
        else:
            return nums1[b//2]