package LeetCode.Day11;

import java.util.Arrays;
import java.util.HashMap;

public class DistinctAvg {
    public static int DAvg(int nums[]) {
        Arrays.sort(nums);
        HashMap<Double,Integer> map = new HashMap<>();
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {  
            double res = (nums[l] + nums[r]) / 2.0;
            map.put(res, map.getOrDefault(res, 0) + 1); 
            l++; 
            r--; 
        }
      return map.size();
    }

    public static void main(String[] args) {
        int arr[] = {10,2,2,0,4,0};
        System.out.println(DAvg(arr));
    }
}
