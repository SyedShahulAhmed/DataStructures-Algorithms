package LeetCode.Day27;

public class Prob1 {
    public static void print(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        // int res[] = new int[nums.length];
        // for(int i = 0; i < nums.length; i++){
        //     int c = 0;
        //     for(int j = 0; j < nums.length; j++){
        //         if(i != j && nums[i] > nums[j]){
        //             c++;
        //         }
        //     }
        //     res[i] = c;
        // }
        // return res;
        int count[] = new int[10];
        int res[] = new int[nums.length];
        for(int c : nums){
            count[c]++;
        }
        print(count);
        for(int i = 1; i < 10; i++){
            count[i] += count[i-1];
        }
        print(count);
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] == 0){
                res[i] = 0;
            }else{
                res[i] = count[nums[i] - 1];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {8,1,2,2,3};
        print(smallerNumbersThanCurrent(arr));
    }
}
