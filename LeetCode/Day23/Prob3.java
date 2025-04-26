package LeetCode.Day23;

public class Prob3 {
    public static int countDigits(int num) {
        int n = num;
        int c = 0;
        while(num > 0){
            int d = num % 10;
            if(d != 0 && n % d == 0) {
                c++;
            }
            num = num / 10;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(countDigits(1248));
    }
}
