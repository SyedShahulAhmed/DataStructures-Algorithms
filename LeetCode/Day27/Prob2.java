package LeetCode.Day27;

public class Prob2 {
     public static void print(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static int[] mul(int arr[],int mul){
        int min = 9999;
        int idx = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
                idx = i;
            }
        }
        arr[idx] = arr[idx] * mul;
        return arr;
    }
    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        while (k > 0) {
            mul(nums, multiplier);
            k--;
        }
        return nums;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,3,5,6};
        print(getFinalState(arr, 5, 2));
    }
}
