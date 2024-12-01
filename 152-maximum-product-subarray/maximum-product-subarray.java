class Solution {
    public int maxProduct(int[] arr) {
        // code here
        int n=arr.length;
        int maxProduct = arr[0];
        int minProduct = arr[0];
        int result = arr[0];
        for (int i = 1; i < n; i++) {
        int current = arr[i];
            if (current < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
        maxProduct = Math.max(current, maxProduct * current);
        minProduct = Math.min(current, minProduct * current);
        result = Math.max(result, maxProduct);
    }
        return result;
    }
}