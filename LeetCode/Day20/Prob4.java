package LeetCode.Day20;

import java.util.Stack;

public class Prob4 {
    public static boolean parenthesis(String str){
        Stack<Character> s = new Stack<>();
        for(char c : str.toCharArray()){
            if(c == '('){
                s.push(')');
            }else if(c == '{'){
                s.push('}');
            }else if(c == '['){
                s.push(']');
            }else if(s.isEmpty() || s.pop() != c){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "({}[])";
        System.out.println(parenthesis(s));
    }
}