package LeetCode.Day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prob6 {
    public static int countPairs(List<Integer> nums, int target) {
    Collections.sort(nums); // Ensure the list is sorted
    int left = 0;
    int right = nums.size() - 1;
    int count = 0;
    while (left < right) {
        if (nums.get(left) + nums.get(right) < target) {
            count += (right - left);
            left++;
        } else {
            right--;
        }
    }
        return count;
    }
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        for(int i = 1; i <= 5; i++){
            li.add(i);
        }
        List<Integer> li1 = new ArrayList<>(List.of(-1, 1, 2, 3, 1));
        System.out.println(countPairs(li1, 2));
    }
}
