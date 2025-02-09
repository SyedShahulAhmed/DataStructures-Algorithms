package Recursion.Recursion2;

public class KeypadComb {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
    "tu", "vwx", "yz"};

    public static void USequence(String s, int idx, String res){
        if(idx == s.length()){
            System.out.println(res);
            return;
        }
        char curr = s.charAt(idx);
        String mapped = keypad[curr - '0'];
        for(int i = 0; i < mapped.length(); i++){
            USequence(s, idx+1, res+mapped.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "23";
        USequence(str, 0, "");
    }
}
