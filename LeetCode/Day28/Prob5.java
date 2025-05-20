package LeetCode.Day28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prob5 {
    public static boolean isAcronym(List<String> words, String s) {
       if (s.length() != words.size()) return false;

    for (int i = 0; i < words.size(); i++) {
        if (s.charAt(i) != words.get(i).charAt(0)) {
            return false;
        }
}
    return true;

    }
    public static void main(String[] args) {
        List<String> s = new ArrayList<>(Arrays.asList("an","apple"));
        String a = "a";
        System.out.println(isAcronym(s, a));
    }
}
