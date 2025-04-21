package LeetCode.Day21;

public class Prob2 {
    public static void print(int nums[]){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println(" ");
    }
    public static int indexOf(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // found at index i
            }
        }
        return -1; // not found
    }
    
    public static int[] pivotArray(int[] nums, int pivot) {
        // int res[] = new int[nums.length];
        // int mid = indexOf(nums, pivot);
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] < pivot){
        //         res[i] = nums[i];
        //     }else if(nums[i] > pivot){
        //         res[mid+1] = nums[i];
        //     }
        // }
        // return res;
        int res[] = new int[nums.length];
        int idx = 0;
        for(int n : nums){
            if(n < pivot){
                res[idx++] = n;
            }
        }
        for(int n : nums){
            if(n == pivot){
                res[idx++] = n;
            }
        }
        for(int n : nums){
            if(n > pivot){
                res[idx++] = n;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {9,12,5,10,14,3,10};
        print(pivotArray(arr, 10));
    }
}
