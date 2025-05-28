package LeetCode.Day29;

public class Prob11 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int max = 0;
        for(int i : nums){
            if(i == 1){
                max = Math.max(max,++c);
            }else{
                c = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int a[] = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(a));
    }
}
