package ExerciseProblems;

import java.util.Scanner;

public class Problem9 {
    public static int GCF(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(GCF(a,b));
        sc.close();
    }
}
