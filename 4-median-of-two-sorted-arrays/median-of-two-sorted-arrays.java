class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] merg = new int[n+m];
        int k = 0;
        for(int i= 0; i<n; i++)
        {
            merg[k++] = nums1[i];
        }
        for(int i =0;i<m;i++)
        {
            merg[k++] = nums2[i];
        }
        Arrays.sort(merg);
        int total =merg.length;
        if(total % 2== 1)
        {
            return (double) merg[total/2];
        }
        else{
            int mid1 = merg[total /2-1];
            int mid2 = merg[total/2];
            return((double) mid1 + (double) mid2) / 2.0;
        }
    }
}