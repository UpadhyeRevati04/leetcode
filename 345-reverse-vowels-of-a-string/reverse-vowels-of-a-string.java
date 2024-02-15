class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        String vowel = "aeiouAEIOU";

         while (start < end) {
            while (start < end && !isVowel(word[start])) {
                start++;
            }

            while (start < end && !isVowel(word[end])) {
                end--;
            }

            // Swap vowels
            if (start < end) {
                char temp = word[start];
                word[start] = word[end];
                word[end] = temp;

                start++;
                end--;
            }
        }

        return new String(word);
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}