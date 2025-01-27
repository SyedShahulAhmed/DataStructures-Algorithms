package ExerciseProblems;

import java.util.Scanner;

public class Problem8 {
    public static double Power(int x, int n){
        double result = Math.pow(x, n);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Power(a, b));
        sc.close();
    }
}
