package LeetCode.Day17;

public class Prob1 {
    public static void printArr(int nums[]){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println(" ");
    }
    public static int[] getConcatenation(int[] nums) {
        int res[] = new int[nums.length*2];
        for(int i = 0;  i < nums.length; i++){
            res[i] = nums[i];
            res[i+nums.length] = nums[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        printArr(getConcatenation(arr)); 
    }
}
