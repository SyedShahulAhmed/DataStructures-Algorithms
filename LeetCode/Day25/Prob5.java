package LeetCode.Day25;

public class Prob5 {
    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String w : sentences){
            String words[] = w.split(" ");
            max = Math.max(max,words.length);
        }
        return max;
    }
    public static void main(String[] args) {
        String s[] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(s));
    }
}
