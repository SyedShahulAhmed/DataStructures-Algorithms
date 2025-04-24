package LeetCode.Day22;

public class Prob2 {
    public static void print(int nums[]){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println(" ");
    }
    public static int[] rearrangeArray(int[] nums) {
        int res[] = new int[nums.length];
        int p = 0,n = 1;
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] > 0){
                res[p] = nums[i];
                p = p + 2;
            }else if(nums[i] < 0){
                res[n]= nums[i];
                n = n + 2;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {3,1,-2,-5,2,-4};
        print(rearrangeArray(arr));
    }
}
