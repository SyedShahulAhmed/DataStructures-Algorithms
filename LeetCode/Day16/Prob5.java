package LeetCode.Day16;

public class Prob5 {
    public static int Score(String str){
        int s = 0;
        char c[] = str.toLowerCase().toCharArray();
        for(int i= 0; i < c.length - 1; i++){
            s += Math.abs(c[i] - c[i+1]);
        }
        return s;
    }
    public static void main(String[] args) {
        String str = "zaz";
        System.out.println(Score(str));
    }
}
