package LeetCode.Day2;

import java.util.HashSet;

public class ReapeatedChar {
    public static char repeatedCharacter(String s) {
        HashSet<Character> hc = new HashSet<>();
        char arr[] = s.toCharArray();
        for(char n : arr){
            if(hc.contains(n)){
                return n;
            }else{
                hc.add(n);
                System.out.println(n);
            }
        }
        return '0';
    }
    public static void main(String[] args) {
        String s= "eesll";
        System.out.println(repeatedCharacter(s));
    }
}
