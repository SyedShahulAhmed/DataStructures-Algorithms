package LeetCode.Day10;

import java.util.HashMap;

public class FindMaxLen {
    public static int Findmax(int nums[]){
        HashMap<Integer,Integer> max = new HashMap<>();
        max.put(0, -1);
        int maxLen = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += (nums[i] == 0) ? -1 : 1;
            if(max.containsKey(sum)){
                maxLen = Math.max(maxLen, i - max.get(sum));
            }else{
                max.put(sum, i);
            }
        }
        return maxLen;
        
    }
    public static void main(String[] args) {
        int arr[] = {0,1,1,1,1,1,0,0,0};
        System.out.println(Findmax(arr));
    }
}
