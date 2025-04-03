package LeetCode.Day15;

public class Prob4 {

    public static String rev(String s){
        char ch[] = s.toCharArray(); 
        int l = 0, r = s.length() - 1;

        while (l < r) {
            // Swap characters
            char temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;
            l++;
            r--;
        }
        return new String(ch);
    }
    public static String revStr(String s){
        String w[] = s.split(" "); 
        String res = ""; 

        for (int i = 0; i < w.length; i++) {
            res += rev(w[i]); // Reverse each word
            if (i < w.length - 1) {
                res += " "; // Add space between words
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(revStr(s)); 
    }
}
