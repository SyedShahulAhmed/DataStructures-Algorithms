package LeetCode.Day6;

public class ReverseInteger {

    public static int Rev(int n){
        int rev = 0;
        int sign = (n > 0) ? 1 : -1;
        int num = Math.abs(n);
        while(num > 0){
            int lastdigit = num % 10;
            System.out.println(lastdigit);
            rev = (rev * 10) + lastdigit;
            System.out.println(rev);
            num = num/10;
            System.out.println(n);
        }
        rev = rev * sign;
        return rev;
    }
    public static void main(String[] args) {
        int a = -123;
        System.out.println("Og num is " + a);
        System.out.println(Rev(a));
    }
}