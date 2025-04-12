package LeetCode.Day18;

public class Prob3 {
    public static int reverseDegree(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            int pos = 'z' - s.charAt(i) + 1;
            int num = i + 1;
            sum += pos * num;
        }
        return sum;
    }
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(reverseDegree(s));
    }
}
