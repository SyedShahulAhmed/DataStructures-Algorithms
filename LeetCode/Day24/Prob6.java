package LeetCode.Day24;

import java.util.*;

public class Prob6 {
    public static int rev(int n){
        int r = 0;
        while(n > 0){
            int d = n % 10;
            r = (r * 10) + d;
            n = n /10;
        }
        return r;
    }
    public static int countDistinctIntegers(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i : nums){
            int r = rev(i);
            s.add(i);
            s.add(r);
        }
        return s.size();
    }
    public static void main(String[] args) {
        int arr[] = {1,13,10,12,31};
        System.out.println(countDistinctIntegers(arr));
    }
}
