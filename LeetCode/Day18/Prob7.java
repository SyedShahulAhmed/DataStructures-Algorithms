package LeetCode.Day18;

import java.util.*;

public class Prob7 {
    public static void printArr(int arr[]){
        for(int n : arr){
            System.out.print(n + " ");
        }
        System.out.println(" ");
    }
    public static int[] getSneakyNumbers(int[] nums) {
        int s = 0;
        int res[] = new int[nums.length];
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            if(set.contains(n)){
                res[s] = n;
                s++;
            }else{
                set.add(n);
            }
        }
        return Arrays.copyOf(res, s);
        
    }
    public static void main(String[] args) {
        int arr[] = {0,1,1,0};
        printArr(getSneakyNumbers(arr));
    }
}
