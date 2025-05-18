package LeetCode.Day27;

import java.util.Arrays;

public class Prob11 {
    public static void print(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static void print(Integer arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static void print(String arr[]){
        for(String s : arr){
            System.out.println(s + " ");
        }
        System.out.println(" ");
    }
    public static String[] sortPeople(String[] names, int[] heights) {
        Integer[] indices = new Integer[names.length];
        for (int i = 0; i < names.length; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> heights[b] - heights[a]);
        print(indices);
        print(heights);
        String res[] = new String[names.length];
        for(int i = names.length - 1;i >= 0; i--){
            res[i] = names[indices[i]];
        }
        return res;
    }
    public static void main(String[] args) {
        String names[] = {"Mary","John","Emma"};
        int heights[] = {180,165,170};
        print(sortPeople(names, heights));
    }
}
