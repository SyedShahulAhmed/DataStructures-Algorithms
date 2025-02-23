package LeetCode.Day7;

public class DominantIndex {
    // public static int max(int nums[]){
    //     int maxVal = nums[0];
    //     for(int i = 0; i < nums.length ; i++){
    //         if(maxVal < nums[i]){
    //             maxVal = nums[i];
    //         }
    //     }
    //     return maxVal; 
    // }
    // public static int sum(int nums[]){
    //     int sum = 0;
    //     for(int i = 0; i < nums.length ; i++){
    //         sum += nums[i];
    //     }
    //     return sum;
    // }
    // public static int Index(int nums[], int val){
    //     for(int i = 0; i < nums.length ; i++){
    //         if(nums[i] == val){
    //             return i;
    //         }
    //     }
    //     return -1;

    // }
    // public static int dominantIndex(int nums[]){
    //     if(max(nums) >= 2 * sum(nums)/2){
    //         return Index(nums, max(nums));
    //     }
    //     return -1;
    // }
    // public static void main(String[] args) {
    //     int nums[] = {0,0,2,3};
    //     int nums2[] = {3,6,1,0};
    //     System.out.println("Max is " + max(nums));
    //     System.out.println("Sum is " + sum(nums));
    //     System.out.println(dominantIndex(nums));
    //     System.out.println("Max is " + max(nums2));
    //     System.out.println("Sum is " + sum(nums2));
    //     System.out.println(dominantIndex(nums2));
    // }
    public static int First(int nums[]){
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        return max;
    }
    public static int Second(int[] nums) {
        int max = 0, secondMax = 0;
        for (int num : nums) {
            if (num > max) {  
                secondMax = max;  
                max = num;  
            } else if (num > secondMax && num < max) {  
                secondMax = num;  
            }
        }
        return secondMax;
    }    
    public static int Index(int nums[], int val){
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] == val){
                return i;
            }
        }
        return -1;
    }
    public static int Dom(int nums[]){
        if(First(nums) >= 2 * Second(nums)){
            return Index(nums, First(nums));
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {3,6,1,0};
        System.out.println(First(nums));
        System.out.println(Second(nums));
        System.out.println(Dom(nums));
    }
}
