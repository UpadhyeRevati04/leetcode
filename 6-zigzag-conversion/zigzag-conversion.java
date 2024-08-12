class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || numRows >= s.length()){return s;}
        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i =0;i<numRows;i++)
        {
            rows[i] =  new StringBuilder();
        }
        int curr = 0;
        boolean gd = false;
        for(char c : s.toCharArray()){
            rows[curr].append(c);
            if (curr == 0 || curr == numRows - 1) {
                gd = !gd;
            }
            curr += gd ? 1 : -1;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}