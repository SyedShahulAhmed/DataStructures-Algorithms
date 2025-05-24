package LeetCode.Day29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Prob5 {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i : nums){
            s.add(i);
        }
        List<Integer> li = new ArrayList<>();
        for(int i = 1; i <= nums.length; i++){
            if(!s.contains(i)){
                li.add(i);
            }
        }
        return li; 
    }
    public static void main(String[] args) {
        int ar[] = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(ar));
    }
}
