package LeetCode.Day29;

import java.util.Arrays;

public class Prob7 {
    public static void print(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i< nums.length; i++){
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
            i++;
        }
        return nums;
    }
    public static void main(String[] args) {
        int arr[] = {5,4,2,3};
        print(numberGame(arr));
    }
}
