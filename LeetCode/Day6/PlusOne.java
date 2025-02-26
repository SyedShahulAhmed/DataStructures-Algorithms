package LeetCode.Day6;
// // public class PlusOne {
// //     public static void printArr(int arr[]){
// //         for(int i = 0; i < arr.length; i++){
// //             System.out.print(arr[i] + "-");
// //         }
// //     }
// //     public static int[] IntArr(int a){
// //         String str = String.valueOf(a);
// //         int res[] = new int[99999];

import java.math.BigInteger;

// //         for(int i = 0; i < str.length(); i++){
// //             res[i] = str.charAt(i) - '0';
// //         }
// //         return res;
// //     }
// //     public static int[] Plus(int arr[]){
// //     int n = arr.length;
// //        StringBuilder s = new StringBuilder(999999999);
// //        for(int i = 0; i < n; i++){
// //             s.append(arr[i]);
// //        }
// //        int res = Integer.parseInt(s.toString()) +  1;
// //        System.out.println(res);
// //        return IntArr(res);
// //     }
// //     public static void main(String[] args) {
// //         int arr[] = {9,8,7,6,5,4,3,2,1,0};
// //         printArr(Plus(arr));
// //     }
// import java.util.Arrays;

// public class PlusOne {
//     public static void printArr(int arr[]){
//         for (int num : arr) {
//             System.out.print(num + "-");
//         }
//         System.out.println(); // New line for clarity
//     }

//     public static int[] plusOne(int arr[]) {
//         int n = arr.length;

//         // Traverse from last digit to first
//         for (int i = n - 1; i >= 0; i--) {
//             if (arr[i] < 9) {
//                 arr[i]++;  // Simply increment and return if no carry
//                 return arr;
//             }
//             arr[i] = 0; // If 9, set it to 0 and continue
//         }

//         // If all digits were 9, we need an extra digit at the start
//         int[] newArr = new int[n + 1];
//         newArr[0] = 1; // The new most significant digit is 1 (e.g., 999 → 1000)
//         return newArr;
//     }

//     public static void main(String[] args) {
//         int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0}; // Input array
//         printArr(plusOne(arr));

//         int arr2[] = {9, 9, 9}; // Another test case (999 → 1000)
//         printArr(plusOne(arr2));
//     }


public class PlusOne {
    public static int[] Plus(int digits []){
        // StringBuilder s = new StringBuilder();
        // for(int i = 0; i < arr.length; i++){
        //     s.append(arr[i]);
        // }
        // BigInteger n = new BigInteger(s.toString()).add(BigInteger.ONE);
        // String a = n.toString();
        // int res[] = new int[a.length()];
        // for(int i = 0; i < a.length(); i++){
        //     res[i] = a.charAt(i) - '0';
        //     System.out.println(a.charAt(i));
        // }
        // return res;
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
    public static void pr(int arr[]){
        for(int n : arr){
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,9,9,9};
        pr(Plus(arr));
    }
}

