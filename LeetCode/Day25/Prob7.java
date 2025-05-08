package LeetCode.Day25;

import java.util.ArrayList;
import java.util.List;

public class Prob7 {
    public static List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> li = new ArrayList<>();
        int min = 0;
            for(int i : height){
                if(i > threshold){
                    li.add(i);
                    min++;
                }
                if(min == threshold) break;
                
            }
        return li;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(stableMountains(arr, 2));
    }
}
