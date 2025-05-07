package LeetCode.Day25;

public class Prob6 {
    public static int minPartitions(String n) {
        int max = 0;
        for(int i = 0 ; i < n.length() ; i++){
            max = Math.max(max, n.charAt(i)-'0');
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(minPartitions("32"));
    }
}
