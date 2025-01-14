package Patterns;

import java.util.Scanner;

class FloydTriangle {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();
        int num = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                num = num + 1;
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close(); 
    }
}
