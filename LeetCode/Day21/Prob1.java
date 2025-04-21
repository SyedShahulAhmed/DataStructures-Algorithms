package LeetCode.Day21;

import java.util.HashMap;

public class Prob1 {
    public static int lengthOfLongestSubstring(String s) {
       HashMap<Character,Integer> map = new HashMap<>();
       int len = 0;
       int start = 0;
       for(int i = 0; i < s.length() - 1; i++){
        char c = s.charAt(i);
        if(map.containsKey(c)){
            start = Math.max(map.get(c) + 1,start);
            System.out.println("Iteration " + i + "= " + start);
        }
        map.put(c,i);
        System.out.println("Iteration of Len " + i + "= " + map);
        len = Math.max(len, i - start + 1);
        System.out.println("Iteration of Len " + i + "= " + len);
       }
       return len;
    }
    public static void main(String[] args) {
        String s = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}