class Solution {
    public long coloredCells(int n) {
        long cells = 1;
        int add = 4;
        while(--n > 0){
            cells += add;
            add +=4;
        }
        return cells;
    }
}