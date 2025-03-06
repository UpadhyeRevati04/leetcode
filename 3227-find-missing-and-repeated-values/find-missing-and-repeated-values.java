class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n= grid.length;
        int miss = -1,rep = -1;
        Map<Integer, Integer> freq = new HashMap<>();
        for(int[] row : grid){
            for(int num : row){
                freq.put(num,freq.getOrDefault(num,0) + 1);
            }
        }
        for (int num = 1; num <= n * n; num++) {
            if (!freq.containsKey(num)) {
                miss = num; 
            } else if (freq.get(num) == 2) {
                rep = num; 
            }
        }
        return new int[] { rep, miss };
    }
}