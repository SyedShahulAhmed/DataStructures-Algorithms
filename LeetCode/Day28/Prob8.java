package LeetCode.Day28;

public class Prob8 {
    public static int numOfStrings(String[] patterns, String word) {
        int c = 0;
        for(String p : patterns){
            if(word.contains(p)) c++;
        }
        return c;
    }
    public static void main(String[] args) {
        String s[] = {"a","abc","bc","d"};
        String w = "abc";
        System.out.println(numOfStrings(s, w));
    }
}
