package LeetCode.Day23;

public class Prob1 {
    public static int xorOperation(int n, int start) {
        int r = 0;
        for(int i = 0; i< n; i++){
            r = r ^ (start + 2 * i);
        }
        return r;
    }
    public static void main(String[] args) {
        int n = 5,s = 0;
        System.out.println(xorOperation(n, s));
    }
}
