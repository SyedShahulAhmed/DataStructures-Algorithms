package LeetCode.Day6;

public class PalindromeInt {
    public static int rev(int n) {
        int rev = 0;
        int sign = (n > 0) ? 1 : -1;
        int num = Math.abs(n);
        while (num > 0) {
            int lastdigit = num % 10;
            System.out.println(lastdigit);
            rev = (rev * 10) + lastdigit;
            System.out.println(rev);
            num = num / 10;
            System.out.println(n);
        }
        rev = rev * sign;
        return rev;
    }

    public static boolean Palin(int a) {
        if (a == rev(a)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int a = 121;
        System.out.println(Palin(a));
    }
}
