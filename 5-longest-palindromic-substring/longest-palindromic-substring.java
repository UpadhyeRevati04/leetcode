class Solution {
    public String longestPalindrome(String s) {
        // code here
        if (s == null || s.length() == 0) return "";
        int n = s.length();
        int start  = 0;
    	int maxlen = 0;
    	for (int i = 0; i < s.length(); i++) {
            int len1 = divFromCenter(s, i, i);
            int len2 = divFromCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > maxlen) {
                maxlen = len;
                start = i - (len - 1) / 2;
            }
        }
        return s.substring(start, start + maxlen);
    }
    private int divFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; 
    }   
}