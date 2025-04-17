package LeetCode.Day20;

public class Prob2 {

    public static int balancedStringSplit(String s) {
        int res=0,c = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'L'){
                c += 1;
            }else{
                c -= 1;
            }
            if(c == 0) res++;
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }
}
