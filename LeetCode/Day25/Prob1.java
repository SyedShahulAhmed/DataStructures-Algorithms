package LeetCode.Day25;

public class Prob1 {
    public static int min(int n[]){
        int min = 99999;
        for(int i : n){
            if(i < min){
                min = i;
            }
        }
        return min;
    }
    public static int max(int n[]){
        int max = 0;
        for(int i : n){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
    public static int findGCD(int[] nums) {
        int a = min(nums);
        int b = max(nums);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,6,9,10};
        System.out.println(findGCD(arr));
    }
}
