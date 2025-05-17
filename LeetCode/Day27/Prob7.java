package LeetCode.Day27;

public class Prob7 {
    public static int findPermutationDifference(String s, String t) {
        int sum = 0;
        int diff = 0;
        for(int i = 0 ; i < s.length(); i++){
            sum = Math.abs(s.indexOf(s.charAt(i)) - t.indexOf(s.charAt(i)));
            diff += sum;
        }
        return diff;
    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "bac";
        System.out.println(findPermutationDifference(s, t));
    }
}
