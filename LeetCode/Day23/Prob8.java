package LeetCode.Day23;

public class Prob8 {
    public static String truncateSentence(String s, int k) {
        String w[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < k ; i++){
            sb.append(w[i]);
            if(i < k - 1){
                sb.append(" ");
            }
        }
        return new String(sb);
    }
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        System.out.println(truncateSentence(s, 4));
    }
}
