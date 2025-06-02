package LeetCode.Day30;

import java.util.ArrayList;
import java.util.List;

public class Prob10 {
    public static List<String> validStrings(int n) {
        List<String> res = new ArrayList<>();
        gen(n, "", res);
        return res;
    }
    public static void gen(int n, String cur, List<String> s){
        if(cur.length() == n){
            s.add(cur);
            return;
        }
        gen(n, cur+"1", s);
        if(cur.isEmpty() || cur.charAt(cur.length()-1) != '0'){
            gen(n,cur+ "0", s);
        }
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(validStrings(n));
    }
}
