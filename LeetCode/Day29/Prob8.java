package LeetCode.Day29;

import java.util.Arrays;

public class Prob8 {
    public static void print(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static double minimumAverage(int[] nums) {
        double d = 0;
        int n = nums.length;
        Arrays.sort(nums);
        print(nums);
        d= (nums[(n/2) - 1] + Math.ceil(nums[n/2]))/2;
        System.out.println(nums[(n/2) - 1]);
        System.out.println(nums[n/2]);
        return d;
    }
    public static void main(String[] args) {
        int arr[] = {1,9,8,3,10,5};
        System.out.println(minimumAverage(arr));
    }
}
