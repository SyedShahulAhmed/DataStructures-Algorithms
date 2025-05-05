package LeetCode.Day25;

public class Prob4 {
    public static int alternateDigitSum(int n) {
        String s = Integer.toString(n);
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            int d = s.charAt(i) - '0';
            if(i % 2 == 0){
                sum += d;
            }else{
                sum -= d;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(alternateDigitSum(10));
    }
}
