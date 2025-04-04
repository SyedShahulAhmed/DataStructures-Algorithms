package LeetCode.Day16;

import java.util.HashSet;

public class Prob1 {
    public static int missNum(int nums[]){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int m = 1;
        while(set.contains(m)){
            m++;
        }
        return m;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,7,8};
        System.out.println(missNum(arr));
    }
}
