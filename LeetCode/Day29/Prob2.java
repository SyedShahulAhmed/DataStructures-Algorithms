package LeetCode.Day29;


public class Prob2 {
    public static int maxProductDifference(int[] nums) {
        // Arrays.sort(nums);
        // int a = nums[0] * nums[1];
        // int b = nums[nums.length - 1] * nums[nums.length - 2];
        // return b - a;
        int m1 = Integer.MIN_VALUE, m2 = Integer.MIN_VALUE;
        int n1 = Integer.MAX_VALUE, n2 = Integer.MAX_VALUE;

        for(int num : nums){
            if(num > m1){
                m2 = m1;
                m1 = num;
            }else if(num > m2){
                m2 = num;
            }
            if(num < n1){
                n2 = n1;
                n1 = num;
            }else if(num < n2){
                n2 = num;
            }
        }
        return (m1 * m2) - (n1 * n2);
    }
    public static void main(String[] args) {
        int arr[] = {5,6,2,7,4};
        System.out.println(maxProductDifference(arr));
    }
}
