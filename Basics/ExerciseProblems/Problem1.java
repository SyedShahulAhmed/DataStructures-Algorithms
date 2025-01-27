package ExerciseProblems;

import java.util.Scanner;

public class Problem1 {
    public static float Average(float a,float b, float c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Average is" + Average(a, b, c));
        sc.close();
    }
}
