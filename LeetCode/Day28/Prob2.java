package LeetCode.Day28;

public class Prob2 {
    public static String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for(char i : s.toCharArray()){
            if(i >= 'A' && i <= 'Z'){
                int num = i + 32;
                sb.append((char) num);
            }else{
                sb.append(i);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "HELLO";
        System.out.println(toLowerCase(s));
    }
}
