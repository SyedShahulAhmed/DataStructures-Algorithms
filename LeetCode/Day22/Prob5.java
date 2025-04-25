package LeetCode.Day22;

public class Prob5 {
    public static void printArr(int n[]){
        for(int i = 0; i < n.length; i++){
            System.out.print(n[i] + " ");
        }
        System.out.println(" ");
    }
    public static int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        if(sum < k) return sum;
        if(sum > k) return sum%k;
        if(sum % k == 0) return 0;
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,2};
        System.out.println(minOperations(arr, 6));
        
    }
}
