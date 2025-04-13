package LeetCode.Day18;

public class Prob8 {
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        int num = 32;
        System.out.println(isPowerOfTwo(num));
    }
}
