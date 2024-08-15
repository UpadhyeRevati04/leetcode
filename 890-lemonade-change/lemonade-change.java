class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f_dollars = 0, t_dollars = 0;
        for(int x : bills)
        {
            if(x==5){
                f_dollars++;
            }else if (x == 10){
                if(f_dollars > 0){
                    f_dollars--;
                    t_dollars++;
                }
                else{
                    return false;
                }
            }else {
                if(f_dollars > 0 && t_dollars > 0)
                {
                    f_dollars--;
                    t_dollars--;
                }else if(f_dollars > 2){
                    f_dollars -= 3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}