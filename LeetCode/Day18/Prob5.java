package LeetCode.Day18;

public class Prob5 {
    public static void printArr(int arr[]){
        for(int n : arr){
            System.out.print(n + " ");
        }
        System.out.println(" ");
    }
    public static int[] shuffle(int[] nums, int n) {
        int res[] = new int[n * 2];
        for(int i = 0; i< n; i++){
            res[2 * i] = nums[i];
            res[2 * i + 1] = nums[n+i]; 
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,1,3,4,7};
        printArr(shuffle(arr, 3));
    }
}
