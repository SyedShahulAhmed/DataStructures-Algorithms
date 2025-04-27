package LeetCode.Day23;

public class Prob4 {
    public static int differenceOfSum(int[] nums) {
        int s1 = 0,s2 = 0;
        for(int n : nums){
            s1 += n;
            while(n > 0){
                s2 += n % 10;
                n = n/10;
            }
        }
        return s1-s2;
        
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        System.out.println(differenceOfSum(arr));
    }
}
