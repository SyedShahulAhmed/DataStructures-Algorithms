package ExerciseProblems;

import java.util.Scanner;

public class Problem10 {
    public static void Fibonnaci(int n) {
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < n; i++) { 
            int next = n1 + n2;
            System.out.print(" " + next);
            n1 = n2;
            n2 = next;
        }

        System.out.println();
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fibonnaci(n);
        sc.close();
    }
}
