package LeetCode.Day20;

public class Prob6 {
    public static void print(int nums[]){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println(" ");
    }
    public static int[] minOperations(String boxes) {
        int res[] = new int[boxes.length()];
        for(int i = 0,o = 0,c = 0; i < boxes.length(); i++){
            res[i]  += o;
            c += boxes.charAt(i) == '1' ? 1 : 0;
            o += c;
        }
        for(int i = boxes.length() - 1,o=0,c = 0; i>= 0; --i){
            res[i]  += o;
            c += boxes.charAt(i) == '1' ? 1 : 0;
            o += c;
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "110";
        print(minOperations(s));
    }
}