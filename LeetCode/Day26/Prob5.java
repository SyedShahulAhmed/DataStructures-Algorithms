package LeetCode.Day26;


public class Prob5 {
    public static String smallestNumber(String p) {
        StringBuilder sb = new StringBuilder();
        StringBuilder stack = new StringBuilder();
        for(int i = 0; i <= p.length(); i++){
           stack.append((char) ('1'+i));
           if(i == p.length() || p.charAt(i) == 'I'){
            sb.append(stack.reverse());
            stack = new StringBuilder();
           }
        }
        return sb.toString();
    }
   
    public static void main(String[] args) {
        String s = "IIIDIDDD";
        System.out.println(smallestNumber(s));
    }
}
