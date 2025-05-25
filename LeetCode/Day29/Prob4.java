package LeetCode.Day29;

import java.util.*;

public class Prob4 {
    public static String kthDistinct(String[] arr, int k) {
        List<String> li = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();

        for(String s : arr){
            map.put(s, map.getOrDefault(s,0)+1);
        }
        for(String s : arr){
            if(map.get(s) == 1){
                li.add(s);
            }
        }
        return k<= li.size() ? li.get(k-1) : "";

    }   
    public static void main(String[] args) {
        String sr[] = {"d","b","c","b","c","a"};
        String sr1[] = {"aaa","aa","a"};
        System.out.println(kthDistinct(sr, 1));
        System.out.println(kthDistinct(sr1, 2));
    }
}
