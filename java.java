package A;

import java.util.Scanner;

public class java
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("你要输入多少数字？");
        int n = in.nextInt();
        System.out.println("请输入");
        int[] nums = new int[n];
        for(int o=0;o<nums.length;o++)
        {
            nums[o]=in.nextInt();
        }
        System.out.println("请输入目标值");
        int target = in.nextInt();
        for(int i=0;i<nums.length;i++)
        {
            for(int h=1;h<nums.length;h++)
            {
                if (nums[i]+nums[h]==target)
                {
                System.out.println(i+","+h);
                }
            }
        }
    }
}

