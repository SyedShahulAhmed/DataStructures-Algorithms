package LeetCode.Day17;

public class Prob3 {
    public static int subsetXORSum(int[] nums) {
        int t = 0;
        for(int i = 0; i < nums.length; i++){
            t |= nums[i];
        }
        return  t * ( 1 << nums.length - 1);
    }
    public static void main(String[] args) {
        int arr[] = {1,3};
        System.out.println(subsetXORSum(arr));
    }
}
