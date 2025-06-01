package LeetCode.Day30;

import java.util.ArrayList;
import java.util.Arrays;

public class Prob8 {
    public static boolean halvesAreAlike(String s) {
        int v = 0;
        int n = s.length();
        ArrayList<Character> li = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for (int i = 0; i < n / 2; i++) {
            if (li.contains(s.charAt(i))) v++;
            if (li.contains(s.charAt(i + n / 2))) v--;
        }

    return v == 0;
    }
    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(halvesAreAlike(s));
    }
}
