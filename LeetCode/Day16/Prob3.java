package LeetCode.Day16;

public class Prob3 {
    public static int Stock(int nums[]){
        int min = nums[0];
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }else{
                int p = nums[i] - min;
                if(max < p){
                    max = p;
                }
            }
            
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(Stock(arr));
    }
}
