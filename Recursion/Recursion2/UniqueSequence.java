package Recursion.Recursion2;

import java.util.HashSet;

public class UniqueSequence {
    public static void Sequence(String s, int idx, String res, HashSet<String> str){
        if(idx == s.length()){
            if(str.contains(res)){
                return;
            }else{
                System.out.println(res);
                str.add(res);
            }
            return;
        }
        char curchar = s.charAt(idx);
        Sequence(s, idx+1, res + curchar,str);
        Sequence(s, idx+1, res,str);
    }
    public static void main(String[] args) {
        String s = "aaa";
        HashSet<String> st = new HashSet<>();
        Sequence(s, 0, "", st);
    }
}
