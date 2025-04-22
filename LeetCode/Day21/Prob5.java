package LeetCode.Day21;

public class Prob5 {
    public static void print(int nums[]){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println(" ");
    }
    public static int[] findArray(int[] pref) {
        int og[] = new int[pref.length];
        og[0] = pref[0];
        for(int i = 1; i < pref.length; i++){
            og[i] = pref[i-1] ^ pref[i];
        }
        return og;
    }
    public static void main(String[] args) {
        int p[] = {5,2,0,3,1};
        print(findArray(p));
    }
}
