package LeetCode.Day6;

import java.util.Arrays;

public class MissingNum {
    public static int Miss(int arr[]){
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            if(i != arr[i]){
                return i;
            }
        }
        return arr.length;
    }
    public static void main(String[] args) {
        int arr[] = {0,1};
        System.out.println(Miss(arr));
    }
}
