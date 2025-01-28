package Arrays;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        // int[] Arr = new int[5];
        int Arr[] = new int[5];
        Arr[0] = 1;
        Arr[1] = 3;
        Arr[2] = 2;
        Arr[3] = 7;
        Arr[4] = 10;
        // System.out.println(Arr[0]);
        for(int i = 0;  i < Arr.length; i++){
            System.out.println(Arr[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size :-");
        int size = sc.nextInt();
        int nums[] = new int[size];
        for(int i = 0; i<size; i++){
            System.out.println("Enter number :" +  i);
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter Searching Number :-");
        int x = sc.nextInt();
        for(int i = 0; i < size; i++){
            if(x == nums[i]){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
