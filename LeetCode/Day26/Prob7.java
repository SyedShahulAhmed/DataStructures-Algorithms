package LeetCode.Day26;

import java.util.ArrayList;
import java.util.List;

public class Prob7 {
    public static List<String> buildArray(int[] a, int n) {
        List<String> li = new ArrayList<>();
        int num = 1;
        int i = 0;
        while(i < a.length && num <= n){
            li.add("Push");
            if(a[i] == num){
                i++;
            }else{
                li.add("Pop");
            }
            num++;
        }
        return li;
    }
    public static void main(String[] args) {
        int a[] = {1,3};
        System.out.println(buildArray(a, 3));
    }
}
