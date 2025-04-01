package LeetCode.Day15;

public class Prob3 {
    public static void printArr(String nums[]){
        for(int i =0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println(" ");
    }
    public static int isPrefix(String s, String search){
        String[] w = s.split(" ");
        printArr(w);
        for(int i = 0; i < w.length; i++){
            if(w[i].startsWith(search)){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "i love eating burger";
        System.out.println(isPrefix(s, "bur"));
    }
}
