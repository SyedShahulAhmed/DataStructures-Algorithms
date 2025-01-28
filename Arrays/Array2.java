package Arrays;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows :-");
        int row = sc.nextInt();
        System.out.println("Enter Cols :-");
        int col = sc.nextInt();
        int matrix[][] = new int[row][col];

        for(int i = 0; i < row; i++){
            System.out.println("Enter row " + i);
            for(int j = 0; j < col; j++){
                System.out.println("Enter cell value of" + "["+i+"]"+"["+j+"]");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Searching Number :- ");
        int x = sc.nextInt();
        // System.out.println(matrix[1][1]);
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                // System.out.print(matrix[i][j] + " ");
                if(x == matrix[i][j]){
                    System.out.println("The Indices are :"+ "["+i+"]"+"["+j+"]");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
