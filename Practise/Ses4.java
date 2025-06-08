package Practise;

public class Ses4 {
    public static int sum(int n){
        int s = 0;
        if (n == 0) {
            return s;
        }
        return n + sum(n - 1);
    }
    public static int  fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * fact(n - 1);
    }
    public static int reverse(int n,int s){
        if(n == 0){
            return s;
        }
        int d = n % 10;
        s = s * 10 + d;
        return reverse(n/10, s);
    }
    public static int sumOf(int n,int res){
        if(n == 0){
            return res;
        }
        int l = n % 10;
        return l + sumOf(n/10, res);
    }
    public static int Count(int n, int c){
        if(n == 0){
            return c;
        }
        int count = n % 10;
        if(count > 0) c++;
        return Count(n/10, c);
    }
    public static void main(String[] args) {
    System.out.println(sum(10));
    System.out.println(sum(4));
    System.out.println(fact(5));
    System.out.println(reverse(574,0));
    System.out.println(sumOf(12345, 0));
    System.out.println(Count(1234, 0));
    }
}
