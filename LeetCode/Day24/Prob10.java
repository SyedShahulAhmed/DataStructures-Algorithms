package LeetCode.Day24;

public class Prob10 {
    public static boolean Count(int n){
        int c = 0;
        while(n > 0){
            c++;
            n = n/10;
        }
        if(c % 2 == 0) return true;
        return false;

    }
    public static int findNumbers(int[] nums) {
        int c = 0;
        for(int i : nums){
            if(Count(i)) c++;
        }
        return c;
    }
    public static void main(String[] args) {
        int arr[] = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
}
