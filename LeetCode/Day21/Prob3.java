package LeetCode.Day21;

public class Prob3 {
    public static int countConsistentStrings(String allowed, String[] words) {
        int ct = 0;
        for(String s : words){
           boolean valid = true;

           for(char c : s.toCharArray()){
            if(allowed.indexOf(c) == - 1){
                valid = false;
                break;
            }
           }
           if(valid) ct++;
        }
        return ct;
    }
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings(allowed, words));
    }
}
