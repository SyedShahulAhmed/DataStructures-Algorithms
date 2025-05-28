package LeetCode.Day29;


import java.util.*;

public class Prob10 {
     public static void print(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Set<Integer> s= new HashSet<>();
        Set<Integer> nums= new HashSet<>();
        for(int i : nums1){
            s.add(i);
        }
        for(int i : nums2){
            if(s.contains(i)) {
                nums.add(i);
            }
        }
        int res[] = new int[nums.size()];
        int idx = 0;
        for(int i : nums){
            res[idx++] = i;
        }
        return res;

    }
    public static void main(String[] args) {
        int a1[] = {4,9,5};
        int a2[] = {9,4,9,8,4};
        print(intersect(a1, a2));
    }
}
