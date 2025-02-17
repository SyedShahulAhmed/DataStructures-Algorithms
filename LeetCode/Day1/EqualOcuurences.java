package LeetCode.Day1;

public class EqualOcuurences {
    public static boolean Occurences(String s1){
        char c[] = s1.toCharArray();
        int count = 0;
        for(int i = 0; i < c.length-1 ; i++){
            if(c[i] == c[i+1]){
                count++;
            }else{
                count--;
            }
        }
        if(count %2 != 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "abacbc";
        System.out.println(Occurences(s));
    }
}
