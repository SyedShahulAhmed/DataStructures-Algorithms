package LeetCode.Day24;

public class Prob7 {
    public static boolean canAliceWin(int[] nums) {
        int l = 0;
        int s= 0;
        int t = 0;
        for(int i : nums){
            t+= i;
            if(i >= 10){
                l += i;
            }else{
                s += i;
            }
        }
        if(s > (t - s)) return true;
        if(l > (t - l)) return true;
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {5,5};
        System.out.println(canAliceWin(arr));
    }
}
