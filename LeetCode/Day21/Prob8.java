package LeetCode.Day21;

public class Prob8 {
    public static int pivotInteger(int n){
        double x = Math.sqrt(n * (n+1)/2);
        System.out.println(x);
        if(x % 1 != 0) return -1;
        return (int)x;
    }
    public static void main(String[] args) {
       int num = 8;
       System.out.println(pivotInteger(num)); 
    }   
}
