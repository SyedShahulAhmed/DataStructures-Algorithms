package LeetCode.Day30;

import java.util.*;

public class Prob1 {
     public static void print(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> s = new  HashSet<>();
        int a = 0;
        int b = 0;
        int max = 0;
        int n = grid.length;
        int size = n * n;
        System.out.println(n);
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < n; j++){
                max = Math.max(max, grid[i][j]);
                if(s.contains(grid[i][j])){
                    a = grid[i][j];
                }else{
                    s.add(grid[i][j]);
                }
            }
        }
        int res[] = new int[2];
        res[0] = a;
        for(int i = 0; i <= size; i++){
            if(!s.contains(i)){
                b = i;
            }
        }
        res[1] = b;
        return res;
    }
    public static void main(String[] args) {
        int a[][] = {{1,3},{2,2}};
        print(findMissingAndRepeatedValues(a));
    }
}
