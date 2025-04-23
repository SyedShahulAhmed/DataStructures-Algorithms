package LeetCode.Day21;

public class Prob6 {
    public static int countMaxOrSubsets(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            int m = max | nums[i];
            if(m > max){
                max = m;
            }
        }
        int d = max - 1;
        if(d == 1) {
            int m = 2 * n;
            return m + 1;
        }
        return d;
    }
    public static void main(String[] args) {
        int n[] = {2,2,2};
        System.out.println(countMaxOrSubsets(n));
    }
}
