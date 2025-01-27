package ExerciseProblems;

import java.util.Scanner;

public class Problem2 {
    public static void OddNumbers(int n){
        for(int i =1; i <= n; i++){
            if(i%2 != 0){
                System.out.print(i + " ");
            }
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        OddNumbers(n);
        sc.close();
    }
}
