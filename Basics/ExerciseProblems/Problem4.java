package ExerciseProblems;

import java.util.Scanner;

public class Problem4 {
    public static double Circumference(int r){
        return 2*3.14*r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println(Circumference(r));
        sc.close();
    }
}
