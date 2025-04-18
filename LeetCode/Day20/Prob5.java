package LeetCode.Day20;

import java.util.Arrays;

public class Prob5 {
    public static void print(int nums[]){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println(" ");
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0,j=m; i < n;  i++){
            nums1[j++] = nums2[i];
        }
        Arrays.sort(nums1);
        print(nums1);

    }
    public static void main(String[] args) {
        int n1[] = {1,2,3,0,0,0};
        int n2[] = {2,5,6};
        merge(n1, 3, n2, 3);
    }
}