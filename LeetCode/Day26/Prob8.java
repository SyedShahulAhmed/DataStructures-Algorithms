package LeetCode.Day26;

import java.util.Stack;

public class Prob8 {

    public static String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '*'){
                st.pop();
            }else{
                st.push(c);
            }
        }
        for(char i : st){
            sb.append(i);
        }
       
        return st.toString().trim();
    }
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }
}