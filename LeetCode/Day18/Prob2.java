package LeetCode.Day18;

import java.util.HashSet;
import java.util.Set;

public class Prob2 {
    public static int numJewelsInStones(String jewels, String stones) {
        int res = 0;
        Set<Character> set = new HashSet<>();
        for(char j : jewels.toCharArray()){
            set.add(j);
        }
        for(char s : stones.toCharArray()){
            if(set.contains(s)) res++;
        }
        return res;
    }
    public static void main(String[] args) {
        String str1 = "aA";
        String str2 = "aAAbbbb";
        System.out.println(numJewelsInStones(str1, str2));
    }
}
