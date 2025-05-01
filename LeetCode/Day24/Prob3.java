package LeetCode.Day24;

import java.util.Stack;

public class Prob3 {
    public static String clearDigits(String str) {
        
        Stack<Character> s = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
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
        String s = "abc";
        System.out.println(clearDigits(s));
    }
}
