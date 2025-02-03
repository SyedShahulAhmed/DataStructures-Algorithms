package SortingAlgorithms;

import java.util.Scanner;

public class InsertionSort {
    public static void PrintArr(int arr[]){
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
      public static void main(String[] args) {
        // Time Complexity = O(n^2)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size :-");
        int size = sc.nextInt();
        int num[] = new int[size];
        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        for(int i = 1; i < num.length; i++){
            int cur = num[i];
            int j = i - 1;
            while(j >= 0 && cur < num[j]){
                num[j+1] = num[j];
                j--;
            }
            num[j+1] = cur;
        }
        PrintArr(num);
        sc.close();
      }
    
}
