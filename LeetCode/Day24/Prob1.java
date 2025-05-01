package LeetCode.Day24;

import java.util.Stack;

public class Prob1 {

    public static void printArr(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            System.out.println("\nCurrent Price: " + prices[i]);
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int idx = stack.pop();
                System.out.println("Applying discount: " + prices[idx] + " - " + prices[i]);
                prices[idx] -= prices[i];
                System.out.println("Price at index " + idx + " updated to: " + prices[idx]);
            }
            System.out.println("Pushing index " + i + " onto the stack");
            stack.push(i);
            System.out.println("Current Stack: " + stack);
        }
        return prices;
    }

    public static void main(String[] args) {
        int[] prices = {8, 4, 6, 2, 3};
        printArr(finalPrices(prices));
    }
}
