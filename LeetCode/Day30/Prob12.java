package LeetCode.Day30;


public class Prob12 {
    public static boolean isBalanced(String num) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < num.length(); i++) {
            if(i % 2 == 0){
                sum1 += num.charAt(i) - '0';
            }else{
                sum2 += num.charAt(i) - '0';
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
        return sum1 == sum2;
    }
    public static void main(String[] args) {
        String s = "24123";
        System.out.println(isBalanced(s));
    }
}
