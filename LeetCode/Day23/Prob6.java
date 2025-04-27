package LeetCode.Day23;

import java.util.HashMap;

public class Prob6 {
    public static boolean divideArray(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int n : nums){
        //     map.put(n,map.getOrDefault(n, 0)+1);
        // }
        // for(int i : map.keySet()){
        //     if(map.get(i) % 2 != 0){
        //         return false;
        //     }
        // }
        // return true;
        int[] freq = new int[501];
        for(int i : nums){
            freq[i]++;
        }
        for(int j : freq){
            System.out.println(j);
        }
        for(int i : freq){
            if(i%2 != 0){
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        int arr[]= {3,2,2,3,2,2};
        System.out.println(divideArray(arr));
    }
}
