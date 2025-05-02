package LeetCode.Day24;

import java.util.Stack;

public class Prob5 {
    public static int calPoints(String[] ops) {
        Stack<Integer> s = new Stack<>();

        for (String c : ops) {
            if (c.equals("C") && !s.isEmpty()) {
                    s.pop();
            } else if (c.equals("D") && !s.isEmpty()) {
                    s.push(s.peek() * 2);

            } else if (c.equals("+") && s.size() >= 2) {
                    int last = s.pop();
                    int secondLast = s.peek();
                    s.push(last); // restore
                    s.push(last + secondLast);
            } else {
                // Valid number
                s.push(Integer.parseInt(c));
            }
        }

        int sum = 0;
        for (int score : s) {
            sum += score;
        }

        return sum;
    }

    public static void main(String[] args) {
        String[] w = {"5", "2", "C", "D", "+"};
        System.out.println(calPoints(w)); // Output: 30
    }
}
