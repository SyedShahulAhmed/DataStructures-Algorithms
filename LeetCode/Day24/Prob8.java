package LeetCode.Day24;

public class Prob8 {
    public static int countOperations(int num1, int num2) {
        int c = 0;
        while (num1 != 0 && num2 != 0) {
            if (num1 < num2) {
                num2 -= num1;

            } else if (num1 > num2) {
                num1 -= num2;

            } else {
                num1 = num1 - num2;

            }
            c++;
        }
        return c;

    }

    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 3;
        System.out.println(countOperations(n1, n2));
    }
}
