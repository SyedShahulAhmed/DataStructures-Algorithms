package LeetCode.Day17;

public class Prob6 {
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i = 0; i < accounts.length; i++){
           int sum = 0;
           for(int j = 0; j < accounts[i].length; j++){
                sum += accounts[i][j];
           }
           max = Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(arr));
    }
}
