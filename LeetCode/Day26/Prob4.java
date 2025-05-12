package LeetCode.Day26;

import java.util.Stack;

public class Prob4 {
    public static void printArr(int n[]){
        for(int i : n){
            System.out.println(i);
        }
        System.out.println(" ");
    }
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> s = new Stack<>();
        int res[] = new int[n];
        for(int i = 2* n-1; i>= 0; i--){
            int num = nums[i%n];
            while(!s.isEmpty() && s.peek() <= num){
                s.pop();
            }
                if(i < n){
                    res[i] = s.isEmpty() ? -1 : s.peek();
                }
            s.push(num);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        printArr(nextGreaterElements(arr));
    }
}
