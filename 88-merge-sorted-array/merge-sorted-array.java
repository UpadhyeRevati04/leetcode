class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mlst = m - 1; 
        int nlst = n - 1;  
        int right = m + n - 1; 
        while (nlst >= 0) {
            if (mlst >= 0 && nums1[mlst] > nums2[nlst]) {
                nums1[right] = nums1[mlst];
                mlst--;  
            } else {
                nums1[right] = nums2[nlst];
                nlst--;  
            }
            right--; 
        }
    }
}
