package LeetCode.Day24;

import java.util.Stack;

public class Prob4 {
    public static String removeDuplicates(String str) {
        Stack<Character> s = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            if(!s.isEmpty() && s.peek() == c){
                s.pop();
            }else{
                s.push(c);
            }
        }
        for(char i : s){
            sb.append(i);
        }
        return new String(sb);

    }
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
}
