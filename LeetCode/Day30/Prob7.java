package LeetCode.Day30;

import java.util.Arrays;

public class Prob7 {
    public static int heightChecker(int[] heights) {
        int c = 0;
        int res[] = new int[heights.length];
        for(int i= 0 ; i < heights.length; i++){
            res[i] = heights[i];
        }
        Arrays.sort(heights);
        for(int i = 0; i< heights.length; i++){
            if(res[i] != heights[i]){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int a[] = {1,1,4,2,1,3};
        System.out.println(heightChecker(a));
    }
}
