package Recursion;


public class Level1 {
    public static void PrintNum(int n){
        // if(n == 0){
        //     return;
        // }
        // System.out.println(n);
        // PrintNum(n-1);
        if(n == 6){
            return;
        }
        System.out.println(n);
        PrintNum(n+1);
    }
    //Sum of n natural numbers

    public static void PrintSum(int n, int i, int sum){
        if(i == n){
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum += i;
        PrintSum(n, i+1, sum);
    }
    public static int Sum(int n){
        if(n == 0){
            return 0;
        }
        return n + Sum(n-1);
    }

    //Factorial

    public static int Factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int fact = n * Factorial(n-1);
        return fact;
    }

    //Fibonacci Sequence 

    public static void Fibonnaci(int n1,int n2, int n){
        if(n == 0 ){
            return;
        }
        int n3 = n1 + n2;
        System.out.println(n3);
        Fibonnaci(n2, n3, n-1);
    }
    public static int Power(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        int ans = x*Power(x,n-1);
        return ans;
    }

    //logn

    public static int LogPower(int x, int n){
        if(x == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n%2 == 0){
            return LogPower(x, n/2) * LogPower(x, n/2);
        }else{
            return LogPower(x, n/2) * LogPower(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        int n = 1;
        int m = 10;
        PrintNum(n);
        PrintSum(m, 1, 0);
        System.out.println(Sum(m));
        System.out.println(Factorial(5));
        int n1 = 0;
        int n2 = 1;
        int num = 5;
        System.out.println(n1);
        System.out.println(n2);
        Fibonnaci(n1, n2, num-2);
        System.out.println(Power(2, 5));
        System.out.println(LogPower(2, 5));
    }
}