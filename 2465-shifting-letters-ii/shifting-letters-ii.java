class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] shiftArray = new int[n + 1]; // To handle prefix sum calculations

        // Process each shift operation
        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];

            // Apply the shift to the range
            shiftArray[start] += (direction == 1 ? 1 : -1);
            shiftArray[end + 1] -= (direction == 1 ? 1 : -1);
        }

        // Calculate the cumulative shifts using prefix sum
        int cumulativeShift = 0;
        char[] result = s.toCharArray();
        for (int i = 0; i < n; i++) {
            cumulativeShift += shiftArray[i];
            // Normalize the cumulative shift within the range of 0 to 25
            int shift = ((cumulativeShift % 26) + 26) % 26;
            result[i] = (char) ((result[i] - 'a' + shift) % 26 + 'a');
        }

        return new String(result);
    }
}