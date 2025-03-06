class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] sec = new int[n + 1][m + 1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    sec[i][j] = 1 + sec[i-1][j-1];
                }
                else{
                    sec[i][j] = Math.max(sec[i - 1][j], sec[i][j - 1]);
                }
            }
        }
        return sec[n][m];
    }
}