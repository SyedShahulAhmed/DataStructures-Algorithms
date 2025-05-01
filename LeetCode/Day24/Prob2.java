package LeetCode.Day24;

import java.util.Stack;

public class Prob2 {

    public static String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        
        System.out.println("Initial String: " + s); // To show the input string
        
        for (char c : s.toCharArray()) {
            System.out.println("Processing character: " + c); // Show each character being processed
            
            if (c == '(') {
                System.out.println("Character '(' found");
                // Only add '(' to sb if it's not an outermost '('
                if (!st.isEmpty()) {
                    sb.append(c);
                    System.out.println("Added '(' to sb: " + sb.toString());
                }
                st.push(c);
                System.out.println("Pushed '(' onto stack. Stack size: " + st.size() + st);
                
            } else { // when c == ')'
                System.out.println("Character ')' found");
                st.pop(); // Remove corresponding '('
                System.out.println("Popped '(' from stack. Stack size: " + st.size() + st);
                
                // Only add ')' to sb if it's not an outermost ')'
                if (!st.isEmpty()) {
                    sb.append(c);
                    System.out.println("Added ')' to sb: " + sb.toString());
                }
            }
        }
        
        System.out.println("Final String: " + sb.toString()); // Final result
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "(())";
        System.out.println("Result: " + removeOuterParentheses(s));  // Output: ()()()
    }
}
