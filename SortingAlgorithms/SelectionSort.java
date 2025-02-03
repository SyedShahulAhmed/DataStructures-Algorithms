package SortingAlgorithms;

import java.util.Scanner;

public class SelectionSort {
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
        for(int i = 0; i < num.length - 1; i++){
            int MinValue = i;
            for(int j = i+1; j < num.length; j++){
                if(num[MinValue] > num[j]){
                    MinValue = j;
                }
            }
            int temp = num[MinValue];
            num[MinValue] = num[i];
            num[i] = temp;
        }
        PrintArr(num);
        sc.close();
    }
}
