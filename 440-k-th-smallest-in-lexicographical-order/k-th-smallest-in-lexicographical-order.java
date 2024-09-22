class Solution {
    public int findKthNumber(int n, int k) {
        int curr = 1;
        k--;
        while(k > 0){
            int count= getCount(n,curr,curr+1);
            if(count<=k){
                curr++;
                k = k-count;
            }else{
                curr *= 10;
                k = k-1;
            }
        }
        return curr;
    }
    public int getCount(int n, long tree1,long tree2){
        int count = 0;
        while(tree1<=n){
            count += Math.min(n+1,tree2)-tree1;
            tree1 *= 10;
            tree2 *= 10;
         }
         return count;
    }
}