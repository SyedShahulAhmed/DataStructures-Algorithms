package LeetCode.Day30;

// import java.util.Arrays;

public class Prob6 {
 
    public static int addedInteger(int[] nums1, int[] nums2) {
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums1.length; i++){
            min1 = Math.min(min1, nums1[i]);
            min2 = Math.min(min2, nums2[i]);
        }
        return min2 - min1;
    }
    public static void main(String[] args) {
        int a[] = {10};
        int b[] = {5};
        System.out.println(addedInteger(a, b));
    }
}