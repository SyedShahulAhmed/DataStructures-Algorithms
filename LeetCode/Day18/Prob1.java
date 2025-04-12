package LeetCode.Day18;

public class Prob1 {
    public static int sumOfMultiples(int n) {
        int p=0;
        for(int i=1;i<=n;i++){
            if(i%3==0 || i%5==0 ||i%7==0){
               p+=i;
            }
        }
        return p;
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(sumOfMultiples(n));
    }
}