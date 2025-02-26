package LeetCode.Day9;

import java.util.HashMap;

public class EqualOccurence {
    public static boolean Occur(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char n : s.toCharArray()){
            map.put(n,map.getOrDefault(n, 0)+1);
        }
        int tar = map.get(s.charAt(0));
        for(int n : map.values()){
            if(n != tar){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String s = "aabbccd";
        System.out.println(Occur(s));
    }
}
