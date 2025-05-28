package LeetCode.Day29;

import java.util.Arrays;

public class Prob12 {
    public static void print(String s[]){
        for(String i : s){
            System.out.println(i + " ");
        }
        System.out.println(" ");
    }
    public static String[] findRelativeRanks(int[] score) {
        Arrays.sort(score);
        String res[] = new String[score.length];
        res[0] = "Gold Medal";
        res[1] = "Silver Medal";
        res[2] = "Bronze Medal";
        res[3] = "4";
        res[4] = "5";
        return res;
    }
    public static void main(String[] args) {
        int s[] = {5,4,3,2,1};
        print(findRelativeRanks(s));
    }
}
