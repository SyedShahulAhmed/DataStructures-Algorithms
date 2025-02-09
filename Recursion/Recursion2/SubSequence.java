package Recursion.Recursion2;

public class SubSequence {
    public static void Sequence(String s, int idx, String res){
        if(idx == s.length()){
            System.out.println(res);
            return;
        }
        char curchar = s.charAt(idx);
        Sequence(s, idx+1, res + curchar);
        Sequence(s, idx+1, res);
    }
    public static void main(String[] args) {
        String str = "abc";
        Sequence(str, 0, "");
    }
}
