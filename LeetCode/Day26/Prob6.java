package LeetCode.Day26;

import java.util.Stack;

public class Prob6 {
    public static boolean validateStackSequences(int[] a, int[] b) {
       Stack<Integer> s = new Stack<>();
       int j = 0;
       for(int i : a){
            s.push(i);
            while(!s.isEmpty() && s.peek() == b[j]){
            s.pop();
            j++;
       }
        }
       return s.isEmpty();
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {4,5,3,2,1};
        System.out.println(validateStackSequences(arr1, arr2));
    }
}
