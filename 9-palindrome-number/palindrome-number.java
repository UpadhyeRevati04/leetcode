import java.util.*;
class Solution 
{
    int a;
    public boolean isPalindrome(int x) 
    {
        int r,sum=0,temp;
        temp = x;
        if(x < 0)
        {
            return false;
        }
        while(x > 0)
        {
            r=x%10;
            sum = (sum*10)+r;
            x = x/10;            
        }
        return temp==sum;
    }
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        System.out.println("Enter a number : ");
        s.a = sc.nextInt();
        if(s.isPalindrome(s.a))
        {
            System.out.println("The number "+s.a+" is Palindrome number");
        }
        else
        {
            System.out.println("Number" +s.a+ " is not Palindrome number");
        }
    }
}