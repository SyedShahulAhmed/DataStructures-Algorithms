package LeetCode.Day1;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(c1);
        System.out.println(c2);
        return Arrays.equals(c1, c2);
    }
    public static void main(String[] args) {
        String s1 = "racecar";
        String s2 = "carrace";
        System.out.println(isAnagram(s1, s2));
        String s3 = "jar";
        String s4 = "jam";
        System.out.println(isAnagram(s3, s4));
    }
}
