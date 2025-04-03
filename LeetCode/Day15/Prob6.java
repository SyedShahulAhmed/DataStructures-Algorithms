package LeetCode.Day15;

public class Prob6 {
    public static void printArr(String nums[]){
        for(int i =0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println(" ");
    }
    public static boolean isPrefix(String s, String words[]){
        String w[] = s.split("");
        printArr(w);
        for(int i = 0; i < w.length; i++){
            if(w[i] != words[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "iloveleetcode";
        String w[] = {"i","love","leetcode","apples"};
        System.out.println(isPrefix(s, w));
    }
}
