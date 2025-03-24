package LeetCode.Day12;

public class MaxAvg {
    public static double findMaxAverage(int[] nums, int k) {
        int curr = 0;
        for(int i = 0; i < k; i++){
            curr += nums[i];
        }
        double max = curr;
        for(int i = 1; i <= nums.length - k; i++){
            curr = curr - nums[i-1] + nums[i+k-1];
            max = Math.max(max,curr);
        }
        return max/k;
    }
    public static void main(String[] args) {
        int arr[] = {3,3,4,3,0};
        System.out.println(findMaxAverage(arr,3));
    }
}
