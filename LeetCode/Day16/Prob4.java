package LeetCode.Day16;

import java.util.*;

public class Prob4 {
    public static void print(int nums[]){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println(" ");
    }
    public static int[] Intersect(int nums1[], int nums2[]){
       Set<Integer> set = new HashSet<>();
       Set<Integer> res = new HashSet<>();
       for(int num : nums1){
            set.add(num);
       }
       for(int  num : nums2){
            if(set.contains(num)){
                res.add(num);
            }
       }
       int result[] = new int[res.size()];
       int j = 0;
       for(int num : res){
        result[j++] = num;
       }
       return result;
    }
    public static void main(String[] args) {
        int nums1[] = {4,9,5}; 
        int nums2[] = {9,4,9,8,4}; 
        print(Intersect(nums1, nums2));
    }
}
