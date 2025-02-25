package LeetCode.Day9;

import java.util.HashMap;
import java.util.HashSet;

public class FirstUnChar {
    public static int firstUniqChar(String s) {
        // int freq[] = new int[26];
        // char c[] = s.toCharArray();
        // for(char chr : c){
        //     freq[chr - 'a']++;
        // }
        // for(int i = 0; i < c.length; i++){
        //     if(freq[c[i]-'a'] == 1){
        //         return i;
        //     }
        // }
        // return -1;
        HashMap<Character,Integer> map = new HashMap<>();
        char c[] = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for(char n : c){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        System.out.println(map);
        for(char m : c){
            if(map.get(m) == 1){
                set.add(m);
            }
        }
        System.out.println(set);
        for(int i = 0; i < c.length; i++){
            if(set.contains(c[i])){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s ="aabbcddee";
        System.out.println(firstUniqChar(s));
    }
}
