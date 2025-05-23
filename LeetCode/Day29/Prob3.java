package LeetCode.Day29;

public class Prob3 {
    public static int sumOfSquares(int[] nums) {
        int sum = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(nums.length % (i+1) == 0){
                sum += nums[i] * nums[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(sumOfSquares(arr));
    }
}
