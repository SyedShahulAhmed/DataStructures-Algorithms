package LeetCode.Day16;

public class Prob2 {
    public static int searchpos(int nums[],int tar){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= tar){
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,7};
        System.out.println(searchpos(arr, 2));
        System.out.println(searchpos(arr, 5));
    }
}