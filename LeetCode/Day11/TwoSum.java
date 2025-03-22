package LeetCode.Day11;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        while(s < e){
            if(nums[s] + nums[e] == target){
                return new int[]{s,e};
            }else if(nums[s] + nums[e] <= target){
                s++;
            }else{
                e--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void PrintArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int arr2[] = {-1000,-1,0,1};
        PrintArr(twoSum(arr, 9));
        System.out.println("");
        PrintArr(twoSum(arr2, 1));
    }
}
