class Solution {
    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        String[] thousands = new String[]{"", "Thousand", "Million", "Billion"};
        int i = 0;
        String result = "";

        while (num > 0) {
            if (num % 1000 != 0) {
                result = numberToWordsCon(num % 1000) + thousands[i] + " " + result;
            }
            num /= 1000;
            i++;
        }

        return result.trim();
    }

    public String numberToWordsCon(int num) {
        String[] digit = new String[]{"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] teens = new String[]{"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = new String[]{"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        String result = "";

        if (num >= 100) {
            result += digit[num / 100] + " Hundred ";
            num %= 100;
        }

        if (num >= 20) {
            result += tens[num / 10] + " ";
            num %= 10;
        }

        if (num >= 10 && num < 20) {
            result += teens[num - 10] + " ";
        } else if (num > 0 && num < 10) {
            result += digit[num] + " ";
        }

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.numberToWords(123)); // Expected output: "One Hundred Twenty Three"
    }
}
