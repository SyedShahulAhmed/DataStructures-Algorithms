package LeetCode.Day17;

public class Prob4 {
    public static int numIdenticalPairs(int[] nums) {
        int c = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j] && i > j){
                    c++;
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));
    }
}
