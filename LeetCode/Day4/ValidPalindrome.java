package LeetCode.Day4;

public class ValidPalindrome {
    public static String Clean(String s){
        String rev = "";
        for(char n : s.toCharArray()){
            if(Character.isLetter(n)){
                rev += n;
            }
        }
        return rev.toLowerCase();
    }
    
    public static boolean isPalindrome(String s) {
        char c[] = Clean(s).toCharArray();
        for(int i = 0; i < c.length - 1; i++){
            if(c[i] != c[c.length - i -1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
        System.out.println(Clean(s));
    }  
}
