class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int result =0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int product = nums[i] * nums[j];
                result += 8 * count.getOrDefault(product,0);
                count.put(product,count.getOrDefault(product,0)+1);
            }
        }
        return result;
    }
}