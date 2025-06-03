package LeetCode.Day30;

public class Prob11 {
    public static int minSteps(String s, String t) {
       int c = 0;
       for(int i = 0 ; i < s.length(); i++){
        if(s.charAt(i) != t.charAt(i)){
            c++;
        }
       }
       return c; 
    }
    public static void main(String[] args) {
        System.out.println(minSteps("bab", "aba"));
    }
}
