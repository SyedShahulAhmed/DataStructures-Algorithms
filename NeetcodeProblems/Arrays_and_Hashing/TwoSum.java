package NeetcodeProblems.Arrays_and_Hashing;

public class TwoSum {
    public static int[] Twosum(int arr[],int target){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[] = {5,7,3,4,5,2,7,9,4,2};
        int[] ans = Twosum(arr, 9);
        System.out.println("The Indices are ["+ans[0]+","+ans[1]+"]");
    }
}
