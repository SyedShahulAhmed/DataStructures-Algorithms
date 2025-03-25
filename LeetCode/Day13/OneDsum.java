package LeetCode.Day13;

public class OneDsum {
    public static int[] sum(int nums[]){
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }
    public static void printArr(int nums[]){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,0,-2,-3,1};
        printArr(sum(arr));
    }
}
