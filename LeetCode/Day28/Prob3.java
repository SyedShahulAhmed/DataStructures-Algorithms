package LeetCode.Day28;

public class Prob3 {
    public static boolean palin(String s){
        // char c[] = s.toCharArray();
        // StringBuilder sb = new StringBuilder();
        // for(int i = c.length-1; i >= 0; i--){
        //     sb.append(c[i]);
        // }
        // if(sb.toString().equals(s)){
        //     return true;
        // }
        // return false;
        int l = 0,r = s.length() - 1;
        while(l <=r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
         return true;
    }
    public static String firstPalindrome(String[] words) {
        for(String s : words){
            if(palin(s)) {
                return s;
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String s[] = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(s));

    }
}
