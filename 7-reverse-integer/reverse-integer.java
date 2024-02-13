class Solution {
    public int reverse(int x) 
    {
        int rev_num = 0;
        while (x != 0) {
            // Check for overflow before updating rev_num
            if (rev_num > Integer.MAX_VALUE / 10 || (rev_num == Integer.MAX_VALUE / 10 && x % 10 > 7)) {
                return 0;
            }
            if (rev_num < Integer.MIN_VALUE / 10 || (rev_num == Integer.MIN_VALUE / 10 && x % 10 < -8)) {
                return 0;
            }

            rev_num = rev_num * 10 + x % 10;
            x = x / 10;
        }
        return rev_num;
    }
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        System.out.println("Reversed number is :"+s.reverse(a));
    }
}