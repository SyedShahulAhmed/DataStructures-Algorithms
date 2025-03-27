package LeetCode.Day14;

public class HappyNum {
    public static boolean Happy(int num){
        int r = 1;
        int sum = 0;
        while(num > 9){
            while(num > 0){
                r = num % 10;
                sum = sum + (r*r);
                num = num/10;
            }
            num = sum;
            sum = 0;
        }
        if(num == 1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 1111111;
        System.out.println(Happy(n));
    }
}
