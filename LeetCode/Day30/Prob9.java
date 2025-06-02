package LeetCode.Day30;

public class Prob9 {
    public static String removeTrailingZeros(String num) {
    StringBuilder s = new StringBuilder(num);
    while (s.length() > 0 && s.charAt(s.length() - 1) == '0') {
        s.deleteCharAt(s.length() - 1);
    }
    return s.toString();
    }
    public static void main(String[] args) {
        String n = "51230100";
        System.out.println(removeTrailingZeros(n));
    }
}
