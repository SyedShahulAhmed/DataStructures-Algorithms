package LeetCode.Day4;

import java.util.Arrays;

public class SquareSorted {
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] Sorted(int arr[]){
        int s[] = new int[arr.length];
        Arrays.sort(arr);
        for(int i  = 0; i < arr.length; i++){
            s[i] = arr[i] * arr[i];
        }
        Arrays.sort(s);
        return s;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,2,1};
        printArr(Sorted(arr));
    }
}
