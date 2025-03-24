package LeetCode.Day12;

import java.util.HashSet;

public class ContaineDup {
    public static boolean Dup(int nums[], int k){
        // int curr = 0;
        // for(int i = 0; i < k; i++){
        //     curr += nums[i];
        // }
        // for(int i = 1; i <= nums.length - k; i++){
        //     int nextcurr = curr - nums[i - 1] + nums[i+k-1];
        //     if(curr == nextcurr){
        //         return true;
        //     }
        // }
        // return false;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);

            if(i>= k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,0,1,1};
        System.out.println(Dup(arr, 2));
    }
}