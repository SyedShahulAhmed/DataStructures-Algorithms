package LeetCode.Day23;

public class Prob9 {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if(word1.length != word2.length) return false;
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(int i = 0; i< word1.length; i++){
            s1.append(word1[i]);
            s2.append(word2[i]);
        }
        return s1.toString().equals(s2.toString());
    }
    public static void main(String[] args) {
        String s1[] = {"ab", "c"};
        String s2[] = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(s1, s2));
    }
}
