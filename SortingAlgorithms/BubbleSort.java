package SortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {
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
            for(int j = 0; j < num.length -1 -i;j++){
                if(num[j] > num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1]= temp;
                }
            }
        }
        PrintArr(num);
        sc.close();
    }
}
