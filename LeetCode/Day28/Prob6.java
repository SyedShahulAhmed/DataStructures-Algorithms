package LeetCode.Day28;

public class Prob6 {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0,j = 0;
        int n1 = word1.length(), n2 = word2.length();

        while(i < n1 || j < n2){
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s1 = "abc"; 
        String s2 = "pqr";
        System.out.println(mergeAlternately(s1, s2)); 
    }
}
