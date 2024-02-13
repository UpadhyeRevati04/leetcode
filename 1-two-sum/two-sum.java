import java.util.*;
class Solution {
    static public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String ar[])
    {
        int target;
        int[] nums = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array elemenst : ");
        for(int i=0;i<=nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter target element : ");
        target = sc.nextInt();
        int[] result = twoSum(nums,target);
        for(int i=0;i<=result.length;i++)
        {
            System.out.println(result[i]);
        }
    }
}
