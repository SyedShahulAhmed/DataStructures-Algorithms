package LeetCode.Day17;

public class Prob2 {
    public static void printArr(int nums[]){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println(" ");
    }
    public static int[] buildArray(int[] nums) {
        int res[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            res[i] = nums[nums[i]];
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {0,2,1,5,3,4};
        printArr(buildArray(arr));
    }
}
