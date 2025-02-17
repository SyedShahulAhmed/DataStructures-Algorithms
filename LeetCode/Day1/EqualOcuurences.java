package LeetCode.Day1;

import java.util.Arrays;

public class EqualOcuurences {
    public static boolean equalOccurrences(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        System.out.println(c);
        int count = 1, prev = 0;
        
        for (int i = 1; i < c.length; i++) {
            if (c[i] == c[i - 1]) {
                count++;
            } else {
                if (prev != 0 && prev != count) {
                    return false;
                }
                prev = count;
                count = 1;
            }
        }
        return true;
    }
       public static void main(String[] args) {
        String s = "aaabb";
        System.out.println(equalOccurrences(s));
    }
}
