package LeetCode.Day15;

public class Prob5 {
    public static void printArr(int nums[]){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]);
        }
    }
    public static void MoveZero(int nums[]){
        int res[] = new int[nums.length];
        int idx = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                res[idx++] = nums[i];
            }
        }
        while(idx < nums.length){
            res[idx++] = 0;
        }
        printArr(res);
    }
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        MoveZero(nums);
    }
}
