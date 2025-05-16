package LeetCode.Day27;

import java.util.*;

public class Prob4 {
    public static void print(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int res[] = new int[nums.length];
        List<Integer> li = new ArrayList<>();
        for(int i = 0 ; i < nums.length; i++){
            li.add(index[i], nums[i]);
        }
        for(int i = 0; i < li.size(); i++){
            res[i] = li.get(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr1[]= {0,1,2,3,4};
        int arr2[]= {0,1,2,2,1};
        print(createTargetArray(arr1, arr2));
    }
}
