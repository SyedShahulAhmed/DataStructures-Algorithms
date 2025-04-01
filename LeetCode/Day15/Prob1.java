package LeetCode.Day15;

public class Prob1 {
    public static void printArr(int nums[]){
        for(int i =0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println(" ");
    }
    public static int RemoveElement(int nums[], int val){
        int res[] = new int[nums.length];
        int k = 0;
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                res[j++] = nums[i]; 
                k++;
            }
        }
        printArr(res);
        return k;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,2,3,0,4,2};
        System.out.println(RemoveElement(arr, 2));
    }
}
