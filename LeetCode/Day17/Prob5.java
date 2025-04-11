package LeetCode.Day17;

import java.util.Arrays;

public class Prob5 {
    public static void printArr(int nums[]){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println(" ");
    }
    public static int[] transformArray(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                nums[i] = 0;
            }else{
                nums[i] = 1;
            }
        }
        Arrays.sort(nums);
        return nums;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,1};
        printArr(transformArray(arr));
    }
}