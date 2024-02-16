class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n =s.length();
        int[] last = new int[256];
        int i =0,j=0,count=0;
        while (j < n)
        {
               if (last[s.charAt(j)] == 0 || last[s.charAt(j)] < i)
                {
                    count = Math.max(count,j-i+1);
                }
                else{
                    i= last[s.charAt(j)];
                }
            last[s.charAt(j)] = j+1;
            j++;
        }
        return count;
    }
}