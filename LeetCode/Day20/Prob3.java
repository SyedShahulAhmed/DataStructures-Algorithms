package LeetCode.Day20;

public class Prob3 {
    public static int sum(int arr[]){
        int s = 0;
        for(int i = 0; i < arr.length; i++){
            s += arr[i];
        }
        return s;
    }
    public static int sumOfUnique(int[] nums) {
        int d = 0;
        for(int i = 0; i < nums.length; i++){
            d ^= nums[i];
        }
        System.out.println(d);
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == d && d != 1){
                continue;
            }else{
                sum += nums[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(sumOfUnique(arr));
    }
}
