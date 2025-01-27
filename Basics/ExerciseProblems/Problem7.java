package ExerciseProblems;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many numbers:");
        int total = sc.nextInt();

        int P = 0;
        int N = 0;
        int Z = 0;

        System.out.println("Enter the numbers:");
        for (int i = 1; i <= total; i++) {
            int n = sc.nextInt();
            if (n > 0) {
                P++;
            } else if (n < 0) {
                N++;
            } else {
                Z++;
            }
        }

        System.out.println("Positive numbers: " + P);
        System.out.println("Negative numbers: " + N);
        System.out.println("Zeroes: " + Z);

        sc.close();
    }
}
