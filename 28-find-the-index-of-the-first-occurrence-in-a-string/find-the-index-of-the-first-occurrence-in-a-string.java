class Solution {
    public int strStr(String haystack, String needle) {
        if(needle ==null ||needle.isEmpty())
        {
            return 0;
        }
        return haystack.indexOf(needle);
    }
}