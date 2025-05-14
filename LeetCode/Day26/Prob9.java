package LeetCode.Day26;

import java.util.Stack;

public class Prob9 {

    public static int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
            for(char c : s.toCharArray()){
            if(c == '('){
                st.push(c);
            }else{
               if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
               }else{
                st.push(c);
               }
            }
        }
        return st.size();
    }
    public static void main(String[] args) {
        String s = "())";
        System.out.println(minAddToMakeValid(s));
    }
}