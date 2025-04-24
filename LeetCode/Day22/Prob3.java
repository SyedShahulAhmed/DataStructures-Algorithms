package LeetCode.Day22;

import java.util.Arrays;

public class Prob3 {
    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int l = 0,r = nums.length - 1;
        for(int i = 0; i < nums.length ; i++){
            if(nums[l] + nums[r] > max){
                max = nums[l] + nums[r];
                l++;
                r--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,4,2,4,6};
        System.out.println(minPairSum(arr));
    }
}
