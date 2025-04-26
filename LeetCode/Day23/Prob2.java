package LeetCode.Day23;

public class Prob2 {
    public static int subtractProductAndSum(int n) {
        int p = 1, s= 0;
        while(n > 0){
            s += n % 10;
            p *= n % 10;
            n = n /10;
        }
        return p - s;
    }
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
}
