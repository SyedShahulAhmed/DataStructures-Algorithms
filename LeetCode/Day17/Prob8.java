package LeetCode.Day17;


public class Prob8 {
    public static int minimumOperations(int[] nums) {
        int c = 0;
        for(int i =0; i< nums.length; i++){
            if(nums[i] % 3 != 0){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(minimumOperations(arr));
    }
}
