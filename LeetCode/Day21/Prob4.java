package LeetCode.Day21;

import java.util.ArrayList;
import java.util.List;

public class Prob4 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int n : candies){
            if(max < n){
                max = n;
            }
        }
        List<Boolean> li = new ArrayList<>();
        for(int i = 0; i< candies.length; i++){
            if(candies[i] + extraCandies >= max){
                li.add(true);
            }else{
                li.add(false);
            }
        }
        return li;
    }
    public static void main(String[] args) {
        int []candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}
