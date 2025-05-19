package LeetCode.Day28;

public class Prob1 {
    public static int prefixCount(String[] words, String pref) {
        int c = 0;
        for(String s : words){
            if(s.startsWith(pref)){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        String w[] = {"pay","attention","practice","attend"};
        String p = "at";
        System.out.println(prefixCount(w, p));
    }
}
