class Solution {
    public String reverseWords(String s) {
        List<String> words = new ArrayList<>();
        String[] parts = s.split("\\ ");
        
        for (String word : parts) {
            if (!word.isEmpty()) {
                words.add(word);
            }
        }
        Collections.reverse(words);
        return String.join(" ", words);
    }
}