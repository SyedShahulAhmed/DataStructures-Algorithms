package LeetCode.Day27;

public class Prob5 {
    public static void print(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static int[] decompressRLElist(int[] nums) {
        int len = 0;
        for(int i = 0; i < nums.length; i += 2){
            len += nums[i];
        }
        int res[] = new int[len];
        int idx = 0;
        for(int i = 0 ; i < nums.length ; i+= 2){
            int a = nums[i];
            int b = nums[i + 1];
            for(int j = 0; j < a; j++){
                res[idx++] = b;
            }
        }
        return res; 
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        print(decompressRLElist(arr));
    }
}
