package LeetCode.Day24;

import java.util.ArrayList;
import java.util.List;

public class Prob9 {
    public static boolean div(int n){
        int num = n;
        while(n > 0){
            int d = n % 10;
            if(d== 0 ||num % d != 0){
                return false;
            }
            n = n / 10;
        }
        return true;
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> li = new ArrayList<>();
        while(left <= right){
            if(div(left)) li.add(left);
            left++;
        }
        return li;
    }
    public static void main(String[] args) {
        int l = 1;
        int r = 22;
        System.out.println(selfDividingNumbers(l, r));
    }
}
