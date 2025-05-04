package LeetCode.Day25;

public class Prob3 {

    public static int addDigits(int num) {
        // int rev = 0;
        // while(num > 0){
        //     int d = num % 10;
        //     rev = (rev*10) + d;
        //     num = num/10;
        // }
        // return rev;
        if(num == 0) return 0;
        return (num % 9 == 0) ? 9 : num%9;
    }
    public static void main(String[] args) {
        System.out.println(addDigits(40));
    }
}