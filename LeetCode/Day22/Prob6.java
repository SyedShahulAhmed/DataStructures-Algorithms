package LeetCode.Day22;

import java.util.Arrays;

public class Prob6 {
    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int s1 = 0;
        for(int i = 0; i < seats.length; i++){
            s1 += Math.abs(seats[i] - students[i]);
            
        }
        return s1;
    }
    public static void main(String[] args) {
        int s1[]= {3,1,5};
        int s2[]= {2,7,4};
        System.out.println(minMovesToSeat(s1, s2));
    }
}
