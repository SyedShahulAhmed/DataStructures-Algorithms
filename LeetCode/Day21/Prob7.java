package LeetCode.Day21;

public class Prob7 {
    public static void print(int nums[]){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println(" ");
    }
    public static int[] leftRightDifference(int[] nums) {

        int l[] = new int[nums.length];
        int r[] = new int[nums.length];
        int res[] = new int[nums.length];
        l[0]= 0;
        r[nums.length  -1 ]= 0;
        for(int i = 1; i< nums.length; i++){
            l[i] = l[i-1] + nums[i - 1];
        }
        for(int i = nums.length - 2 ; i >= 0; i--){
            r[i] = r[i + 1] + nums[i + 1];
        }
        for(int i = 0; i < nums.length; i++){
            res[i] = Math.abs(l[i] - r[i]);
        }
        return res;

    }
    public static void main(String[] args) {
        int arr[] = {10,4,8,3};
        print(leftRightDifference(arr));
    }
}