package LeetCode.Day12;

public class Harmonious {
    public static int LHS(int nums[]){
        int curr = 0;
        for(int i = 0; i < 2; i++){
            curr -= nums[i];
        }
        int count = 0;
        for(int i = 1; i <= nums.length - 2; i++){
            int nextcurr = Math.abs(curr - nums[i - 1] + nums[i+2-1]);
            if(curr + nextcurr == 1 || curr - nextcurr == -1){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,2,2,5,2,3,7};
        System.out.println(LHS(arr));
    }
}