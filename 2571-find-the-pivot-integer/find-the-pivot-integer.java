class Solution {
    public int pivotInteger(int n) {
        int totalSum = n * (n+1)/2;
         int leftSum = 0;
        for (int x = 1; x <= n; x++) {
            leftSum += x;
            int rightSum = totalSum - leftSum + x; // since x is included in both sums
            if (leftSum == rightSum) {
                return x;
            }
        }
        
        return -1;
    }
}