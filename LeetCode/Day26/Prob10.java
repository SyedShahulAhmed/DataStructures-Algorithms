package LeetCode.Day26;

import java.util.*;

public class Prob10 {
    public static int scoreOfParentheses(String s) {
        // int c = 0;
        // Stack<Character> st = new Stack<>();
        // for(char i : s.toCharArray()){
        //     if(i == '('){
        //         st.push(i);
        //     }else{
        //         if(!st.isEmpty() && st.peek() == '('){
        //             st.pop();
        //             c++;
        //         }else{
        //             st.push(i);

        //         }
        //     }
        // }
        // return c;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(char c : s.toCharArray()){
            if(c == '('){
                st.push(0);
            }else{
                int v = st.pop();
                int top = st.pop();
                st.push(top+Math.max(2*v,1));
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        String s = "(()(()))";
        System.out.println(scoreOfParentheses(s));
    }
}
