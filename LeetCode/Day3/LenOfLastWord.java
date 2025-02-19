package LeetCode.Day3;

public class LenOfLastWord {
    public static int lengthOfLastWord(String s) {
        int count = 0;
        char c[] = s.toCharArray();
        System.out.println(c);
        for(int i = 0; i < c.length - 1; i++){
            if(c[i] != ' '){
                count++;
            }else{
                count = 0;
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
