package LeetCode.Day30;

public class Prob5 {
    public static void print(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    public static int[] sortArrayByParity(int[] nums) {
        // int res[] = new int[nums.length];
        // int l = 0;
        // int r = nums.length - 1;
        // for (int i : nums) {
        //     if (i % 2 == 0) {
        //         res[l] = i;
        //         l++;
        //     } else {
        //         res[r] = i;
        //         r--;
        //     }
        // }
        // return res;
        int r = nums.length - 1;
        for(int i = 0; i < nums.length / 2; i++){
                int temp = nums[i];
                nums[i] = nums[r];
                nums[r] = temp;
                r--; 
        }
        return nums;
    }

    public static void main(String[] args) {
        int arr[] = {3,1,2,4};
        print(sortArrayByParity(arr));
    }
}