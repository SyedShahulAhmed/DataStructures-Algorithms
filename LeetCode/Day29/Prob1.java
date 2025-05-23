package LeetCode.Day29;

public class Prob1 {
    public static int largestAltitude(int[] gain) {
        int res[] = new int[gain.length + 1];
        res[0] = 0;

        for(int i = 1; i < res.length; i++){
            res[i] = res[i-1] + gain[i -1];
        }
        int max = 0;
        for(int m : res){
            max = Math.max(max, m);
        }
        return max;
    }
    public static void main(String[] args) {
        int ar[] = {-5,1,5,0,-7};
        System.out.println(largestAltitude(ar));

    }
}
