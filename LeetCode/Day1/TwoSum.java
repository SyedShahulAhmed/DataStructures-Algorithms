package LeetCode.Day1;

public class TwoSum {
    public static int[] Twosum(int arr[], int target){
        for(int i = 0; i < arr.length -1 ; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        for(int n : Twosum(arr, 15)){
            System.out.print(n + " ");
        }
    }
}
