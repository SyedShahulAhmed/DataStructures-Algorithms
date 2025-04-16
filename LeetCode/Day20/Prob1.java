package LeetCode.Day20;

import java.util.*;

public class Prob1 {
    public static int countKDifference(int[] nums, int k) {
        // int c = 0;
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         int diff = Math.abs(nums[i] - nums[j]);
        //         if(diff == k) {
        //             c++;
        //         }
        //     }
        // }
        // return c;
        Set<Integer> set = new HashSet<>();
        int c= 0;
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i] - k)){
                c++;
            }
            if(set.contains(k+ nums[i])){
                c++;
            }
            set.add(nums[i]);
            
        }
        return c;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,1,4,5};
        int k = 2;
        System.out.println(countKDifference(arr, k));
    }
}