package LeetCode.Day5;

import java.util.Arrays;

public  class removeDuplicates {
    public static int remove(int[] nums) {
        if (nums.length == 0) return 0;
        
        int uniqueIndex = 0; 
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i]; 
            }
        }
        return uniqueIndex + 1; 
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int newLength = remove(nums);
        System.out.println("New Length: " + newLength);
        System.out.println("Modified Array: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}
