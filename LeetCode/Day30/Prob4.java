package LeetCode.Day30;

public class Prob4 {
    public static int smallestIndex(int[] nums) {
        int idx = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums[i]) {
                idx = Math.min(idx, i);
            }
        }
        return (idx == Integer.MAX_VALUE) ? -1 : idx;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2 };
        System.out.println(smallestIndex(arr));
    }
}
