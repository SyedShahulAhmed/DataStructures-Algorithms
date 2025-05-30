package LeetCode.Day30;

import java.util.HashSet;
import java.util.Set;

public class Prob3 {
    public static String rev(String s){
        char c[] = s.toCharArray();
        int l = 0;
        int r = s.length() - 1;
        while(l <= r){
            char temp = c[l];
            c[l] = c[r];
            c[r] = temp;
            l++;
            r--;
        }
        return new String(c);
    }
    public static int maximumNumberOfStringPairs(String[] words) {
        int c = 0;
        Set<String> set = new HashSet<>();
        for(String s : words){
            if(set.contains(rev(s))){
                c++;
            }else{
                set.add(s);
            }
        }
        return c;
       
    }
    public static void main(String[] args) {
        String s[] = {"cd","ac","dc","ca","zz"};
        System.out.println(maximumNumberOfStringPairs(s));
    }
}
